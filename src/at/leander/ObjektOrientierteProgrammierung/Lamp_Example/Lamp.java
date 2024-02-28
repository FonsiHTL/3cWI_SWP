package at.leander.ObjektOrientierteProgrammierung.Lamp_Example;
import java.util.ArrayList;

public class Lamp {

    private ArrayList<LightElement> lightElements;
    private double overallPowerUsage;

   public Lamp (){
        lightElements = new ArrayList<>();
        overallPowerUsage = 0;
    }
    public void addLightElement(LightElement lightElement) {
        lightElements.add(lightElement);
    }



}
