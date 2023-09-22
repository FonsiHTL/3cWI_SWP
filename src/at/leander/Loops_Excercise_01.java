package at.leander;
import java.util.Random;
public class Loops_Excercise_01 {
    public static void main(String[] args) {

//Zähle in einem For-Loop die Zahlen von 1 bis 100 (inklusive) zusammen
        Random random = new Random();
    int randomNumber = random.nextInt(100);
    int count = 0;
    for (int i = 0; i <= 100; i++) {
            System.out.println(i+count);
            count = count + i;

        }






    }
}