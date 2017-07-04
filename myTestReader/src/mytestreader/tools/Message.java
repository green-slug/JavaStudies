package mytestreader.tools;

/**
 * @author OlgaGalaiko
 */
public interface Message {
    String MessageType = "";
    String getMessageType(); //NEWC
    void setMessageType();
    void readMessage(String message);
    String createMessage(String message);
}
