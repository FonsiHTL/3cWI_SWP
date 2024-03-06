package at.leander.ObjektOrientierteProgrammierung.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(34, 4);
        RootCalculator rootCalculator = new RootCalculator(2, 3);
        ScienceCalculator scienceCalculator = new ScienceCalculator(3, 5);

        printCalculatorDetails(calculator, rootCalculator, scienceCalculator);
    }

    private static void printCalculatorDetails(Calculator calculator, RootCalculator rootCalculator, ScienceCalculator scienceCalculator) {

        System.out.println("Addition: " + calculator.addition(calculator.number1, calculator.number2));
        System.out.println("Subtraction: " + calculator.subtraction(calculator.number1, calculator.number2));
        System.out.println("Multiplication: " + calculator.multiplication(calculator.number1, calculator.number2));
        System.out.println("Division: " + calculator.division(calculator.number1, calculator.number2));
        System.out.println();
        System.out.println("Sinus: " + scienceCalculator.sinus(60));
        System.out.println("Cosinus: " + scienceCalculator.sinus(60));
        System.out.println();
        System.out.println("Root: " + rootCalculator.root(20));

    }
}
