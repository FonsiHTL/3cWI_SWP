package at.leander.ObjektOrientierteProgrammierung;

public class Car {
    // Gedächtnisvariablen

    public double fuelConsumption;
    public String color;
    public String serialNumber;
    public String brand;
    public double fuelAmount;

    public Car(int fuelConsumption, String brand, String serialNumber, double fuelAmount, String color) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelAmount = fuelAmount;
        this.color = color;

    }

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void break1() {
        System.out.println("Kicking in the break");

    }

    public void turboBoost() {
        if (this.fuelAmount > this.fuelAmount * 0.1) {
            System.out.println("SuperBoostMode");

        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }

    }


    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }


    public double getRemainingRange() {
        double remainingRange = fuelAmount / fuelConsumption;
        double remainingRangeRounded = Math.round(remainingRange * 100.0) / 100.0;
        return remainingRangeRounded;
    }
}