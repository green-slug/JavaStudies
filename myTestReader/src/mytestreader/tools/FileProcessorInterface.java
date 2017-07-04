package mytestreader.tools;

import java.util.List;

/**
 * @author OlgaGalaiko
 */
public interface FileProcessorInterface {
    String fileName = ""; //F02_OLGA.12345 (1).txt
    List<String> fileContent = null; //blablabl in the file
    String fileType = ""; //F02, F09, F15; config; stock_universe
          
    List<MyFile> readFile();
    void writeFile(String fileType);
    String getFileType(String fileName);
    void setFileType(String fileName);
}
