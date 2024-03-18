package samplegson;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Evento {

    private String eventitle = "";
    private String location = "";
    private String description = "";
    private LocalDateTime dateandtime;

    private ArrayList<Long> listIdPart = new ArrayList<>();

    public boolean addIdPartecipant(long id) {
        for (long i : listIdPart) {
            if (i == id){ // id già presengte
                return false;
            }
        }
        // aggiungo alla lista
        listIdPart.add(id); // id aggiunto
        return true;
    }

    public long[] getListIdPart(){
        long[] ris = new long [listIdPart.size()];
        for (int j = 0; j<ris.length; j++){
            ris[j] = listIdPart.get(j);
        }
        return ris;

    }

    public Evento(String eventitle, String location, String description, LocalDateTime dateandtime) {
        this.eventitle = eventitle;
        this.location = location;
        this.description = description;
        this.dateandtime = LocalDateTime.now();
    }

   

   

    public Evento(String eventitle, String location) {
        this.eventitle = eventitle;
        this.location = location;
        this.dateandtime = LocalDateTime.now();
    }

    public String getEventitle() {
        return eventitle;
    }

    public void setEventitle(String eventitle) {
        this.eventitle = eventitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Evento other = (Evento) obj;
        if (eventitle == null) {
            if (other.eventitle != null)
                return false;
        } else if (!eventitle.equals(other.eventitle))
            return false;
        if (location == null) {
            if (other.location != null)
                return false;
        } else if (!location.equals(other.location))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (dateandtime == null) {
            if (other.dateandtime != null)
                return false;
        } else if (!dateandtime.equals(other.dateandtime))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Evento in corso [eventitle=" + eventitle + ", location=" + location + ", description=" + description
                + ", dateandtime=" + dateandtime + "]";
    }

    public LocalDateTime getDateandtime() {
        return dateandtime;
    }

    public void setDateandtime(LocalDateTime dateandtime) {
        this.dateandtime = dateandtime;
    }
    public void printListId (){
        for (long id : listIdPart)
        System.out.println(id);
    }

}


