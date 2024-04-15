package at.leander.ObjektOrientierteProgrammierung.Test;

import java.sql.SQLOutput;

public class Passenger {

    private String firstname;

    private String lastname;

    public Passenger(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }



    public void inform(){
        System.out.println(this.firstname + this.lastname + "Ich wurde informiert");
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
