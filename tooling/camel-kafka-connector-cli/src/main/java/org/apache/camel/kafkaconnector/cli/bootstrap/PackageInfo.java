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

public class PackageInfo {

    private final String group;
    private final String artifact;
    private final String version;

    private String url;
    private String name;

    public PackageInfo(String group, String artifact, String version) {
        this.group = group;
        this.artifact = artifact;
        this.version = version;

        String path = group.replace(".", "/");

        name = String.format("%s-%s-package.tar.gz", artifact, version);

        url = String.format("%s/classic/remotecontent?filepath=%s/%s/%s/%s-%s-package.tar.gz",
                FindPackageStep.DEFAULT_SEARCH_MIRROR, path,
                artifact, version, artifact, version);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
