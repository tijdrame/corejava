package com.emard.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesUpdate {
    public static void main(String[] args) {
        try {
            Path path = Files.writeString(Files.createTempFile
                            ("test", ".txt"),
                    "Java 11 is cool");
            System.out.println(path);
            String str = Files.readString(path);
            System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
