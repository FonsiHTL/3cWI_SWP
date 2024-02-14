package at.leander.ObjektOrientierteProgrammierung.at.xxx.examples.cars;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private TYPE gasType;

    public Engine(TYPE gasType) {
        this.gasType = gasType;
    }

    public TYPE getGasType() {
        return gasType;
    }

    public void setGasType(TYPE gasType) {
        this.gasType = gasType;
    }
}
