package session10;

import java.io.*;

public class Files_Character {
    public static void main(String[] args) {

        // Buffered Writer
        String fileName = "myNotes.txt";
        File file = new File(fileName);

//        FileWriter fileWriter = new FileWriter(fileName);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName)); // Anonymous Object
        ){
            bufferedWriter.write("This is the First Line.");
            bufferedWriter.newLine();
            bufferedWriter.write("This is the Second Line.");
            bufferedWriter.newLine();
            bufferedWriter.write("This is the Third Line.");
            bufferedWriter.newLine();

            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Buffered Reader

        try(
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }


    }



}
