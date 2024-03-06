package at.leander.ObjektOrientierteProgrammierung.Calculator;

public class ScienceCalculator extends Calculator {




    public ScienceCalculator(double number1, double number2) {
        super(number1, number2);
    }

    public double sinus(double angle){
        return Math.sin(angle);

    }

    public double cosinus(double angle){
        return Math.cos(angle);

    }


}
