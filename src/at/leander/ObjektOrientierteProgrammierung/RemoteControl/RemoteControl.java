package at.leander.ObjektOrientierteProgrammierung.RemoteControl;
import at.leander.ObjektOrientierteProgrammierung.RearMirror;

import java.util.ArrayList;
public class RemoteControl {
    private ArrayList<Battery> batteries = new ArrayList<>();

    public enum TYPE {YES, NO};
    private int hasPower;

    private TYPE isOn;



    public RemoteControl(TYPE isOn, int hasPower) {
        batteries.add(new Battery());
        batteries.add(new Battery());
        this.isOn = isOn;
        this.hasPower = hasPower;
    }

    public void turnOn() {
        for (Battery battery : batteries) {
            battery.turnOn();
        }
        this.isOn = TYPE.YES;
    }

    public void turnOff() {
        for (Battery battery : batteries) {
            battery.turnOff();
        }
        this.isOn = TYPE.NO;
    }

    public double getStatus(){
        int totalStatus = 0;
        for (Battery battery : batteries) {
            totalStatus += battery.getChargingStatus();
        }
        return totalStatus / (double) batteries.size();
    }

    public void addBattery(Battery Battery) {
        this.batteries.add(Battery);
    }


    public void setBatteries(ArrayList<Battery> batteries) {
        this.batteries = batteries;
    }



    public int getHasPower() {
        return hasPower;
    }

    public void setHasPower(int hasPower) {
        this.hasPower = hasPower;
    }

    public TYPE getIsOn() {
        return isOn;
    }

    public void setIsOn(TYPE isOn) {
        this.isOn = isOn;
    }
}
