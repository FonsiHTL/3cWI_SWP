package at.leander.ObjektOrientierteProgrammierung.Handy;

public class Main {
    public static void main(String[] args) {

    PhoneFile phoneFile = new PhoneFile("image1", ".png", 10);
    PhoneFile phoneFile1 = new PhoneFile("image2", ".jpg", 5);

        System.out.println(phoneFile1.getInfo());
        System.out.println(phoneFile.getInfo());
    }
}
