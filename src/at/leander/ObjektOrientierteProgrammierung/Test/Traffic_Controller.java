package at.leander.ObjektOrientierteProgrammierung.Test;




import java.util.ArrayList;
import java.util.List;

public class Traffic_Controller {

    private ArrayList<Plane> planes = new ArrayList<>();


    public String printAllPlanes() {
        List<Plane> planeList = this.planes;
        for (Plane plane : planes
        ) {
            System.out.println(planeList);
        }
        return planeList.toString();
    }

    public void informPeopleOfAllPlanes(){
        System.out.println("Neue Information");

    }



}