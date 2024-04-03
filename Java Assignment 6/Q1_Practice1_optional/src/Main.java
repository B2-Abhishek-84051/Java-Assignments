import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int accountNumber;
        int beginningBalance;
        int itemsCharged;
        int credit;
        int creditLimit;
        int newBalance;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number : ");
        accountNumber = sc.nextInt();
        System.out.print("Enter Beginning Balance : ");
        beginningBalance = sc.nextInt();
        System.out.print("Enter total of all items charged : ");
        itemsCharged = sc.nextInt();
        System.out.print("Enter credits applied to the customer’s account : ");
        credit = sc.nextInt();
        System.out.print("Enter the Credit Limit : ");
        creditLimit = sc.nextInt();

        newBalance = beginningBalance + itemsCharged - credit;

        if (newBalance > creditLimit)
        {
            System.out.println("Credit Limit Exceeded by Rs."+(newBalance-creditLimit));
        }
        else
        {
            System.out.println("New Balance = Rs."+newBalance);
        }
    }
}