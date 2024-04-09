import java.util.Scanner;
import java.util.Stack;
import static java.lang.System.exit;

public class GrowableStack {
    static int choice;
    Scanner sc = new Scanner(System.in);

    void growableStack()
    {
        Stack<Employee> stack = new Stack<>();
        Employee emp = new Employee();
        while (true) {
            System.out.println("1. Push\t2. Pop\t3. Peek\t4. Exit");
            System.out.print("Enter choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Push
                    emp.acceptEmployeeInfo();
                    stack.push(emp);
                    break;
                case 2:
                    // Pop
                    System.out.println("deleting entry : ");
                    System.out.println(stack.peek());
                    stack.pop();
                    break;
                case 3:
                    //peek
                    System.out.println(stack.peek());
                    break;
                case 4:
                    exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
