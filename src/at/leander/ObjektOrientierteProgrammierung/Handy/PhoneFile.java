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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public int getSizeInMB() {
        return sizeInMB;
    }

    public void setSizeInMB(int sizeInMB) {
        this.sizeInMB = sizeInMB;
    }
}
