package at.leander.ObjektOrientierteProgrammierung.Lamp_Example;

public class Main {
    public static void main(String[] args) {

        Lamp lamp = new Lamp();

        LightElement lightElement1 = new LightElement("Element1", "Red", 20, false);
        LightElement lightElement2 = new LightElement("Element2", "Green", 18, false);

        lamp.addLightElement(lightElement1);
        lamp.addLightElement(lightElement2);
        lamp.turnAllOn();

        lamp.printNamesOfLightElements();
        System.out.println("Color of Element1: " + lightElement1.getColor());
        System.out.println("Color of Element2: " + lightElement2.getColor());
        System.out.println("Overall Power Usage: " + lamp.getOverallPowerUsage());

    }
}
