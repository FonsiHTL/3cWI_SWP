package at.leander.ObjektOrientierteProgrammierung;

public class Engine {
    public enum TYPE {DIESEL, GAS}

    ;
    private int horsePower;
    private TYPE gasType;
    private Tank tank;

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getGasType() {
        return gasType;
    }

    public Tank getTank() {
        return tank;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setGasType(TYPE gasType) {
        this.gasType = gasType;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Engine(int horsePower, TYPE gasType, Tank tank) {
        this.horsePower = horsePower;
        this.gasType = gasType;
        this.tank = tank;
    }

    public void drive() {
        double fuelConsumption = tank.getFuelConsumption();
        double remainingFuel = tank.getFuelAmount();


        if (remainingFuel >= fuelConsumption) {
            tank.setFuelAmount(remainingFuel - fuelConsumption);
            System.out.println("I am driving");
        } else {
            System.out.println("Not enough fuel to drive");
        }
        System.out.println("Remaining Fuel: " + remainingFuel);
    }
}
