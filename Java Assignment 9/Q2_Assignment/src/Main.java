import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int num;
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of colours : ");
        num = sc.nextInt();
        for (int i = 0; i < num; i++)
        {
            System.out.print("Enter colour : ");
            String tmp = sc.next();
            al.add(tmp);
        }

        System.out.println("Unsorted array = "+al);
        Collections.sort(al);
        System.out.println("Sorted array = "+al);
    }
}