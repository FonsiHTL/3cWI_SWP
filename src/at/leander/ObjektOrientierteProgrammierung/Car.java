package at.leander.ObjektOrientierteProgrammierung;

public class Car {
    // Gedächtnisvariablen

    double fuelConsumption;
    String  color;
    String serialNumber;
    String brand;
    double fuelAmount;


    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void break1(){
        System.out.println("Kicking in the break");

    }


}
