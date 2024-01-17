package at.leander.ObjektOrientierteProgrammierung;

public class Wheels {

    private int diameter;
    private int width;

    public enum TYPE {WINTERWHEEL, SUMMERWHEEL}

    ;

    private TYPE wheelType;

    public Wheels(int diameter, int width, TYPE wheelType) {
        this.diameter = diameter;
        this.width = width;
        this.wheelType = wheelType;
    }

    public TYPE getWheelType() {
        return wheelType;
    }


    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setWheelType(TYPE wheelType) {
        this.wheelType = wheelType;
    }


}
