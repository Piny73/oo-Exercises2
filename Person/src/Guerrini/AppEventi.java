package Guerrini;

import java.time.LocalDateTime;


public class AppEventi {
    public static void main(String[] args) {

        System.out.println("Benventuo nella app EVENTI: "); 
        
        Evento event = new Evento("Concerto di musica da camera", "Ravello", "Musica classica eseguita da artisti d'eccezione!", LocalDateTime.of(2024, 8, 15, 20, 30));
        System.out.println(event.toString());

        Partecipanti p = new Partecipanti("Salemme", "Giuseppina", "Piny73@gmail.com","3480087652");
        System.out.println(p.toString());
    
    }    
}
