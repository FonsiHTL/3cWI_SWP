package at.leander;

import java.util.Random;
public class While_Excercise_01 {

    public static void main(String[] args) {


        Random random = new Random();

        boolean isFinished = false;




        while (!isFinished){

            int randomValue = random.nextInt(10,31 );
            int randomValue2 = random.nextInt(10, 31);

            int sum = 0;
            sum += randomValue + randomValue2;
            System.out.println(randomValue);
            System.out.println(randomValue2);
            System.out.println(sum);

            if (randomValue == 15 || randomValue == 25){
                isFinished = true;
            }

        }



    /*Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert. Das Programm soll die Zufallszahlen zusammenzählen.
    Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beendet und die Summe der vorherigen Zufallszahlen ausgegeben!
     */


    }
}
