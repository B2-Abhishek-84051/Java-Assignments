package com.app.org;

import java.util.Scanner;

public class Tester {
    static int counter = 0;
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Employee : ");
        int num = sc.nextInt();

        Employee[] e = new Employee[num];
        for (int i = 0; i < num; i++) {
            e[i] = new Employee();
        }

        System.out.print("basic salary : ");
        Employee.basic = sc.nextDouble();

        System.out.println("1. Hire Manager");
        System.out.println("2. Hire Worker");
        System.out.println("3. Display information of all employees");
        System.out.println("4. Update basic salary");
        System.out.println("5. Exit");

        do {
            System.out.print("Enter choice : ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    if (counter < num) {
                        e[counter] = new Manager();
                        System.out.println("Enter Manager Details : ");
                        System.out.print("Name : ");
                        e[counter].setName(sc.next());
                        e[counter].setId();

                        Manager m = (Manager) e[counter];
                        System.out.print("Enter Performance Bonus : ");
                        m.setPerformanceBonus(sc.nextDouble());
                        System.out.println("**** Manager added ****");
                        counter++;
                    }
                    else
                    {
                        System.out.println("No Vacancy");
                    }
                    break;
                case 2:
                    if (counter < num)
                    {
                        e[counter] = new Worker();
                        System.out.println("Enter Worker Details : ");
                        System.out.print("Name : ");
                        e[counter].setName(sc.next());
                        e[counter].setId();
                        Worker w = (Worker) e[counter];
                        System.out.print("Hours Worked : ");
                        w.setHoursWorked(sc.nextDouble());
                        System.out.print("Hourly Rate : ");
                        w.setHourlyRate(sc.nextDouble());
                        System.out.println("**** Worker added ****");
                        counter++;
                    }
                    else
                    {
                        System.out.println("No Vacancy");
                    }

                    break;
                case 3:
                    for (int i = 0; i < num; i++) {
                        System.out.println(e[i]);
                    }
                    break;
                case 4:
                    // Update basic salary
                    System.out.print("Update basic salary : ");
                    Employee.basic = sc.nextDouble();
                    break;
                case 5:break;


            }

        }while(choice != 5);



    }
}
