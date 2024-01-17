package at.leander.ObjektOrientierteProgrammierung;

public class Tank {

    public enum TYPE {DIESEL, GAS}


    public double fuelConsumption;

    public double fuelAmount;


    public Tank(double fuelConsumption, double fuelAmount) {
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuelAmount() {
        if (fuelAmount > 100) {
            return 100;
        } else {
            return fuelAmount;
        }
    }


    public double getRemainingRange() {
        double remainingRange = fuelAmount / fuelConsumption;
        double remainingRangeRounded = Math.round(remainingRange * 100.0) / 100.0;
        return remainingRangeRounded;
    }

    public void turboBoost() {
        if (this.fuelAmount > this.fuelAmount * 0.1) {
            System.out.println("SuperBoostMode");

        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }

    }
}
