import java.util.Scanner;

import static java.lang.System.exit;

interface Arithmetic{
    double calc(double a, double b);
}

public class Main implements Arithmetic{
    static void calculate(double num1, double num2, Arithmetic op) {
        double result = op.calc(num1, num2);
        System.out.println("Result: "+result);
    }
    public static void main(String[] args) {
        int choice;

        Scanner sc = new Scanner(System.in);

        while (true)
        {
            double num1 = 0,num2 = 0;
            System.out.println("1.Addition\t2.Substraction\t3.Multiplication\t4.Division\n0.Exit");
            System.out.print("Enter choice : ");
            choice = sc.nextInt();
            if (choice != 0){
                System.out.print("Enter number : ");
                num1 = sc.nextDouble();
                System.out.print("Enter number : ");
                num2 = sc.nextDouble();
            }

            switch (choice)
            {
                case 1:
                    calculate(num1, num2, (x,y)->x+y);
                    break;
                case 2:
                    calculate(num1, num2, (x,y)->x-y);
                    break;
                case 3:
                    calculate(num1, num2, (x,y)->x*y);
                    break;
                case 4:
                    calculate(num1, num2, (x,y)->x/y);
                    break;
                case 0:
                    exit(0);
                    break;
            }

        }
    }

    @Override
    public double calc(double a, double b) {
        return 0;
    }
}