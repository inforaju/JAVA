//							DISPLAY CONTENTS: -

import java.io.File;
import java.io.*;
import java.util.*;

public class display_contents
{
    public static void main(String[] args)
    {
        try
        {
            File myObj = new File("E:\\display_contents.java");
            Scanner sc=new Scanner(myObj);
            
            while(sc.hasNextLine())
            {
                String data=sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
            e.printStackTrace();
        }
        
    }
}