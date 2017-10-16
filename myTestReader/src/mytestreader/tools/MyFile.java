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

    static final Logger logger = Logger.getLogger(MyFile.class.getName());
    
    public MyFile(){}
    
    public MyFile(String fileName){
     this.fileName = fileName;
     this.fileContent = readFileContent(fileName);

     if (this.fileContent.isEmpty()) {
         logger.info("No file");
     }
     else {
         logger.log(Level.INFO, "File processed: {0}", this.fileName); 
     }     
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
                if ( (line.indexOf("HEADER") != 0) ) {
                    messages.add(line);
                }
            }
        } catch(FileNotFoundException e) {
            logger.log(Level.SEVERE, "Sorry, File not found: {0}", e);
        } catch(IOException e) {
             logger.log(Level.INFO,"{0}"+" - " + "Sorry, Error interacting with file: {1}", new Object[]{logger.getName(), e.getMessage()});
        } catch(Exception e) {
             logger.log(Level.INFO, "{0} - {1}", new Object[]{logger.getName(), e.getMessage()});
        } 
        return messages;
    }
    
    public String getFileType(String fileName) {
        return this.fileType = fileName.substring(0, 3);
    }
}