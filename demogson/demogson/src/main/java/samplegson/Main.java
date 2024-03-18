package samplegson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        Partecipanti p1 = new Partecipanti(getId(),"Salemme", "Giuseppina", "giussal@gmail.com","3480087652");
        GsonBuilder gsonb = new GsonBuilder();
        
        gsonb.registerTypeAdapter(LocalDateTimeDeserializer.class, new LocalDateTimeSerializer());
        gsonb.registerTypeAdapter(LocalDateTimeDeserializer.class, new LocalDateTimeDeserializer());
        Gson gson = gsonb.setPrettyPrinting().create();
        String p1TxJson = gson.toJson(p1);
        System.out.println(p1TxJson);
        Evento event = new Evento("Musica da camera", "Ravello");
        event.addIdPartecipant(p1.getId());
        String evTsJson = gson.toJson(event);
        System.out.println(evTsJson);
        

    }
}