package at.leander.RegularExpression;

public class RegularExpression {

    public static void main(String[] args) {
        String email = "Hansi.Müller@htldornbirn.at";

        if (email.matches(".*@.*\\.[a-zA-Z]{2,3}")){
            System.out.println("true");
        }   else
            System.out.println("false");

    }

}
