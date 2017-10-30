package mytestreader.tools;

import static java.lang.Double.parseDouble;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class Stock {

    static final Logger logger = Logger.getLogger(Stock.class.getName());
    
    public HashMap<String, Double> stockPrice = null;
    public HashMap<String, Double> stockSettlDate = null;

    String ISIN;
    Double price;
      
    public Stock(){};
    
    public Stock(List<String> fileContent){
        
        
        stockPrice = new HashMap<String, Double>();
        
        for (String line : fileContent) {
            
            String[] lineContent = line.split(";");

            setISIN(lineContent[0]);
            setPrice(lineContent[1]);


            stockPrice.putIfAbsent(ISIN, price);
        }
    

        logger.info("Stocks loaded created - " + stockPrice.size());
    }
    
        String getISIN(){
        return this.ISIN;
    }
    
    void setISIN(String ISIN){
        this.ISIN = ISIN;
    }
    
    double getPrice(){
        return this.price;
    }
    
    void setPrice(String price){
        this.price = parseDouble(price+"0");
    }
    
    
}
