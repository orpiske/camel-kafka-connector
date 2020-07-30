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

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.camel.kafkaconnector.cli.bootstrap.ConnectorPackageInfo;
import org.apache.camel.kafkaconnector.cli.bootstrap.DownloadStep;
import org.apache.camel.kafkaconnector.cli.bootstrap.FindPackageStep;
import org.apache.camel.kafkaconnector.cli.bootstrap.PackageInfo;
import org.apache.camel.kafkaconnector.cli.bootstrap.UnpackStep;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Bootstrap implements Command {
    private CommandLine cmdLine;

    private List<String> connectorPackages;
    private String connectorName;
    private String connectorVersion;
    private String mirror;
    private String destination;

    public Bootstrap(String[] args) {
        CommandLineParser parser = new DefaultParser();

        Options options = new Options();

        options.addOption("h", "help", false, "prints the help");
        options.addOption(null, "connector-packages", true, "command-separate path(s) to local connector file(s)");
        options.addOption(null, "connector-name", true, "the connector name");
        options.addOption(null, "connector-version", true, "the connector version");
        options.addOption(null, "mirror", true, "the mirror where to download the connector package");
        options.addOption(null, "destination", true, "the directory where to unpack the connector");


        try {
            cmdLine = parser.parse(options, args);
        } catch (ParseException e) {
            System.err.println(e.getMessage());
            help(options, -1);
        }

        String pathList = cmdLine.getOptionValue("connector-packages");
        if (pathList != null && !pathList.isEmpty()) {
            connectorPackages = Arrays.asList(pathList.split(","));
        } else {
            connectorName = cmdLine.getOptionValue("connector-name");
            connectorVersion = cmdLine.getOptionValue("connector-version");
            mirror = cmdLine.getOptionValue("mirror");
        }

        destination = cmdLine.getOptionValue("destination");
    }

    @Override
    public int run() {
        FindPackageStep findPackageStep = new FindPackageStep(connectorName, connectorVersion, mirror);
        PackageInfo packageInfo;

        try {
            packageInfo = findPackageStep.step();
        } catch (Exception e) {
            System.err.println(e.getMessage());

            return 1;
        }


        DownloadStep downloadStep = new DownloadStep(destination);
        ConnectorPackageInfo connectorPackageInfo;

        try {
            connectorPackageInfo = downloadStep.step(packageInfo);
        } catch (Exception e) {
            System.err.println(e.getMessage());

            return 2;
        }

        UnpackStep unpackStep = new UnpackStep(connectorPackageInfo.getFile(), destination);
        try {
            unpackStep.step();
        } catch (IOException e) {
            e.printStackTrace();

            return 1;
        }

//        for (String connector : connectorPackages) {
//            UnpackStep unpackStep = new UnpackStep(connector, destination);
//
//            try {
//                unpackStep.step();
//            } catch (IOException e) {
//                e.printStackTrace();
//
//                return 1;
//            }
//        }

        // Cleanup

        return 0;
    }
}
