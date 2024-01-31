package at.leander.ObjektOrientierteProgrammierung.RemoteControl;

public class Main {

    public static void main(String[] args) {



        RemoteControl r1 = new RemoteControl(RemoteControl.TYPE.YES,100);



        r1.turnOn();
        //System.out.println("Turn on");
        System.out.println("Durchschnittlicher Ladestatus: " + r1.getStatus());

        r1.turnOff();
        //System.out.println("Turn off");
        System.out.println("Durchschnittlicher Ladestatus: " + r1.getStatus());



    }
}
