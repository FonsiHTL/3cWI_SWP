package at.leander.ObjektOrientierteProgrammierung;

public class Car {
    // Gedächtnisvariablen

    private double fuelConsumption;
    private String color;
    private String serialNumber;
    private String brand;
    private double fuelAmount;
    private double amountFuelIntoMotor;


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

    public void setAmountFuelIntoMotor(double amountFuelIntoMotor) {
        this.amountFuelIntoMotor = amountFuelIntoMotor;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getAmountFuelIntoMotor() {
        return amountFuelIntoMotor;
    }

    public double getFuelAmount() {
        if (fuelAmount > 100) {
            this.fuelAmount = 100;
        } else {
            this.fuelAmount = fuelAmount;
        }
        return fuelAmount;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}