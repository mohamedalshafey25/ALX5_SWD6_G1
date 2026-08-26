package session10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {


        File file = new File("example.txt");
        // try with resources
        try (FileWriter fileWriter = new FileWriter("example.txt"))
        {
            file.createNewFile();
            fileWriter.write("Hello.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }






    }

}
