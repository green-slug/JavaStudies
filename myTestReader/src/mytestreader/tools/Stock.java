package mytestreader.tools;

public class Stock {
    public String sedol;
    public String ISIN;
    public Double price;
        
    String getSedol(){return this.sedol;}
    private void setSedol(String sedol){this.sedol = sedol;}
    String getISIN(){return this.ISIN;}
    void setISIN(String ISIN){this.ISIN = ISIN;}
    double getPrice(){return this.price;}
    void setPrice(Double price){this.price = price;}
    
    public Stock(){};
    public Stock(String sedol){
        setSedol(sedol);    
    };
    
}
