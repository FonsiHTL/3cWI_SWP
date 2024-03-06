package at.leander.ObjektOrientierteProgrammierung.Lamp_Example;
import java.util.ArrayList;

public class Lamp {

    private ArrayList<LightElement> lightElements;
    private double overallPowerUsage;

    public Lamp() {
        lightElements = new ArrayList<>();
        overallPowerUsage = 0;
    }

    public void addLightElement(LightElement lightElement) {
        lightElements.add(lightElement);
    }

    public void turnAllOn() {
        for (LightElement lightElement : lightElements) {
            lightElement.turnOn();
            overallPowerUsage += 5;
        }


    }

    public double getOverallPowerUsage() {
        return overallPowerUsage;
    }

    public void printNamesOfLightElements() {
        System.out.println("Names of Light Elements:");
        for (LightElement lightElement:
                lightElements) {
            System.out.println(lightElement.getName());
        }



        }


}
