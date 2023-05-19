import java.io.*;
import java.util.*;
import java.io.IOException;

public class copyOFaFile {
    public static void main(String arr[]){
        String inputFile = "try.txt";
        String outputFile = "output.txt";

        try{
            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile);
            int character;
            while((character =reader.read())!= -1)
            {
                writer.write(character);
            }
            reader.close();
            writer.close();
            System.out.println("Copied");
        }
        catch(IOException e){
        System.out.println("An error Occured");
        e.printStackTrace();

        }
    }
}