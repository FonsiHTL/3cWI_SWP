package at.leander.projects.caesar;

public class Caesar_Encryption {


    public static void main(String[] args) {

        String normaltext = "Servus!";
        int key = 2;

        char[] verschluesselterTextArray = encrypt(normaltext.toCharArray(), key);
        String verschluesselterText = new String(verschluesselterTextArray);
        System.out.println("Verschlüsselter Text: " + verschluesselterText);

        char[] entschluesselterTextArray = decrypt(verschluesselterTextArray, key);
        String entschluesselterText = new String(entschluesselterTextArray);
        System.out.println("Entschlüsselter Text: " + entschluesselterText);
    }

    public static char[] encrypt(char[] textArray, int key) {
        char[] verschluesselterTextArray = new char[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            char zeichen = textArray[i];
            char verschluesseltesZeichen = zeichen;

            if (Character.isLetter(zeichen)) {
                int verschiebung = Character.isUpperCase(zeichen) ? 'A' : 'a';
                verschluesseltesZeichen = (char) (((zeichen - verschiebung + key) % 26) + verschiebung);
            }

            verschluesselterTextArray[i] = verschluesseltesZeichen;
        }

        return verschluesselterTextArray;
    }

    public static char[] decrypt(char[] textArray, int schluessel) {
        // Die Entschlüsselung ist das Gleiche wie die Verschlüsselung, nur mit negativem Schlüssel
        return encrypt(textArray, -schluessel);
    }
}























