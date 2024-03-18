package Guerrini;

import java.time.LocalDateTime;


public class AppEventi {
    public static void main(String[] args) {

        System.out.println("Benventuo negli EVENTI"); 
        
        Evento event = new Evento("Concerto di musica da camera", "Ravello", "Musica classica eseguita da artisti d'eccezione!", LocalDateTime.of(2024, 8, 15, 20, 30));
        Partecipanti p;
        p = new Partecipanti("Salemme", "Giuseppina", "Piny73@gmail.com","3480087652");
        event.addIdPartecipant(p.getId());
        p = new Partecipanti("Dente", "Massimiliano", "Massi67@gmail.com","3480087331");
        event.addIdPartecipant(p.getId());

        event.printListId();
        
        
       
    
    }    
}
