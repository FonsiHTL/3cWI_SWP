package at.leander.ObjektOrientierteProgrammierung.Test;

import at.leander.ObjektOrientierteProgrammierung.RearMirror;
import at.leander.ObjektOrientierteProgrammierung.RemoteControl.Battery;

import java.util.ArrayList;

public class Plane {

    private String name;

    private Position position;

    private ArrayList<Passenger> passengers = new ArrayList<>();

    public Plane(String name, Position position) {
        this.name = name;
        this.position = position;
    }


    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
        System.out.println(this.getPassengers());
    }

    public void informPeopleonAllPlane(){

    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void setName(String name) {
        this.name = name;
    }
}
