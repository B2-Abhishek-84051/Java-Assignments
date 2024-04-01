package com.bank.info;

import java.util.Scanner;

public class BankEmployee {
    private static String employeeName;
    private static int eid = 100;
    private static double salary = 70000;
    private static int age;
    static Scanner sc = new Scanner(System.in);

    public BankEmployee() {
    }
    public static void acceptEmpInfo()
    {
        System.out.print("Enter Employee Name : ");
        employeeName = sc.next();
        System.out.print("Enter Employee Age : ");
        age = sc.nextInt();
        eid += 1;
    }

    public static void dispEmpInfo()
    {
        System.out.println("Employee Name = "+employeeName+" Employee Id = "+eid);
        System.out.println("Employee Age = "+age);
        System.out.println("Salary = "+salary);
    }
}
