package at.leander.ObjektOrientierteProgrammierung.RemoteControl;

public class Battery {

    private int chargingStatus;

    public Battery(){
        this.chargingStatus = 100;
    }


    public void setChargingStatus(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

    public void turnOn() {
        chargingStatus -= 5;
        System.out.println("Verbraucher angeschlossen");
    }

    public void turnoff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public int getChargingStatus() {
        return chargingStatus;
    }
}
