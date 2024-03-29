/*3. Display food menu to user. User will select items from menu along with the
quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed
prices to food items(hard code the prices) When user enters 'Generate Bill'
option , display total bill & exit.
*/

import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Total = 0;
        int choice = 0;
        int qty;
        int qty_dosa=0, qty_samosa=0, qty_idli=0, qty_poha=0, qty_khichidi=0;
        int qty_misal=0, qty_full=0, qty_mini=0;
        int qty_kachori=0;
        System.out.println("----*MENU*----");
        System.out.println("1.Dosa    2.Samosa   3.Idli       4.Poha      5.Khichidi");
        System.out.println("6.Kachori 7.Misal    8.Full Thali 9.Mini Thali");
        System.out.println("10.Generate Bill");
        System.out.println("*****************");
        do
        {
            System.out.println("Enter item : ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Dosa");
                    System.out.println("Enter number of items : ");
                    qty_dosa = sc.nextInt();
                    Total = Total + (5*qty_dosa);
                    break;
                case 2:
                    System.out.println("Samosa");
                    System.out.println("Enter number of items : ");
                    qty_samosa = sc.nextInt();
                    Total = Total + (5*qty_samosa);
                    break;
                case 3:
                    System.out.println("Idli");
                    System.out.println("Enter number of items : ");
                    qty_idli = sc.nextInt();
                    Total = Total + (5*qty_idli);
                    break;
                case 4:
                    System.out.println("Poha");
                    System.out.println("Enter number of items : ");
                    qty_poha = sc.nextInt();
                    Total = Total + (5*qty_poha);
                    break;
                case 5:
                    System.out.println("Khichidi");
                    System.out.println("Enter number of items : ");
                    qty_khichidi = sc.nextInt();
                    Total = Total + (5*qty_khichidi);
                    break;
                case 6:
                    System.out.println("Kachori");
                    System.out.println("Enter number of items : ");
                    qty_kachori = sc.nextInt();
                    Total = Total + (5*qty_kachori);
                    break;
                case 7:
                    System.out.println("Misal");
                    System.out.println("Enter number of items : ");
                    qty_misal = sc.nextInt();
                    Total = Total + (5*qty_misal);
                    break;
                case 8:
                    System.out.println("Full Thali");
                    System.out.println("Enter number of items : ");
                    qty_full = sc.nextInt();
                    Total = Total + (5*qty_full);
                    break;
                case 9:
                    System.out.println("Mini Thali");
                    System.out.println("Enter number of items : ");
                    qty_mini = sc.nextInt();
                    Total = Total + (5*qty_mini);
                    break;
                case 10:
                    System.out.println("**********  BILL  **********");
                    System.out.println("item\t\tprice\tqty\tprice");
                    if(qty_dosa != 0)
                    {
                        System.out.println("Dosa\t\tRs.5\t"+qty_dosa+"\t"+(5*qty_dosa));
                    }
                    if(qty_samosa != 0)
                    {
                        System.out.println("Samosa\t\tRs.5\t"+qty_samosa+"\t"+(5*qty_samosa));
                    }
                    if(qty_idli != 0)
                    {
                        System.out.println("Idli\t\tRs.5\t"+qty_idli+"\t"+(5*qty_idli));
                    }
                    if(qty_poha != 0)
                    {
                        System.out.println("Poha\t\tRs.5\t"+qty_poha+"\t"+(5*qty_poha));
                    }
                    if(qty_khichidi != 0)
                    {
                        System.out.println("Khichidi\tRs.5\t"+qty_khichidi+"\t"+(5*qty_khichidi));
                    }
                    if(qty_kachori != 0)
                    {
                        System.out.println("Kachori\t\tRs.5\t"+qty_kachori+"\t"+(5*qty_kachori));
                    }
                    if(qty_misal != 0)
                    {
                        System.out.println("Misal\t\tRs.5\t"+qty_misal+"\t"+(5*qty_misal));
                    }
                    if(qty_full != 0)
                    {
                        System.out.println("Full Thali\tRs.5\t"+qty_full+"\t"+(5*qty_full));
                    }
                    if(qty_mini != 0)
                    {
                        System.out.println("Mini Thali\tRs.5\t"+qty_mini+"\t"+(5*qty_mini));
                    }
                    System.out.println("----------------------------");
                    System.out.println("Total = "+Total);
                    break;
                default:
                    System.out.println("INVALID INPUT");
                    break;
            }
        }while (choice != 10);
    }
}
