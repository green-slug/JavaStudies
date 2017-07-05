package mytestreader.app;

import java.util.List;
import mytestreader.other.FileProcessor;
import mytestreader.tools.MyFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String fileName = "D:\\MyCodeProjects\\MyTestReaderFTP\\from\\F02_OLGA.12345 (1).txt";
        
       // FileProcessor file = new FileProcessor("D:\\MyCodeProjects\\MyTestReaderFTP\\from"); //\\F02_OLGA.12345 (1).txt
        MyFile file = new MyFile(fileName);
        
        List<String> testOutput = file.getFileContent();
    }
}
