package fruitBasket;
import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;
//import com.app.fruits.fruitMarket.*;

import java.util.Scanner;

public class Tester {
    static int counter = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter basket size : ");
        int num = sc.nextInt();
        Fruit[] Basket = new Fruit[num];
        for (int i=0; i<num; i++) {
            Basket[i] = new Fruit();
        }
        int choice;

        System.out.println("-----Fruit Basket-----");
        System.out.println("1. Add Mango\n2. Add Orange\n3. Add Apple");
        System.out.println("4. Display names of all fruits in the basket");
        System.out.println("5. Display name,color,weight,taste of all fresh fruits, in the basket");
        System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.\n" +
                "7. Mark a fruit as stale");
        System.out.println("8. Mark all sour fruits stale (optional)");
        System.out.println("10. Exit");

        do
        {
            System.out.print("Enter choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    if (counter < num)
                    {
                        Basket[counter] = new Mango("Yellow",250.0,"Mango",true);
                        counter++;
                        System.out.println("Mango added to basket");

                    }
                    else
                    {
                        System.out.println("Basket is Full!!!");
                    }
                    break;
                case 2:
                    if (counter < num) {
                        Basket[counter] = new Orange("Orange", 170.0, "Orange", true);
                        counter++;
                        System.out.println("Orange added to basket");
                    }
                    else
                    {
                        System.out.println("Basket is Full!!!");
                    }
                    break;
                case 3:
                    if (counter < num) {
                        Basket[counter] = new Apple("Red", 180.0, "Apple", true);
                        counter++;
                        System.out.println("Apple added to basket");
                    }
                    else
                    {
                        System.out.println("Basket is Full!!!");
                    }
                    break;
                case 4:
                    // Display names of all fruits in the basket
                    if (counter == num) {
                        System.out.println("Fruits in basket : ");
                        for (int i = 0; i < num; i++) {
                            System.out.println((i+1)+"] "+Basket[i].getName());
                        }
                    }
                    else
                    {
                        System.out.println((num-counter)+" places are empty");
                    }
                    break;
                case 5:
                    if (counter == num) {
                        for (Fruit i : Basket)
                            System.out.println(i);
                    }
                    else
                    {
                        System.out.println((num-counter)+" places are empty");
                    }
                    break;
                case 6:
                    // Display tastes of all stale(not fresh) fruits in the basket.
                    int flag = num;
                    for (int i=0; i<num; i++)
                    {
                        if (!Basket[i].isFresh())
                        {
                            System.out.println((i+1)+"] "+Basket[i].getName()+" = "+Basket[i].taste());
                            flag--;
                        }
                    }
                    if (flag == num)
                    {
                        System.out.println("All fruits are Fresh");
                    }
                    break;
                case 7:
                    // Mark a fruit as stale
                    System.out.println("1.Apple\t2.Mango\t3.Orange");
                    System.out.print("Enter stale fruit number : ");
                    int n = sc.nextInt();
                    switch (n)
                    {
                        case 1:
                            for (Fruit i : Basket)
                            {
                                if (i.getName()=="Apple")
                                {
                                    i.setFresh(false);
                                    System.out.println("Apple has rotten");
                                }
                            }
                            break;
                        case 2:
                            for (Fruit i : Basket)
                            {
                                if (i.getName()=="Mango")
                                {
                                    i.setFresh(false);
                                    System.out.println("Mango has rotten");
                                }
                            }
                            break;
                        case 3:
                            for (Fruit i : Basket)
                            {
                                if (i.getName()=="Orange")
                                {
                                    i.setFresh(false);
                                    System.out.println("Orange has rotten");
                                }
                            }
                            break;
                        default:
                            System.out.println("INVALID INPUT");
                            break;
                    }
                    break;
                case 8:
                    // Mark all sour fruits stale
                    for (Fruit i : Basket)
                    {
                        if(i.getName()=="Mango")
                        {}
                        else {
                            i.setFresh(false);
                        }
                    }
                    System.out.println("All sour fruits stale");
                    break;
                case 9: break;
                case 10:
                    System.out.println("Thank you!!! Visit Again");
                    break;
            }

        }while (choice != 10);
    }
}
