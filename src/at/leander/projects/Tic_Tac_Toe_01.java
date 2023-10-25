package at.leander.projects;

import javax.naming.PartialResultException;
import java.util.Scanner;

public class Tic_Tac_Toe_01 {

 public static void main(String[] args) {

     char[][] board = {
             {' ', ' ', ' '},
             {' ', ' ', ' '},
             {' ', ' ', ' '}
     };



     for (int row = 0; row < 3; row++) {
         for (int col = 0; col < 3; col++) {
             System.out.print(" " + board[row][col] + " ");
             if (col < 2) {
                 System.out.print("|");
             }
         }
         System.out.println();
         if (row < 2) {
             System.out.println("---+---+---");
         }
     }

 }
}
