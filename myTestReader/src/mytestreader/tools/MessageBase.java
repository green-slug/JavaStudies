package mytestreader.tools;

public abstract class MessageBase implements Message {
    String messageType = "";
    
    @Override
    public String getMessageType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMessageType(String messageType){
        this.messageType = messageType;
    };

    @Override
    public void readMessage(String message) {
        //  parsedLines = line.split(";");
        //  for(String parsedLine : parsedLines){System.out.println(parsedLine);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String createMessage(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
    
    
  //  public String fileType;
    
 //   public String getFileType() {return fileType;}
//    public void setFileType(String folderName) {this.fileType = fileType;}
    
  //  public MessageBase() {}
   // public MessageBase(String fileType){
    //    this.fileType = fileType;
       
    //}
    
}
