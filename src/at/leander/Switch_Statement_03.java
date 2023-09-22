package at.leander;
import java.util.Random;
public class Switch_Statement_03 {

    public static void main(String[] args) {


        // Erstelle eine Zufallszahl zwischen 5 und 10

        Random random = new Random();
        int randomNumber = random.nextInt(5,10);

        switch (randomNumber){
            case 10:
                System.out.println("Ten");
                break;
            case 9:
                    System.out.println("Nine");
                    break;
            case 8:
                    System.out.println("Eight");
                    break;
            case 7:
                System.out.println("Seven");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("other value");
                    break;
        }


       /* if (randomNumber == 1) {
            System.out.println("You selected 1");
        }   else if (randomNumber == 2) {
            System.out.println("two");
        }   else if (randomNumber == 3) {

        }
        */

// Wenn der Wert 10 ist gib aus Ten

// Wenn der Wert 9 ist gib aus Nine

// Wenn der Wert 8 ist gib aus Eight

// etc.

















    }

















}
