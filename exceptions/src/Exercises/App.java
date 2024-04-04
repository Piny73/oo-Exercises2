package Exercises;

import java.nio.file.Files;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws Exception {
        Files.readAllLines(Path.get("c:\\tmp\\prova.txt"));
    }
}
