package at.leander.ObjektOrientierteProgrammierung;

public class Car {
    // Gedächtnisvariablen

    double fuelConsumption;
    String color;
    String serialNumber;
    String brand;
    double fuelAmount;


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