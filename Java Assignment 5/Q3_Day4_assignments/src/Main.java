import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int num = sc.nextInt();
        String[] s1 = new String[num];
        String[] s2 = new String[num];

        System.out.println("Enter String 1 elements : ");
        for(int i=0; i<num; i++)
        {
            s1[i] = new String();
            System.out.print("Element ["+i+"] : ");
            s1[i] = sc.next();
        }
        System.out.println("Enter String 2 elements : ");
        for(int i=0; i<num; i++)
        {
            s2[i] = new String();
            System.out.print("Element ["+i+"] : ");
            s2[i] = sc.next();
        }

        System.out.println("Duplicate Values : ");
        for (String i : s1)
        {
            for (String j : s2)
            {
                if(i.equals(j))
                {
                    System.out.println(i+"\t");
                }
            }
        }
    }
}