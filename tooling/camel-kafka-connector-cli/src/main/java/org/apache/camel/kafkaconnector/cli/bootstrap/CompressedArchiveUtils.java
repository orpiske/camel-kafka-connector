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

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.utils.IOUtils;

public class CompressedArchiveUtils {

    /**
     * Default constructor
     */
    private CompressedArchiveUtils() {}

    /**
     * Prepares the destination directory by creating directories if needed
     * @param destination The destination directory
     * @throws IOException
     */
    public static void prepareDestination(File destination) throws IOException {
        File parent = destination.getParentFile();

        if (!parent.exists()) {
            if (!parent.mkdirs()) {
                throw new IOException("Unable to create destination directory: " + parent.getPath());
            }
        }
    }



    /**
     * Decompress a file
     * @param source the source file to be uncompressed
     * @param destination the destination directory
     * @return the number of bytes read
     * @throws IOException for lower level I/O errors
     */
    public static long gzDecompress(File source, File destination) throws IOException {
        FileOutputStream out;

        prepareDestination(destination);
        out = new FileOutputStream(destination);

        FileInputStream fin = null;
        BufferedInputStream bin = null;
        GzipCompressorInputStream gzIn = null;

        try {
            fin = new FileInputStream(source);
            bin = new BufferedInputStream(fin);
            gzIn = new GzipCompressorInputStream(bin);

            IOUtils.copy(gzIn, out);

            gzIn.close();

            fin.close();
            bin.close();
            out.close();
        } catch (IOException e) {
            IOUtils.closeQuietly(out);

            IOUtils.closeQuietly(fin);
            IOUtils.closeQuietly(bin);
            IOUtils.closeQuietly(gzIn);

            throw e;
        }

        return gzIn.getBytesRead();
    }
}
