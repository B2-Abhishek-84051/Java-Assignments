import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s1 = sc.next();
        StringBuffer sb = new StringBuffer(s1);
        sb.reverse();
        String s2 = sb.toString();
        if (s1.equals(s2))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}