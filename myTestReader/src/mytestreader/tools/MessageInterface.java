package mytestreader.tools;

/**
 * @author OlgaGalaiko
 */
public interface MessageInterface {
    
    public String getType();
    public String getSubType();
    public String getID();
    public String getDate();
    public String getClientNumber();
    public String getStock();
    public String getBuySellFlag();
    public Double getAmount();
    public Double getQuantity();
    public String getComment();
    public String getRelatedID();

    void readMessage(String message);
    String createMessage(String message);
}
