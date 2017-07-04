/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytestreader.tools;

import java.util.List;

/**
 *
 * @author OlgaGalaiko
 */
public class MyFile {
    String fileName = ""; //F02_OLGA.12345 (1).txt
    List<String> fileContent = null; //blablabl in the file
    String fileType = ""; //F02, F09, F15; config; stock_universe
    
    MyFile(){}
    MyFile(String fileName, List<String> fileContent){
     this.fileName = fileName;
     this.fileContent = fileContent;
    }
}
