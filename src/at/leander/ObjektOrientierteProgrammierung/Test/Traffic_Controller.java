package at.leander.ObjektOrientierteProgrammierung.Test;




import java.util.ArrayList;
import java.util.List;

public class Traffic_Controller {

    private ArrayList<Plane> planes = new ArrayList<>();

    public void addPlanes(Plane plane) {
        this.planes.add(plane);

    }
    public String printAllPlanes() {
        List<Plane> planeList = this.planes;
        for (Plane plane : planes
        ) {
            System.out.println(planeList);
        }
        return planeList.toString();
    }

    public void informPeopleOnAllPlanes(String Info) {

        for (Plane planes : planes) {
            System.out.println("Wichtige Nachricht:");
            planes.informPassengers("");
        }

    }
}