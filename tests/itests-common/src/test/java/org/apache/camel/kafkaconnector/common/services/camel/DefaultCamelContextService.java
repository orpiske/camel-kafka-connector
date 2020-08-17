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

import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.kafkaconnector.common.utils.TestUtils;
import org.apache.camel.model.ModelCamelContext;
import org.junit.jupiter.api.extension.ExtensionContext;

public class DefaultCamelContextService<T extends CamelContextConfigurator> implements CamelContextService<T> {
    private final DefaultCamelContext context = new DefaultCamelContext();
    private final T camelContextConfigurator;

    public DefaultCamelContextService(T camelContextConfigurator) {
        this.camelContextConfigurator = camelContextConfigurator;
    }

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
        context.stop();
    }

    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) throws Exception {
        camelContextConfigurator.configureContext(context);

        context.start();
        TestUtils.waitFor(() -> context.isStarted());
    }

    @Override
    public ModelCamelContext getContext() {
        return context;
    }

    @Override
    public T getConfigurator() {
        return camelContextConfigurator;
    }
}
