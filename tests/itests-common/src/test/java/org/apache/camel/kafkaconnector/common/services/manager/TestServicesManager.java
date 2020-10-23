/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.kafkaconnector.common.services.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class TestServicesManager implements BeforeAllCallback, BeforeTestExecutionCallback, AfterAllCallback, AfterTestExecutionCallback {
    private static final Logger LOG = LoggerFactory.getLogger(TestServicesManager.class);

    private static TestServicesManager instance;
    private List<BeforeTestExecutionCallback> beforeTestList = new ArrayList<>();
    private List<BeforeAllCallback> beforeAllCallbackList = new ArrayList<>();

    public synchronized static TestServicesManager getInstance() {
        if (instance == null) {
            instance = new TestServicesManager();
        }

        return instance;
    }

    protected Boolean asyncStart(BeforeTestExecutionCallback callback, ExtensionContext context) {
        try {
            LOG.debug("Dispatching async service start");
            callback.beforeTestExecution(context);
            LOG.debug("Async service start completed successfully");
            return true;
        } catch (Throwable t) {
            LOG.debug("Async service start failed: {}", t.getMessage(), t);
            return false;
        }
    }

    @Override
    public void afterAll(ExtensionContext context) throws Exception {

    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {

    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {

    }

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        List<Future<Boolean>> futures = new ArrayList<>();
        ExecutorService stealingService = Executors.newWorkStealingPool();

        for (BeforeTestExecutionCallback callback : beforeTestList) {
            Future<Boolean> future = stealingService.submit(() -> asyncStart(callback, context));

            futures.add(future);
        }

        stealingService.awaitTermination(1, TimeUnit.MINUTES);
        for (Future<Boolean> future : futures) {
            if (future.get() != true) {
                LOG.warn("The service did not start successfully");
            }
        }
    }
}
