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

package org.apache.camel.kafkaconnector.common.services.camel;

import org.apache.camel.model.ModelCamelContext;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public interface CamelContextService<T extends CamelContextConfigurator> extends BeforeAllCallback, BeforeTestExecutionCallback, AfterAllCallback, AfterTestExecutionCallback {
    @Override
    default void afterAll(ExtensionContext extensionContext) throws Exception {

    }

    @Override
    default void afterTestExecution(ExtensionContext extensionContext) throws Exception {

    }

    @Override
    default void beforeAll(ExtensionContext extensionContext) throws Exception {

    }

    @Override
    default void beforeTestExecution(ExtensionContext extensionContext) throws Exception {

    }

    ModelCamelContext getContext();

    T getConfigurator();
}
