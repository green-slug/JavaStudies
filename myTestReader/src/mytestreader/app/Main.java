package mytestreader.app;

import java.io.IOException;
import mytestreader.tools.MyFile;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import mytestreader.tools.Configuration;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import mytestreader.tools.MessageInterface;
import mytestreader.tools.ResponseAckn;

public class Main {
    
    static Logger logger;
    
    public static void main(String[] args) {

        logger = Logger.getLogger("mytestreader");
        logger.setUseParentHandlers(false);// switch off root logging to console
        System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tF %1$tT - %4$s - %2$s - %5$s%6$s%n");
        
        try {
            FileHandler fileHandler = new FileHandler("test.log", false);        
            Formatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        logger.info("TestReader STARTED");
        
        MessageInterface message = new ResponseAckn();
        
        Configuration configuration = new Configuration();
        
        MyFile file = new MyFile(configuration.getFileName());
        List<String> testOutput = file.getFileContent();
        
      //  for (String test:testOutput) {
      //          System.out.println(test);   
      //  }
        
        logger.info("TestReader STOPPED");
    }
}




/*
        //load logging properties
        try {
            FileInputStream configFile = new FileInputStream("log.properties");
                    logger.info("FileInputStream configFile");
                    
            LogManager.getLogManager().readConfiguration(configFile);
                    logger.info("readConfiguration(configFile)");
            LogManager.getLogManager().getProperty("mytestreader.handlers");
                    logger.info("getProperty mytestreader.handlers");
        System.out.println("test2:" + LogManager.getLogManager().getProperty("mytestreader.handlers"));
                    logger.info("System.out.println");
    
        } catch (IOException ex){
            logger.log(Level.SEVERE, null, ex);
        }

*/
