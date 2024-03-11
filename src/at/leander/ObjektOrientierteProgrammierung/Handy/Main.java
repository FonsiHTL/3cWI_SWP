package at.leander.ObjektOrientierteProgrammierung.Handy;

import java.util.List;

public class Main {
    public static void main(String[] args) {


    PhoneFile phoneFile = new PhoneFile("image1", ".png", 10);
    PhoneFile phoneFile1 = new PhoneFile("image2", ".jpg", 5);





    SDCard sdCard = new SDCard(1000);

        Phone phone = new Phone(sdCard);


        sdCard.safeFile(phoneFile);
        sdCard.safeFile(phoneFile1);
        phone.printAllFiles();
        System.out.println();
        System.out.println("Remaining Space in MB: " + sdCard.getFreeSpace());





    }
}
