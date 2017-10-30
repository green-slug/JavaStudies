/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestreader.tools;

import static java.lang.Double.parseDouble;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import static mytestreader.tools.Request.logger;


public class ResponseAckn implements MessageInterface {

    String type;
    String subType;
    String ID;
    String date;
    String clientNumber;
    String stock = "";
    String buySellFlag = "";
    Double amount = 0.0;
    Double quantity = 0.0;
    String comment = "";
    String relatedID = "";
    
    static final Logger logger = Logger.getLogger(MyFile.class.getName());
    
    public ResponseAckn(){
        setType();
        logger.info("Acknowledgement created");
    }
    
    public ResponseAckn(MessageInterface message){
        
        setType();
        setSubType(message.getSubType());
        setID(message.getID());
        setDate(message.getDate());
        setClientNumber(message.getClientNumber());
        setStock(message.getStock());
        setBuySellFlag(message.getBuySellFlag());
        setAmount(message.getAmount());
        setQuantity(message.getQuantity());
        setComment(message.getComment());
        setRelatedID(message.getRelatedID());
        
  
        logger.info("Acknowledgement " + message.getID() + " created");
    }

    

    
    
    
    @Override
    public void readMessage(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    private void setType(){
        this.type = "Acknowledgement";
    }
    
    private void setSubType(String subType) {
        this.subType = subType;
    }

    private void setID(String ID) {
        this.ID = ID;
    }

    private void setDate(String date) {
        this.date = date;
    }

    private void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    private void setStock(String stock) {
        this.stock = stock;
    }

    private void setBuySellFlag(String buySellFlag) {
        this.buySellFlag = buySellFlag;
    }

    private void setAmount(Double amount) {
        this.amount = amount;
    }

    private void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    private void setComment(String comment) {
        this.comment = comment;
    }

    private void setRelatedID(String relatedID) {
        this.relatedID = relatedID;
    }

}

/*
    void fieldInfo(Object obj) {
        Class<?> theClass = obj.getClass();
        Field[] fields = theClass.getFields();
        //displayFields(fields);
        Field[] declaredFields = theClass.getDeclaredFields();
        displayFields(declaredFields);
      }
  
    void displayFields(Field[] arr) {
        for(Field f:arr)
        System.out.println(f.getName() + " : " + f.getType());
    } 
*/