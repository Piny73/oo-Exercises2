package mavenproject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.swing.Box;

public class AppGenerics {
    public static void main(String[] args) {

        Box<Person> box = new Box<>(new Person("mario","rossi"));

        
        List<String> l;
        

        // come funzionava prima
        //ArrayList g = new ArrayList<>();
        //g.add("parola");
        //g.add(1);
        //g.add(new Person("mario", "rossi"));
        //System.out.println(g);
    }

    record Person(String fname, String lname) {
    }
}
