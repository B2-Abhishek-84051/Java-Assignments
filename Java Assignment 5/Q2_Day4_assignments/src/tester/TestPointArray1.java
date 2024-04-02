package tester;

import Q1.*;

import java.util.Scanner;

public class TestPointArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Enter number of points : ");
        int num = sc.nextInt();
        Point2D[] p = new Point2D[num];

        for (int i =0;i<num;i++)
        {
            p[i] = new Point2D();
        }
        System.out.println("----Enter Co-ordinate info----");
        for(int i=0;i<num;i++)
        {
            System.out.println("Point ["+(i+1)+"] : ");
            p[i].acceptData();
        }

        do
        {
            System.out.println("----MENU----");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display x, y co-ordinates of all points");
            System.out.println("3. Calculate Distance b/w two points");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter point number : ");
                    int i = sc.nextInt();
                    i -= 1;

                    if(i>=0 && i<num)
                    {
                        System.out.println("point["+i+"] = ");
                        System.out.println(p[i].getDetails());
                    }
                    else
                    {
                        System.out.println("INVALID INPUT");
                    }
                    break;
                case 2:
                    System.out.println("Co-ordinates details of all points");
                    for(int j=0;j<num;j++)
                    {
                        System.out.println(p[j].getDetails());
                    }
                    break;
                case 3:
                    System.out.println("***** Distance b/w two points *****");
                    System.out.println("Enter start point number");
                    int p1 = sc.nextInt();
                    System.out.println("Enter end point number");
                    int p2 = sc.nextInt();

                    p1 -= 1;
                    p2 -= 1;
                    if (p[p1].isEqual(p[p2]))
                    {
                        System.out.println("Same Point");
                        System.out.println("Distance = 0");
                    }
                    else
                    {
                        System.out.println(p[p1].getDetails());
                        System.out.println(p[p2].getDetails());
                        System.out.println(Q1.Point2D.calculateDistance(p[p1],p[p2]));
                    }
                    break;
                case 4:
                    break;

                default:
                    System.out.println("INVALID INPUT");
                    break;
            }
        }while(choice != 4);
    }
}
