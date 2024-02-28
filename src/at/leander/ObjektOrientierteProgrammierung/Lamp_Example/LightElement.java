package at.leander.ObjektOrientierteProgrammierung.Lamp_Example;

public class LightElement {

    private String name;
    private String color;
    private double powerConsumption;
    private boolean turnedOn;


    public LightElement(String name, String color, double powerConsumption, boolean turnedOn) {
        this.name = name;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.turnedOn = turnedOn;

    }

    public void turnOn() {
        if (!turnedOn) {
            turnedOn = true;
            System.out.println("Mein Name ist: " + name + "Ich wurde so eben eingeschaltet");
        } else {
            System.out.println("Mein Name ist: " + name + "Ich bin bereits eingeschaltet");

        }

        powerConsumption =+ 5;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }
}
