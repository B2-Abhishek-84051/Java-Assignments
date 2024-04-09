import java.util.Scanner;

public class Employee {
    int id;
    String name;
    double salary;

    public Employee() {
        this(0, "Null", 0);
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ']';
    }
    void acceptEmployeeInfo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee id : ");
        this.id = sc.nextInt();
        System.out.print("Enter Employee name : ");
        this.name = sc.next();
        System.out.print("Enter Employee salary : ");
        this.salary = sc.nextDouble();
    }
}
