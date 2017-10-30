/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestreader.other;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import mytestreader.tools.MyFile;

public class FileProcessor implements mytestreader.other.FileProcessorInterface {
    public String folderName = "";
    public String fileName = "";
    
    String fileType = ""; //F02, F09, F15
      
    public String getFolderName() {return folderName;}
    public void setFolderName(String folderName) {this.folderName = folderName;}
    
    public FileProcessor(){}
    
    public FileProcessor(String folderName){
        this.folderName = folderName;

    }
        
    @Override
    public List<MyFile> getFiles() {

       int total = 0;
       String[] parsedLines;
       List<String> messages = new ArrayList<String>();
       List<MyFile> processedFiles = new ArrayList<MyFile>();
               
       java.io.File[] files = new java.io.File(this.folderName).listFiles();
       
       for (java.io.File file:files){
    
       try {
        this.fileName = file.getName();
        
        String filePath = folderName + "\\" + fileName;
        processedFiles.add(new MyFile(filePath));
        } catch(Exception e) {
             System.out.println(e.getMessage());
        } 
        }
       return processedFiles;
    }

    @Override
    public void writeFile(String fileType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getFileType(String fileName) {
        return this.fileType = fileName.substring(0, 3);
    }

    @Override
    public void setFileType(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
