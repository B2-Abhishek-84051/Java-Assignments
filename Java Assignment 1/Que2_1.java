import java.util.Scanner;

public class Que2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        System.out.println("The greater number among "+num1+" & "+num2);
        if (num1>num2)
        {
            System.out.println(num1);
        }
        else
        {
            System.out.println(num2);
        }
    }
}
