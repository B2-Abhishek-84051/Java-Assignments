package com.bank.info;

import java.util.Scanner;

public class Customer {
    private static String customerName;
    private static int cid;
    private static String dob;
    private static double accountBalance = 0;
    static Scanner sc = new Scanner(System.in);

    public Customer() {
    }
    public static void acceptCustomerinfo()
    {
        System.out.print("Customer Name : ");
        customerName = sc.next();
        System.out.print("Date of Birth : ");
        dob = sc.next();
        cid += 1;
    }
    public static void addbalance()
    {
        System.out.println("Enter amount to add :");
        accountBalance += sc.nextInt();
    }

    public static void dispCustomerInfo()
    {
        System.out.println("Customer Name = "+customerName+" Customer Id = "+cid);
        System.out.println("Employee DOB = "+dob);
        System.out.println("Balance = "+accountBalance);
    }
}
