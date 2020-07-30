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

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.ws.rs.core.Response;

import org.apache.commons.io.IOUtils;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.http.HttpStatus;

public class DownloadStep {
    private final String destinationDirectory;

    public DownloadStep(String destinationDirectory) {
        this.destinationDirectory = destinationDirectory;
    }

    public ConnectorPackageInfo step(PackageInfo packageInfo) throws Exception {
        WebClient webClient = HTTPEasy.getClient(packageInfo.getUrl());

        WebClient.getConfig(webClient).getHttpConduit().getClient().setAutoRedirect(true);

        Response response = webClient.get();

        if (response.getStatusInfo().getStatusCode() != HttpStatus.SC_OK) {
            throw new Exception("Unable to download artifact: " + response.getStatusInfo().getReasonPhrase());
        }


        File file = new File(destinationDirectory, packageInfo.getName());

        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        if (file.exists()) {
            file.delete();
        }


        InputStream inputStream = (InputStream) response.getEntity();
        OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file));

        try {
            IOUtils.copyLarge(inputStream, outputStream);

            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ConnectorPackageInfo(packageInfo, file);
    }
}
