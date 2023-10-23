package at.leander.projects;

import java.util.Random;
import java.util.Scanner;

public class Ratespiel_01 {


    public static void main(String[] args) {

        String[] words = {"simon", "eric", "leander", "jonas", "lukas", "samuel", "peter", "tobias", "raphael"};

        Random randomGenerator = new Random();

        String secretWord = words[randomGenerator.nextInt(words.length)];
        char[] guessedLetters = new char[secretWord.length()];
        boolean isFinished = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen zum Wörter-Ratespiel!");
        System.out.print("Aktuelles Wort: ");

        for (char letter : guessedLetters) {
            if (letter == 0) {
                System.out.print("*");
            } else {
                System.out.print(letter);
            }
        }

        System.out.println();

        while (!isFinished) {
            System.out.print("Rate einen Buchstaben, der im Wort enthalten sein könnte: ");
            System.out.print("\n");
            char input = scanner.next().charAt(0);

            boolean isLetterCorrect = false;
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == input) {
                    guessedLetters[i] = input;
                    isLetterCorrect = true;
                }
            }

            System.out.print("Aktuelles Wort: ");
            for (char letter : guessedLetters) {
                if (letter == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(letter);
                }
            }
            System.out.println();


            if (!String.valueOf(guessedLetters).equals(secretWord)) {
                if (!isLetterCorrect) {
                    System.out.println("Schade Marmelade, dieser Buchstabe ist nicht im Wort enthalten");

                }


            } else {
                System.out.println("Herzlichen Glückwunsch, du hast das Wort erraten: " + secretWord);

                isFinished = true;

            }

        }

        scanner.close();
    }
}