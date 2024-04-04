package mavenproject;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws IOException {
        
        List<String> words = Files.readAllLines(Paths.get("C:\\Users\\utentepc\\Documents\\Words.txt"));

        words.forEach(v -> System.out.println(v));

        System.out.println("- numero elementi dello stream:");
        System.out.println(words.stream().count());

        System.out.println("- numero di parole con lunghezza > di 5:");
        System.out.println(words.stream().filter(v-> v.length()>5).count());

        System.out.println("- elementi ordinati:");
        words.stream().sorted().forEach(v-> System.out.println(v));

        System.out.println("- n. caratteri della parola max, min, avg");
        System.out.println(words.stream().mapToInt(v -> v.length()).max().getAsInt());
        System.out.println(words.stream().mapToInt(v -> v.length()).min().getAsInt());
        System.out.println(words.stream().mapToInt(v -> v.length()).average().getAsDouble());

        System.out.println("- stampa senza duplicati:");
        words.stream().distinct().forEach(v-> System.out.println(v));

        System.out.println("- cerca parola Fratelli (true o false):");
        System.out.println(words.stream().anyMatch(v -> v.contains("Fratelli")));

        System.out.println("- tutte le parole hanno lunghezza > di 4:");
        System.out.println(words.stream().allMatch(v -> v.length()>=4));

        System.out.println("- cerca parola Amore:");
        words.stream().filter(v -> v.contains("Amore")).forEach(v -> System.out.println(v));

        System.out.println("- raggruppo le parole per lunghezza e le conto:");
        System.out.println(words.stream().collect(Collectors.groupingBy(v -> v.length())));
        System.out.println(words.stream().collect(Collectors.groupingBy(v -> v.length(),Collectors.counting())));

        System.out.println("- parole < 5 unite con il '+':");
        System.out.println(words.stream().filter(v -> v.length() < 5).map(v -> v.toUpperCase()).distinct().collect(Collectors.joining("+")));

        

    }
}
// c:\\Users\\utentepc\\Documents\\Words.txt