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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.utils.IOUtils;

public abstract class TarArchiveUtils {

    /**
     * Default file type extension
     */
    public static final String TAR_EXTENSION = ".tar";


    /**
     * Unpacks a file
     * @param source source file
     * @param destination destination directory. If the directory does not
     * exists, it will be created
     * @param format archive format
     * @return the number of bytes processed
     * @throws ArchiveException
     * @throws IOException
     */
    public static long unpack(File source, File destination, String format) throws ArchiveException, IOException {

        if (!destination.exists()) {
            if (!destination.mkdirs()) {
                throw new IOException("Unable to create destination directory: "
                        + destination.getPath());
            }
        }
        else {
            if (!destination.isDirectory()) {
                throw new IOException(String.format("The provided destination %s is not a directory",
                        destination.getPath()));
            }
        }

        ArchiveStreamFactory factory = new ArchiveStreamFactory();

        FileInputStream inputFileStream = new FileInputStream(source);

        ArchiveInputStream archiveStream;
        try {
            archiveStream = factory.createArchiveInputStream(
                    format, inputFileStream);
        } catch (ArchiveException e) {
            IOUtils.closeQuietly(inputFileStream);
            throw e;
        }

        OutputStream outStream = null;
        try {
            TarArchiveEntry entry = (TarArchiveEntry) archiveStream.getNextEntry();

            while (entry != null) {
                File outFile = new File(destination, entry.getName());

                if (entry.isDirectory()) {
                    if (!outFile.exists()) {
                        if (!outFile.mkdirs()) {
                            throw new IOException(String.format("Unable to create directory: %s", outFile.getPath()));
                        }
                    }
                } else {
                    File parent = outFile.getParentFile();
                    if (!parent.exists()) {
                        if (!parent.mkdirs()) {
                            throw new IOException(String.format("Unable to create parent directories: %s", parent.getPath()));
                        }
                    }

                    outStream = new FileOutputStream(outFile);

                    IOUtils.copy(archiveStream, outStream);
                    outStream.close();
                }
                int mode = entry.getMode();

                PermissionsUtils.setPermissions(mode, outFile);

                entry = (TarArchiveEntry) archiveStream.getNextEntry();
            }

            inputFileStream.close();
            archiveStream.close();
        } finally {
            IOUtils.closeQuietly(outStream);
            IOUtils.closeQuietly(inputFileStream);
            IOUtils.closeQuietly(archiveStream);
        }

        return archiveStream.getBytesRead();
    }
}
