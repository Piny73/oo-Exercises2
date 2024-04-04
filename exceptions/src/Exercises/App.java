package Exercises;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean error = false;
        List<String> lines = new ArrayList<>();
        do {
            System.out.println("dimmi il percorso del file da leggere");
            String filename = s.nextLine();
            try {
                lines = Files.readAllLines(Paths.get(filename));
            } catch (IOException e) {
                System.out.println("Il file non esiste!");
                error = true;
            }
        } while (error);
        lines.forEach(v -> System.out.println(v));
        System.out.println("IL PROGRAMMA TERMINA CORRETTAMENTE");
    }
}
// c:\\Users\\utentepc\\Documents\\Except.txt
// C:\\Users\\utentepc\\Documents\\Except.txt