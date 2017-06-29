package mytestreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        System.out.println("Begin");
        //initialize
        ReaderBase readFile = new ReaderBase("D:\\MyCodeProjects\\MyTestReader");

        
        //read
        BufferedReader bReader = null;
        int total = 0;
        String[] parsedLines;
   
       File[] files = new File(readFile.folderName).listFiles();
       
       for (File file:files){
           
       try {
        bReader = new BufferedReader(new FileReader(readFile.folderName + "\\" +file.getName()));
        String line = null;
        while ((line = bReader.readLine()) != null){
                System.out.println(file.getName() + " - " + line);
                parsedLines = line.split(";");
                for(String parsedLine : parsedLines){
                    System.out.println(parsedLine);
                }
        }
            
        //    messageF02[] messageF02 = messageF02();
        
        } catch(FileNotFoundException e) {
             System.out.println("Sorry, File Not Found: " + e.getMessage());
        } catch(IOException e) {
             System.out.println("Error interacting with file: " + e.getMessage());
        } catch(Exception e) {
             System.out.println(e.getMessage());
        } finally {
            try{
                if(bReader != null)
                    bReader.close();
            } catch(Exception e){
                System.out.println(e.getMessage());}
        }
       }
       
       System.out.println("End");
    }
}
