package at.leander.ObjektOrientierteProgrammierung.RemoteControl;

public class Main {

    public static void main(String[] args) {


        Battery b1 = new Battery();
        RemoteControl r1 = new RemoteControl(RemoteControl.TYPE.YES,100);

        r1.addBattery(b1);

        r1.turnOn();
        System.out.println("Durchschnittlicher Ladestatus: " + r1.getStatus());

        r1.turnOff();
        System.out.println("Durchschnittlicher Ladestatus: " + r1.getStatus());



    }
}
