package at.leander.ObjektOrientierteProgrammierung.Handy;


import java.util.List;

public class Phone {

    private SDCard sdCard;

    public Phone(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public void printAllFiles(){
        List<PhoneFile> files = this.sdCard.getFiles();
        for (PhoneFile file: files
              ) {
            System.out.println(file.getInfo());
        }
    }



}
