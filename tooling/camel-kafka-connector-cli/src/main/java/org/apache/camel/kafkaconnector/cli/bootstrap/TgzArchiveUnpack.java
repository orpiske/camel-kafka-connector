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
import java.io.IOException;

import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;

public class TgzArchiveUnpack {
    /**
     * Default file type extension
     */
    public static final String TGZ_EXTENSION = ".gz";

    private String replaceCompressedFileExtension(final String originalName) {
        if (originalName.endsWith(".gz")) {
            return originalName.replaceAll(".gz", "");
        }

        return originalName;
    }


    /*
     * (non-Javadoc)
     * @see org.ssps.common.archive.Archive#unpack(java.lang.String, java.lang.String)
     */
    public long unpack(String source, String destination) throws IOException {
        File compressedFileSource = new File(source);

        String uncompressedArchiveFileName = destination
                + File.separator
                + replaceCompressedFileExtension(compressedFileSource.getName());

        File uncompressedArchiveFile = new File(uncompressedArchiveFileName);
        if (uncompressedArchiveFile.exists()) {
            if (!uncompressedArchiveFile.delete()) {
                throw new IOException(String.format("A previously decompressed file exists: %s and couldn't be deleted",
                        uncompressedArchiveFile));
            }
        }

        try {
            CompressedArchiveUtils.gzDecompress(compressedFileSource, uncompressedArchiveFile);
        } catch (IOException e) {
            throw new IOException("Unable to decompress archive file: I/O error", e);
        }

        File destinationDirectory = new File(destination);

        try {
            return TarArchiveUtils.unpack(uncompressedArchiveFile, destinationDirectory,
                    ArchiveStreamFactory.TAR);
        } catch (ArchiveException e) {
            e.printStackTrace();
        } finally {
            if (uncompressedArchiveFile.exists()) {
                if (!uncompressedArchiveFile.delete()) {
                    uncompressedArchiveFile.deleteOnExit();
                }
            }
        }

        return 0;
    }
}
