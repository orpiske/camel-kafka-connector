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

package org.apache.camel.kafkaconnector.cli.main;

import static java.util.Arrays.copyOfRange;

import org.apache.camel.kafkaconnector.cli.commands.Bootstrap;
import org.apache.camel.kafkaconnector.cli.commands.Command;

public class Main {
    private static final String VERSION = "0.4.0";

    /**
     * Prints the help for the action and exit
     * @param code the exit code
     */
    private static void help(int code) {
        System.out.println("camel-kafka-connector " + VERSION + "\n");
        System.out.println(String.format("Usage: camel-kafka-connector <command>\n"));

        System.out.println("Actions:");
        System.out.println("   bootstrap");
        System.out.println("----------");
        System.out.println("   help");
        System.out.println("   --version");

        System.exit(code);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("The command is missing!");
            help(1);
        }

        String first = args[0];
        String[] newArgs = copyOfRange(args, 1, args.length);

        if (first.equals("help")) {
            help(1);
        }

        Command command;
        switch (first) {
            case "bootstrap": {
                command = new Bootstrap(newArgs);
                break;
            }
            default: {
                help(1);
                return;
            }
        }

        System.exit(command.run());
    }
}
