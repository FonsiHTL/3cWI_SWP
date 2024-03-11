package at.leander.ObjektOrientierteProgrammierung.Handy;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> files;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();

    }

    public List<PhoneFile> getFiles(){
        return files;
    }

    public void safeFile(PhoneFile file){
        this.files.add(file);
    }

    public int getFreeSpace(){
        int sum = 0;

        for (PhoneFile phoneFile: files) {
            sum += phoneFile.getSizeInMB();
        }
        return capacity - sum;
    }

    public int getCapacity() {

        return capacity;
    }
}
