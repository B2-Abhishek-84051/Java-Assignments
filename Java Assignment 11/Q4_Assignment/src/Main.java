//  Write a java program to find whether the file is Hidden file or not inside the directory.
//Hint : The IO package of java contains a special method named isHidden()

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException
    {
        File fobj = new File("/home/abhishek/.vimrc");
//        fobj.createNewFile();
        System.out.println("is .vimrc file Hidden? : "+fobj.isHidden());

        File fobj1 = new File("/home/abhishek/file.txt");
        System.out.println("is file.txt Hidden? : "+fobj1.isHidden());
    }
}