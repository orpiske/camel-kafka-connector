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

package org.apache.camel.kafkaconnector.cli.bootstrap;

import java.io.InputStream;

import javax.ws.rs.core.Response;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.MappingJsonFactory;

public class FindPackageStep {
    public static final String DEFAULT_SEARCH_MIRROR = "http://search.maven.org";
    private final String connectorName;
    private final String connectorVersion;
    private final String mirror;

    private final String groupName = "org.apache.camel.kafkaconnector";


    public FindPackageStep(String connectorName, String connectorVersion, String mirror) {
        this.connectorName = connectorName;
        this.connectorVersion = connectorVersion;

        if (mirror != null) {
            this.mirror = mirror;
        } else {
            this.mirror = DEFAULT_SEARCH_MIRROR;
        }

    }

    public PackageInfo step() throws Exception {
        String request = String.format("%s/solrsearch/select?wt=json&q=g:\"%s\"+AND+a:\"%s\"", mirror,
                groupName, connectorName);

        Response response = HTTPEasy.getClient(request).get();

        MappingJsonFactory factory = new MappingJsonFactory();
        InputStream stream = (InputStream) response.getEntity();

        JsonParser parser = factory.createParser(stream);

        MavenSearchResponse mavenSearchResponse = parser.readValueAs(MavenSearchResponse.class);

        int numFound = mavenSearchResponse.getResponse().getNumFound();
        if (numFound == 0) {
            throw new Exception("No artifacts found for that component");
        } else {
            if (numFound > 1) {
                System.err.println("There are too many artifacts: " + numFound + " artifacts found: ");
                for (MavenSearchResponseDoc doc : mavenSearchResponse.getResponse().getDocs()) {
                    System.err.printf("%s:%s%n", doc.getId(), doc.getLatestVersion());
                }

                throw new Exception("Too many artifacts found");
            }
        }

        String group = mavenSearchResponse.getResponse().getDocs().get(0).getGroup();
        String artifact = mavenSearchResponse.getResponse().getDocs().get(0).getArtifact();
        String version  = mavenSearchResponse.getResponse().getDocs().get(0).getLatestVersion();


        return new PackageInfo(group, artifact, version);
    }
}
