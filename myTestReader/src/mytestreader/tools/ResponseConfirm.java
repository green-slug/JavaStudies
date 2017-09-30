/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestreader.tools;


public class ResponseConfirm implements MessageInterface{
    
    String type = "";
    String subType = "";
    String ID = "";
    String date = "";
    String clientNumber = "";
    String stock = "";
    String buySellFlag = "";
    Double amount = 0.0;
    Double quantity = 0.0;
    String comment = "";
    String relatedID = "";
    
    public ResponseConfirm(){
        setType();
    }
    
    public ResponseConfirm(MessageInterface message){
        setType();
    }
    
    void setType(){
        this.type = "Confirmation";
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

    @Override
    public void readMessage(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String createMessage(String message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
