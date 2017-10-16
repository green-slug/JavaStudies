package mytestreader.tools;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import mytestreader.app.Main;

/**
 *
 * @author OlgaGalaiko
 */
public class Configuration {
        
    public static String fileName;
    public static String folderName;
    
    static Logger logger = Logger.getLogger(MyFile.class.getName());
            
    public Configuration(){
        

        try {
            loadDefaultProps();
            Properties userProps = new Properties(loadDefaultProps());
            loadUserProps(userProps);

        logger.info("properties loaded");    
        } catch (IOException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
}
    
    private static Properties loadUserProps(Properties userProps) throws IOException{
        try {
            if (Files.exists(Paths.get("mytestreader.properties"))){
                Reader reader = Files.newBufferedReader(Paths.get("mytestreader.properties"));
                Properties props = new Properties();
            
                props.load(reader);
            
                folderName = props.getProperty("folderName");
                fileName = folderName + props.getProperty("fileName");

                userProps  = props;
            }
        } catch (IOException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        

        return userProps;
    
    }

    private static Properties loadDefaultProps() throws IOException{
        
            Properties defaultProps = new Properties();
        
            try {
                if (Files.exists(Paths.get("DefaultConfig.xml"))){
                    Reader reader = Files.newBufferedReader(Paths.get("DefaultConfig.xml"));

                    defaultProps.load(reader);

                    folderName = defaultProps.getProperty("folderName");
                    fileName = folderName + defaultProps.getProperty("fileName");
                }
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return defaultProps;
        }
    
    public String getFileName() {
        return fileName;
    }
    
        public String getFolderName() {
        return folderName;
    }
}
