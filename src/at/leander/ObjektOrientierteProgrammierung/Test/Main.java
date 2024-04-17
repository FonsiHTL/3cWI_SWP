package at.leander.ObjektOrientierteProgrammierung.Test;

public class Main {
    public static void main(String[] args) {

        Passenger passenger1 = new Passenger("Lucas", "Käpernik");
        Passenger passenger2 = new Passenger("Samuel", "Ammann");

        Plane P1 = new Plane("Airbus", new Position(30,40));
        P1.addPassenger(passenger1);
        P1.addPassenger(passenger2);

        Traffic_Controller T1 = new Traffic_Controller();
        T1.addPlanes(P1);


        T1.printAllPlanes();
        T1.informPeopleOnAllPlanes(" Guten FLug!");
        P1.getPassengers();





    }


}
