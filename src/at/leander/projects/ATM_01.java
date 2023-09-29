package at.leander.projects;
import java.util.Scanner;
public class ATM_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String selection = scanner.next();
        System.out.println(selection);


        int balance = 0;

        boolean running = true;

        while (running) {

            System.out.println("Wählen Sie ein der folgenden Möglichkeiten aus");
            System.out.println("1 = Einzahlen");
            System.out.println("2 = Abheben");
            System.out.println("3 = Kontostand");
            System.out.println("4 = Beenden");





            switch (scanner.nextInt()) {

                case 1:
                    System.out.println("Geben Sie den Betrag ein, den Sie einzahlen wollen");
                    int amount = scanner.nextInt();
                    balance += amount;
                    System.out.println("Sie haben " + amount +" Euro eingezahlt");
                    break;
                case 2:
                    System.out.println("Geben Sie den Betrag ein, den Sie abheben wollen");
                    amount = scanner.nextInt();
                    balance -= amount;
                    System.out.println("Sie haben " + amount + " Euro abgehoben");
                    break;
                case 3:
                    System.out.println("Ihr jetziger Kontostand: ");
                    System.out.println(balance);
                    break;
                case 4:
                    System.out.println("Tschau");
                    break;

                default:
                    System.out.println("eingabe nicht akzeptiert");
                    break;




        }
        }
    }
}