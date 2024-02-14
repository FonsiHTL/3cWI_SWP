package at.leander.ObjektOrientierteProgrammierung.at.xxx.examples.cars;

import at.leander.ObjektOrientierteProgrammierung.Engine;
import at.leander.ObjektOrientierteProgrammierung.Tank;

public class Car {

    private Engine engine;
    private Producer producer;
    private int basePrice;
    private String color;



    private int maxSpeed;
    private int baseFuelConsumption;

    public Car(Engine engine, Producer producer, int basePrice, String color, int maxSpeed, int baseFuelConsumption) {
        this.engine = engine;
        this.producer = producer;
        this.basePrice = basePrice;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.baseFuelConsumption = baseFuelConsumption;
    }

    public Engine getEngine() {
        return engine;
    }

    public Producer getProducer() {
        return producer;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }



    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getBaseFuelConsumption() {
        return baseFuelConsumption;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setBaseFuelConsumption(int baseFuelConsumption) {
        this.baseFuelConsumption = baseFuelConsumption;
    }
}
