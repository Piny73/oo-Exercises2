package Guerrini;

public class Partecipanti {

    private String lastname = "";
    private String firstname = "";
    private String email = "";
    private String phone = "";
    private long id;
    
    public Partecipanti(String lastname, String firstname, String email, String phone) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.phone = phone;
        this.id = hashCode();
    }

    public Partecipanti(String lastname, String phone) {
        this.lastname = lastname;
        this.phone = phone;
        this.id = hashCode();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getId (){
        return id;
    }

    

    
    public int creaId() {
        double percRnd = Math.random(); 
        double idRnd = percRnd * 10;
        int id = (int) idRnd +1;
        final int prime = 11 + id;
        int result = 1;
        result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
        result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Dati Partecipante [lastname=" + lastname + ", firstname=" + firstname + ", email=" + email + ", phone="
                + phone + "]";
    }

    
}
