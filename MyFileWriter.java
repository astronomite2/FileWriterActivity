import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class MyFileWriter {
    public static void main(String[] args) {
        String passKey = "MarvelJesusD33DP001";
        String confidentialData = ":OOOO";
        String disneyPlusPass = ".disneyPlusPass.txt";
        String topSecret = ".classified/confidential.dat";

        // 1. Using FileWriter
        try (FileWriter writer = new FileWriter(disneyPlusPass)) {
            writer.write(passKey);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter(topSecret)) {
            writer.write(confidentialData);
        } catch (IOException e) {
            e.printStackTrace();
        }
        printFileSize("SillyClass.java");
    }
    //printFileSize gets the filesize of a given file
    //@param fileName the name of the file
    public static void printFileSize(String fileName)
    {
        //implement my print filesize
        File file = new File(fileName);
        System.out.println(file.length());
    }
}