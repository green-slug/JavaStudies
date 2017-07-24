package mytestreader.app;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import mytestreader.other.FileProcessor;
import mytestreader.tools.MyFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        
        Properties props = new Properties();
        String fileName = "";
        
        try {
            Reader reader = Files.newBufferedReader(Paths.get("mytestreader.properties"));
            props.load(reader);
            
            System.out.println("test: " + props.getProperty("folderName").toString() + props.getProperty("fileName").toString());
            fileName = props.getProperty("folderName").toString() + props.getProperty("fileName").toString();
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        MyFile file = new MyFile(fileName);
        
        List<String> testOutput = file.getFileContent();
        
        for (String test:testOutput) {
                System.out.println(test);
        }
        

    }
}
