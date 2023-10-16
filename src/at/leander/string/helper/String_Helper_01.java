package at.leander.string.helper;

import java.sql.SQLOutput;
import java.util.Scanner;


public class String_Helper_01 {

    public static boolean isPalindrome() {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;


        char[] arr = {'l', 'a', 'g', 'e', 'r', 'r', 'e', 'g', 'a', 'l'};

        System.out.println("arr: ");
        for (char c : arr) {
            System.out.print(c + " ");
        }


        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        if (isPalindrome()) {
            System.out.println("Das Array ist ein Palindrom");
        } else {
            System.out.println("Das Array ist kein Palindrom");
        }

        String text = "Hello, World!"; // Replace this with your input string
        int letterCount = countLetters(text);


        System.out.println("Number of letters in the string: " + letterCount);
    }

    public static int countLetters(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }
}





