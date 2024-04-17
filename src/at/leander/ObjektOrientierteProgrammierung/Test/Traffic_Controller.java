package at.leander.ObjektOrientierteProgrammierung.Test;




import java.util.ArrayList;
import java.util.List;

public class Traffic_Controller {

    private ArrayList<Plane> planes = new ArrayList<>();

    public void addPlanes(Plane plane) {
        this.planes.add(plane);

    }
    public void printAllPlanes() {
        for (Plane plane : planes) {
            System.out.println(plane.getName());
        }

    }

    public void informPeopleOnAllPlanes(String message) {
        for (Plane planes : planes) {
            planes.informPassengers(message);
        }

    }
}