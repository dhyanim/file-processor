package com.mdhyani.fileprocessor.writer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriter {

    public void writeToFile(String fileContent, String filePath) {
        try {
            Path path = Paths.get(filePath);
            byte[] strToBytes = fileContent.getBytes();
            Files.write(path, strToBytes);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Unable tpo write file", ex);
        }
    }
}
