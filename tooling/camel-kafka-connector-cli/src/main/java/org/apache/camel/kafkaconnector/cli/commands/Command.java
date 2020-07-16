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

package org.apache.camel.kafkaconnector.cli.commands;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;

public interface Command {

    /**
     * Prints the help for the action and exit
     * @param options the options object
     * @param code the exit code
     */
    default void help(final Options options, int code) {
        HelpFormatter formatter = new HelpFormatter();

        formatter.printHelp("camel-kafka-connector-cli", options);
        System.exit(code);
    }

    int run();
}
