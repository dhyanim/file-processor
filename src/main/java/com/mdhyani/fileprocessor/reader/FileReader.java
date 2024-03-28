package com.mdhyani.fileprocessor.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {

    public String readFile(String filePath)  {
        Path path = Paths.get(filePath);
        String fileContent = null;
        try {
            fileContent = Files.readAllLines(path).get(0);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Unable to read file", ex);
        }
        return fileContent;
    }
}
