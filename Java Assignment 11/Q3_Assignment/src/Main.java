import java.io.*;

//  Write a Java program to find the longest word in a text file.
public class Main {
    public static void main(String[] args) throws IOException
    {
        try(BufferedReader br = new BufferedReader(new FileReader(new File("File.txt")));)
        {
            String longest = "";
            String str;
            while ((str = br.readLine())!=null)
            {
                String[] temp = str.split(" ");
                for ( String i : temp) {
                    if (i.length() > longest.length())
                        longest = i;
                }
            }
            System.out.println("Longest Word : \""+longest+"\"");
        }
    }
}