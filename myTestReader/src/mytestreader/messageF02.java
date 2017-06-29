package mytestreader;

public class messageF02 extends MessageBase {
    public String messageType;
    public String reference;
    public String stock;
    public Integer tradeDate;
    public String stockDescription;
    public double quantity;
    public double consideration;
    public String currency;
    
    public double getConsideration() {return consideration;} 
    public void setConsideration(double consideration) {this.consideration = consideration;}
    public String getCurrency() {return currency;} 
    public void setCurrency(String currency) {this.currency = currency;}
    public String getMessageType() {return messageType;} 
    public void setMessageType(String messageType) {this.messageType = messageType;}
    public double getQuantity() {return quantity;} 
    public void setQuantity(double quantity) {this.quantity = quantity;}
    public String getReference() {return reference;} 
    public void setReference(String reference) {this.reference = reference;}
    public String getStock() {return stock;} 
    public void setStock(String stock) {this.stock = stock;}
    public String getStockDescription() {return stockDescription;} 
    public void setStockDescription(String stockDescription) {this.stockDescription = stockDescription;}
    public Integer getTradeDate() {return tradeDate;} 
    public void setTradeDate(Integer tradeDate) {this.tradeDate = tradeDate;}
        
    messageF02(){}
    messageF02(String messageType, String reference, String stock, Integer tradeDate, String stockDescription, double quantity, double consideration, String currency){
        this.messageType = messageType;
        this.reference = reference;
        this.stock = stock;
        this.tradeDate = tradeDate;
        this.stockDescription = stockDescription;
        this.quantity = quantity;
        this.consideration = consideration;
        this.currency = currency;
    }
}
    