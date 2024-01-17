package at.leander.ObjektOrientierteProgrammierung;

import java.util.ArrayList;

public class Car {
    // Gedächtnisvariablen


    private Engine engine;
    private Tank tank;

    private String color;
    private String serialNumber;
    private String brand;
    private ArrayList<RearMirror> mirrors = new ArrayList<>();
    private ArrayList<Wheels> wheels = new ArrayList<>();
    private double amountFuelIntoMotor;


    public Car(String brand, String serialNumber, String color, Engine engine, Tank tank) {


        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.engine = engine;
        this.tank = tank;

    }


    public void break1() {
        System.out.println("Kicking in the break");

    }


    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public void addMirror(RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public ArrayList<RearMirror> getMirrors() {
        return mirrors;
    }


    public void addWheel(Wheels wheels){
        this.wheels.add(wheels);
    }
    public ArrayList<Wheels> getWheels() {
        return wheels;
    }

    public void setAmountFuelIntoMotor(double amountFuelIntoMotor) {
        this.amountFuelIntoMotor = amountFuelIntoMotor;
    }


    public Engine getEngine() {
        return engine;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getAmountFuelIntoMotor() {
        return amountFuelIntoMotor;
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

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
