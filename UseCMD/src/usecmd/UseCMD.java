package usecmd;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths; //Paths - Factory for creating Path instances  for defaul file system

public class UseCMD {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if(args.length == 0) { 
            showUsage();
            return;
        }
                
        String filename = args[0];
        
        if(!Files.exists(Paths.get(filename))){
            System.out.println("File does not exist" + filename);
            return;
        }
        showFileLines(filename);
        
    }
    
    private static void showFileLines(String filename) {
        System.out.println();

        try(BufferedReader reader = Files.newBufferedReader(Paths.get(filename))) {
            
            
            
            String line = null;
            while((line = reader.readLine()) != null)
                System.out.println(line);
        } catch(Exception ex) {
            System.out.println(ex.getClass().getSimpleName() + " - " + ex.getMessage());
        }
    }

    private static void showUsage() {
        System.out.println();
        System.out.println("Please provide the file to process on the command line");
    }
    
}
