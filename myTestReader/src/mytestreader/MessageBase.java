package mytestreader;

public abstract class MessageBase {
    public String fileType;
    
    public String getFileType() {return fileType;}
    public void setFileType(String folderName) {this.fileType = fileType;}
    
    public MessageBase() {}
    public MessageBase(String fileType){
        this.fileType = fileType;
       
    }
    
}
