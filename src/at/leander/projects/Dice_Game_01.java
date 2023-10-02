package at.leander.projects;

import java.util.Random;

public class Dice_Game_01 {

    public static void main(String[] args) {

        System.out.println("Würfelspiel! Du würfelst 6 Runden lang gegen den Computer, der mit der höheren Gesamtsumme gewinnt! Viel Glück!");
        int totalA = 0;
        int totalB = 0;
        Random random = new Random();
        int numberOfRounds = 6;

        for (int round = 1; round <= numberOfRounds; round++) {
            int a = random.nextInt(6) + 1;
            int b = random.nextInt(6) + 1;
            System.out.println("Runde " + round);
            System.out.println("Du würfelst eine: " + a);
            System.out.println("Der Gegner würfelt eine: " + b);

            totalA += a;
            totalB += b;

            if (a == b) {
                System.out.println(a + "=" + b + " -> Gleichstand \n");
            } else if (a > b) {
                System.out.println(a + ">" + b + " -> Du gewinnst! \n");
            } else {
                System.out.println(a + "<" + b + " -> Du verlierst! \n");
            }
        }

        System.out.println("Spiel beendet!");
        System.out.println("Gesamtsumme von dir: " + totalA);
        System.out.println("Gesamtsumme des Gegners: " + totalB);

        if (totalA == totalB) {
            System.out.println("Das Spiel endet unentschieden!");
        } else if (totalA > totalB) {
            System.out.println("Du gewinnst das Spiel!");
        } else {
            System.out.println("Der Gegner gewinnt das Spiel!");
        }
    }
}
