package at.leander.ObjektOrientierteProgrammierung;

public class Engine {


    public enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE gasType;


    public Engine(int horsePower, TYPE gasType) {

        this.horsePower = horsePower;
        this.gasType = gasType;

    }
    public void drive(int amount){
        System.out.println("the motor is running with " + amount);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getGasType() {
        return gasType;
    }

    public void setGasType(TYPE gasType) {
        this.gasType = gasType;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
