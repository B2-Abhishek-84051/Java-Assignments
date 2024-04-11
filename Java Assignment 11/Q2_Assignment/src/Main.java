import java.io.*;
import java.util.ArrayList;

// Write a Java program to store text file content line by line into an array
public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException
    {
        try(BufferedReader br = new BufferedReader(new FileReader(new File("File.txt")));)
        {
            File fobj = new File("File.txt");
            fobj.createNewFile();   //text file is created

            ArrayList<String> al = new ArrayList<>();

            String str;
            while ((str = br.readLine())!=null)
            {
                al.add(str);
            }
            for (String i : al)
                System.out.println(i);
        }
    }
}