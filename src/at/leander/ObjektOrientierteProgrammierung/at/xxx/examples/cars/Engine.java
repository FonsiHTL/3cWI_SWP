package at.leander.ObjektOrientierteProgrammierung.at.xxx.examples.cars;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private TYPE gasType;
    private int horsePower;

    public Engine(TYPE gasType, int horsePower) {
        this.gasType = gasType;
        this.horsePower = horsePower;
    }

    public TYPE getGasType() {
        return gasType;
    }

    public void setGasType(TYPE gasType) {
        this.gasType = gasType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
