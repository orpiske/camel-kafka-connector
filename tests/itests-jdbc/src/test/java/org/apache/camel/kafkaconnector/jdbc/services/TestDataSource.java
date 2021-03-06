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

package org.apache.camel.kafkaconnector.jdbc.services;

import org.apache.camel.test.infra.jdbc.common.JDBCProperties;
import org.postgresql.ds.PGSimpleDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestDataSource extends PGSimpleDataSource {
    private static final Logger LOG = LoggerFactory.getLogger(TestDataSource.class);

    private static final String URL;

    static {
        URL = System.getProperty(JDBCProperties.JDBC_CONNECTION_URL);
    }

    public TestDataSource() {
        super();
        setUrl(URL);

        setUser("ckc");
        setPassword("ckcDevel123");

    }
}
