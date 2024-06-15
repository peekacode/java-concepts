package com.pkp.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryScanRunner {

    public static void main(String[] args) throws IOException {

        Path currentDirectory = Paths.get(".");
        //List of Directories
        //Files.list(currentDirectory).forEach(System.out::println);

        Files.walk(currentDirectory,4)
                .filter(path -> String.valueOf(path).contains("*.*"))
             .forEach(System.out::println);
    }
}
