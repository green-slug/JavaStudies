package zipfile;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files; //Files - provides methods for interacting with files
import java.nio.file.Path; //Path - locates file system item
import java.nio.file.Paths; //Paths - Factory for creating Path instances  for defaul file system
import java.nio.file.FileSystem; //FileSystem - represents A file system; FS's idetntified by URI
import java.nio.file.FileSystems; //FileSystems - methods to create/open FS
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZipFile {

public static void main(String[] args) {
        String[] data = {
            "Line 1",
            "Line 2 2",
            "Line 3 3 3",
            "Line 4 4 4 4",
            "Line 5 5 5 5 5"     
        };
        //below we use try-with-resources which automates resources cleanup
        try(FileSystem zipFs = openZip(Paths.get("myData.zip"))){
            copyToZip(zipFs);
            writeToFileInZip1(zipFs, data);
            writeToFileInZip2(zipFs, data);
        } catch(Exception e){
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
    
    //create zip file system
    private static FileSystem openZip(Path zipPath) throws IOException, URISyntaxException{
        Map<String, String> providerProps = new HashMap(); //to store name-value pairs
        providerProps.put("create", "true");
        
        URI zipUri = new URI("jar:file", zipPath.toUri().getPath(), null);
        
        FileSystem zipFs = FileSystems.newFileSystem(zipUri, providerProps); //create
        
        return zipFs;    
    }
    
    private static void copyToZip(FileSystem zipFS) throws IOException {
        //Path sourceFile = FileSystems.getDefault().getPath("file1.txt");
        Path sourceFile = Paths.get("file1.txt"); // short way to get path in the default file system - or this can be done as above
        Path destFile = zipFS.getPath("/file1copied.txt");
        
        Files.copy(sourceFile, destFile, StandardCopyOption.REPLACE_EXISTING);
    }
    
        private static void writeToFileInZip1(FileSystem zipFS, String[] data) throws IOException {
            try(BufferedWriter writer = Files.newBufferedWriter(zipFS.getPath("/newFile1.txt"))){
                for (String d:data){
                    writer.write(d);
                    writer.newLine();
                }
        } catch(Exception e){
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }

        private static void writeToFileInZip2(FileSystem zipFS, String[] data) throws IOException {
            Files.write(zipFS.getPath("/newFile2.txt"), Arrays.asList(data), // not just data because write requires list of strings, not array of strings
                    Charset.defaultCharset(), StandardOpenOption.CREATE);
    
    }

    
}
