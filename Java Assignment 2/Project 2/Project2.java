import java.util.Scanner;

/*2. Accept 2 double values from User (using Scanner). Check data type. If
arguments are not doubles, supply suitable error message & terminate.
If numbers are double values, print its average.
 */
public class Project2 {
    public static void main(String[] args) {
        double num1;
        double num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st double : ");

        if (sc.hasNextDouble()) {
            num1 = sc.nextDouble();
            System.out.print("Enter 2st double : ");
            if (sc.hasNextDouble()) {
                num2 = sc.nextDouble();
                System.out.println("Average (" + num1 + " + " + num2 + ") = " + ((num1 + num2) / 2));
            }
        }
        else
        {
            System.out.println("You have inputed non double number.");
        }
    }
}
