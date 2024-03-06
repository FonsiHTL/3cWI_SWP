package at.leander.ObjektOrientierteProgrammierung.Calculator;

public class RootCalculator extends Calculator {
    public RootCalculator(double number1, double number2) {
        super(number1, number2);
    }

    public double root(double n){
       return Math.sqrt(n);
    }



}
