package mytestreader.tools;

/**
 * @author OlgaGalaiko
 */
public interface Message {
    String messageType = "";
    String messageContent = "";
    
    String getMessageType(); //NEWC
    void setMessageType(String messageType);
    void readMessage(String message);
    String createMessage(String message);
}
