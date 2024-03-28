import java.util.Scanner;

// command line argument
public class Que1_2 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int choice=0;
        Scanner sc = new Scanner(System.in);




        do {
            System.out.println("1.Add  2.Subtract  3.Multiply  4.Division  5.Exit");
            System.out.print("Enter your choice : ");
            choice =sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                default:
                    break;
            }
//            int choice = sc.nextInt();
        }while (choice != 5);
    }
}
