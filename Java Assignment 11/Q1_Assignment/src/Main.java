import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
        File fobj = new File("MyFile.txt");
        System.out.println("Does file exists? : "+fobj.exists());   //false
        if(fobj.createNewFile())
            System.out.println("New File Created");
        else
            System.out.println("File is not created");
        System.out.println("Does file exists? : "+fobj.exists());   //true

    }
}