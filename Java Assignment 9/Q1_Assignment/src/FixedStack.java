import java.util.Scanner;
import java.util.Stack;
import static java.lang.System.exit;

public class FixedStack {
    static int counter = 0;
    static int size;
    static int choice;

    void fixedStack()
    {
        Scanner sc = new Scanner(System.in);

        Stack<Employee> stk = new Stack<>();
        System.out.print("Enter Stack Size = ");

        size = sc.nextInt();
        Employee e[] = new Employee[size];
        for( int i = 0; i<size; i++)
        {
            e[i] = new Employee();
        }

        while (true) {

            System.out.println("1. Push\t2. Pop\t3. Peek\t4. Exit");
            System.out.print("Enter choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Push
                    if (counter < size) {
                        e[counter].acceptEmployeeInfo();
                        stk.push(e[counter]);
                        counter++;
                    } else {
                        System.out.println("Stack is Full");
                    }
                    break;
                case 2:
                    // Pop
                    if (counter == 0) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("deleting entry : ");
                        System.out.println(stk.peek());
                        stk.pop();
                        counter--;
                    }
                    break;
                case 3:
                    //peek
                    if (counter == 0) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println(stk.peek());
                    }
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
