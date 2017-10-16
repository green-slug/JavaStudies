/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestreader.tools;

import static java.lang.Double.parseDouble;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import static mytestreader.tools.Configuration.logger;

/**
 *
 * @author OlgaGalaiko
 */
public class Request implements MessageInterface {
    
    String ID = "";
    String type = "";
    String subType = "";
    String date = "";
    String clientNumber = "";
    String stock = "";
    String buySellFlag = "";
    Double amount = 0.0;
    Double quantity = 0.0;
    String comment = "";
    String relatedID = "";
    
    static final Logger logger = Logger.getLogger(MyFile.class.getName());
    
    public Request(){}
    
    public Request(String line){

        readMessage(line);
        logger.info("Request created");
    }
    
    @Override
    public void readMessage(String message) {
                
            String[] messageContent = message.split(";");
        
            setSubType(messageContent[0]);
            setID(messageContent[1]);
            setDate(messageContent[2]);
            setClientNumber(messageContent[3]);
            setStock(messageContent[4]);
            setBuySellFlag(messageContent[5]);
            setAmount(messageContent[6]);
            setQuantity(messageContent[7]);
            setComment(messageContent[8]);
            setRelatedID(messageContent[9]);
        
            logger.info("message parsed");
         }
        
    @Override
    public String createMessage(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getSubType() {
        return this.subType;
    }

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public String getDate() {
        return this.date;
    }

    @Override
    public String getClientNumber() {
        return this.clientNumber;
    }

    @Override
    public String getStock() {
        return this.stock;
    }

    @Override
    public String getBuySellFlag() {
        return this.buySellFlag;
    }

    @Override
    public Double getAmount() {
        return this.amount;
    }

    @Override
    public Double getQuantity() {
        return this.quantity;
    }

    @Override
    public String getComment() {
        return this.comment;
    }

    @Override
    public String getRelatedID() {
        return this.relatedID;
    }

    void setType(){
        this.type = "Request";
    }

    void setSubType(String subType) {
        this.subType = subType;
    }

    void setID(String ID) {
        String timeStamp = new SimpleDateFormat("-yyyyMMdd-HHmmss").format(new Date());
        this.ID = "ReqID-" + ID + timeStamp;
    }

    void setDate(String date) {
        this.date = date;
    }

    void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    void setStock(String stock) {
        this.stock = stock;
    }

    void setBuySellFlag(String buySellFlag) {
        this.buySellFlag = buySellFlag;
    }

    void setAmount(String amount) {
        this.amount = parseDouble(amount+"0");
    }

    void setQuantity(String quantity) {
        this.quantity = parseDouble(quantity+"0");
    }

    void setComment(String comment) {
        this.comment = comment;
    }

    void setRelatedID(String relatedID) {
        this.relatedID = relatedID;
    }

}
