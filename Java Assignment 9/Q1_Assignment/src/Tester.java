import java.util.Scanner;

public class Tester {
    static int choice;
    static int selection;
    static int counter = 0;
    static int size;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        e[0] = new Employee(101, "Ram", 25000);
//        e[1] = new Employee(102, "Shyam", 35000);
//        e[2] = new Employee(103, "Lakshman", 45000);
//        e[3] = new Employee(104, "Bharat", 55000);
//        e[4] = new Employee(105, "Shatrughna", 65000);

        System.out.println("1 -- Choose Fixed Stack");
        System.out.println("2 -- Choose Growable Stack");
        System.out.println("Enter Selection : ");
        selection = sc.nextInt();

        switch (selection) {
            case 1: //Fixed Stack
                FixedStack fs = new FixedStack();
                fs.fixedStack();
                break;

            case 2 ://growable
                GrowableStack gs = new GrowableStack();
                gs.growableStack();
                break;

            case 0 :
                break;
            default:
                System.out.println("INVALID INPUT");
                break;
        }
    }
}