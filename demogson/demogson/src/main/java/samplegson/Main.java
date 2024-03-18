package samplegson;

import java.time.LocalDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Partecipanti p;
        p = new Partecipanti("Salemme", "Giuseppina", "giussal@gmail.com", "3480087652");
        p = new Partecipanti("Dente", "Massimiliano", "massden@gmail.com", "3480087331");
        GsonBuilder gsonb = new GsonBuilder();

        gsonb.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeSerializer());
        gsonb.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeDeserializer());
        Gson gson = gsonb.setPrettyPrinting().create();
        String p1TxJson = gson.toJson(p);
        System.out.println(p1TxJson);

        Evento event = new Evento("Concerto di musica da camera", "Ravello");
        event.addIdPartecipant(p.getId());
        String evTxJson = gson.toJson(event);
        System.out.println(evTxJson);
        Evento event2 = gson.fromJson(evTxJson, Evento.class);
        System.out.println(event2.getEventitle());

    }
}