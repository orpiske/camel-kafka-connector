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

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MavenSearchResponse {
    @JsonIgnore
    private Object responseHeader;

    private MavenSearchResponseData response;

    @JsonIgnore
    private Object spellcheck;

    public Object getResponseHeader() {
        return responseHeader;
    }

    public void setResponseHeader(Object responseHeader) {
        this.responseHeader = responseHeader;
    }

    public MavenSearchResponseData getResponse() {
        return response;
    }

    public void setResponse(MavenSearchResponseData response) {
        this.response = response;
    }

    public Object getSpellcheck() {
        return spellcheck;
    }

    public void setSpellcheck(Object spellcheck) {
        this.spellcheck = spellcheck;
    }
}
