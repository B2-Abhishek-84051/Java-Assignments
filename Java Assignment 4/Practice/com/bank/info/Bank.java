package com.bank.info;

import java.util.Scanner;

public class Bank {
    private static String bankName;
    private static String bankLocation;
    private static String bankIFSC;
    private static int bankNumberOfCustomer = 0;

    static Scanner sc = new Scanner(System.in);

    public Bank() {
    }
    public static void acceptBankInfo()
    {
        System.out.println("----Enter Bank Info----");
        System.out.print("Enter Bank Name : ");
        bankName = sc.next();
        System.out.print("Enter Bank Location : ");
        bankLocation = sc.next();
        System.out.print("Enter Bank IFSC Code : ");
        bankIFSC = sc.next();
    }
    public static void addCustomer()
    {
        Customer.acceptCustomerinfo();
        bankNumberOfCustomer += 1;
    }

    public static void dispBankInfo() {
        System.out.println("Bank Name = "+bankName+"\tIFSC Code = "+bankIFSC+"\nBank Location = "+bankLocation+"\nNumber of Customers = "+bankNumberOfCustomer);
    }
}
