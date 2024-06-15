package com.pkp.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

    public static void main(String[] args) throws IOException {

        Path filePathToRead = Paths.get("./resources/data.txt");
        List<String> allLines = Files.readAllLines(filePathToRead);
        System.out.println(allLines);

        Files.lines(filePathToRead)
                .map(p-> p.toLowerCase())
                .forEach(System.out::println);
    }
}
