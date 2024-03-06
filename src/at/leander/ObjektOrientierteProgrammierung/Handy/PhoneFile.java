package at.leander.ObjektOrientierteProgrammierung.Handy;

public class PhoneFile {

    public String name;
    public String extension;
    public int sizeInMB;

    public PhoneFile(String name, String extension, int sizeInMB) {
        this.name = name;
        this.extension = extension;
        this.sizeInMB = sizeInMB;
    }


    public String getInfo() {
        return ("Phonefile: " + name + extension + "    Size in MB: " + sizeInMB);
    }
}
