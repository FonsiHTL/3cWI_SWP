package at.leander.string.helper;

import javax.naming.PartialResultException;
import java.sql.SQLOutput;
import java.util.Scanner;


public class String_Helper_01 {

    public static boolean isPalindrome(char[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] arr = {'l', 'a', 'g', 'e', 'r', 'r', 'e', 'g', 'a', 'l'};

        System.out.println("arr: ");
        for (char c : arr) {
            System.out.print(c + " ");
        }

        if (isPalindrome(arr)) {
            System.out.print("  <-  Das Array ist ein Palindrom");
        } else {
            System.out.print("  <-  Das Array ist kein Palindrom");
        }

        int letterCount = countLetters(arr);

        System.out.println("\nNumber of letters in the array: " + letterCount);

        String reversedString = reverseString(arr);
        System.out.println("Reversed string: " + reversedString);
    }

    public static int countLetters(char[] arr) {
        int count = 0;
        for (char c : arr) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(char[] arr) {
        String reversed = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed += arr[i];
        }
        return reversed;
    }
}






