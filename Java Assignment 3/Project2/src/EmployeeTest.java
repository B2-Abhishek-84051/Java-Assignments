/*2.Create a class called Employee that includes three instance variables—a
first name (type String), a last name (type String) and a monthly salary
(double). Provide a constructor that initializes the three instance variables.
Provide a set and a get method for each instance variable. If the monthly
salary is not positive, do not set its value. Write a test application named
EmployeeTest that demonstrates class Employee’s capabilities. Create two
Employee objects and display each object’s yearly salary. Then give each
Employee a 10% raise and display each Employee’s yearly salary again.*/

import java.util.Scanner;

class Employee{
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee() {
        this("First Name", "Last Name", 00.00);
    }

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
    double yearlySalary()
    {
        return monthlySalary*12;
    }
    void acceptData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        firstName = sc.next();
        System.out.print("Enter Last Name : ");
        lastName = sc.next();
        System.out.print("Enter salary : ");
        double sal = sc.nextDouble();
        setMonthlySalary(sal);
    }
    double hike()
    {
        return (yearlySalary() + yearlySalary()*0.1);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        System.out.println(e1);
        e1.acceptData();
        System.out.println(e1);
        System.out.println("Yearly Salary = "+e1.yearlySalary());
        System.out.println("10% Hike = "+e1.hike());
        e2.acceptData();
        System.out.println(e2);
        System.out.println("Yearly Salary = "+e2.yearlySalary());
        System.out.println("10% Hike = "+e2.hike());
    }
}