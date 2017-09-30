package mytestreader.tools;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFile {
    String fileName = ""; //F02_OLGA.12345 (1).txt
    List<String> fileContent = null; //blablabl in the file
    String fileType = ""; //F02, F09, F15; config; stock_universe

    static Logger logger = Logger.getLogger(MyFile.class.getName());
    
    public MyFile(){}
    
    public MyFile(String fileName){
     this.fileName = fileName;
     this.fileContent = readFileContent(fileName);
     
     logger.info("file " +  this.fileName + " processed"); 
        
    }
    
    public String getFileType(){
        return this.fileType;
    }
    
    public String getFileName(){
        return this.fileName;
    }
    
    public List<String> getFileContent(){
        return this.fileContent;
    }
    
    public List<String> readFileContent(String fileName){
/**reads content from file-system file "fileName"
 *and returns content as array of string lines*/
            List<String> messages = new ArrayList<String>();


    
    try {
        BufferedReader bReader = new BufferedReader(new FileReader(this.fileName));
        String line = null;
        while ((line = bReader.readLine()) != null){
            messages.add(line);
        }
        } catch(FileNotFoundException e) {
            logger.log(Level.SEVERE, "Sorry, File not found: " + e);
            
            //logger.info(logger.getName() + " - " + "Sorry, File not found: " + e.getMessage());
        } catch(IOException e) {
             logger.info(logger.getName()+ " - "+"Sorry, Error interacting with file: " + e.getMessage());
        } catch(Exception e) {
             logger.info(logger.getName()+ " - "+e.getMessage());
        } 
        return messages;
    }
    
    public String getFileType(String fileName) {
        return this.fileType = fileName.substring(0, 3);
    }
}