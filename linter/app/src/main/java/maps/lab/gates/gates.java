package maps.lab.gates;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class gates {


//    public void fileReader(){
//        File file = new File("gates.js");
//
//        try( Scanner scanner = new Scanner(file);){
//            while (scanner.hasNextLine()){
//                System.out.println(scanner.nextLine());
//            }
//        }catch (FileNotFoundException fileNotFoundException){
//            System.out.println(fileNotFoundException.getMessage());
//        }
//    }

    public void filePathReader(String filename) {
        Path path = Paths.get(filename + ".js");
        int count = 1;
        try {
            BufferedReader reader = Files.newBufferedReader(path);
            String line = reader.readLine();
            while (line != null) {

                if(!line.contains(";") && !line.contains("{") && !line.contains("}") && !line.contains("if") && !line.contains("else") && !line.equals("")){
                    System.out.println("Line "+ count+": Missing semicolon.");
                }
                count++;

                line = reader.readLine();
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        } finally {
            System.out.println("Program executed"); // read up on why this is useful
        }
    }

}
