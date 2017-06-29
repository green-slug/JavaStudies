package mytestreader;

import java.io.File;

public class ReaderBase {
    public String folderName ;
    
    public String getFolderName() {return folderName;}
    public void setFolderName(String folderName) {this.folderName = folderName;}
    
    public ReaderBase() {}
    public ReaderBase(String folderName){
        this.folderName = folderName;
       // File folder = new File(this.folderName);
    }
    
//    File folder = new File(folderName);
}
