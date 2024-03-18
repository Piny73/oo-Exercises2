package Guerrini;

import java.time.LocalDateTime;

public class Evento {

    private String eventitle = "";
    private String location = "";
    private String description = "";
    private LocalDateTime dateandtime;

   

    public Evento(String eventitle, String location, String description, LocalDateTime dateandtime) {
        this.eventitle = eventitle;
        this.location = location;
        this.description = description;
        this.dateandtime = dateandtime;
    }
    
    public Evento(String eventitle, String location) {
        this.eventitle = eventitle;
        this.location = location;
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((eventitle == null) ? 0 : eventitle.hashCode());
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((dateandtime == null) ? 0 : dateandtime.hashCode());
        return result;
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

    
}
