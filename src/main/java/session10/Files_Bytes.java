package session10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files_Bytes {
    public static void main(String[] args) throws IOException {
//
//        // Reading byte code of original photo
//        File originalPhoto = new File("picture.jpg");
//        byte[] originalPhotoBytes = new byte[(int) originalPhoto.length()];  // Type Casting
//
//        FileInputStream fileInputStream = new FileInputStream(originalPhoto);
//        fileInputStream.read(originalPhotoBytes); // Reading original file's bytes , into byte array
//        System.out.println("Photo byte code read from : " + originalPhoto.getAbsolutePath());
//        fileInputStream.close();
//
//        // Writing photo byte code to the new photo copy
//
//        File copiedPhoto = new File("copyPicture.jpg");
//        FileOutputStream outputStream = new FileOutputStream(copiedPhoto);
//        outputStream.write(originalPhotoBytes);
//        outputStream.close();
//
//        System.out.println("\nPicture copied to : "+ copiedPhoto.getAbsolutePath());

        File pic1 = new File("original.jpg");
        File pic2 = new File("copy.jpg");

        copyFiles(pic1, pic2);

    }
    static void copyFiles(File source, File destination) throws IOException{
        FileInputStream fileInputStream = new FileInputStream(source);
        byte[] originalFileBytes = new byte[(int) source.length()];
        fileInputStream.read(originalFileBytes);

        FileOutputStream outputStream = new FileOutputStream(destination);
        outputStream.write(originalFileBytes);

        fileInputStream.close();
        outputStream.close();

    }
}
