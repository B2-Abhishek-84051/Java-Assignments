import javax.swing.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

enum category{
    suspense, thrillers, adventure, fantasy, horror, mystery, romance
}
class Book
{
    String isbn;
    double price;
    String authorName;
    int quantity;
    category genre;
    String date;


    Scanner sc = new Scanner(System.in);

    public Book() {
    }

    public Book(String isbn, double price, String authorName, int quantity) {
        this.isbn = isbn;
        this.price = price;
        this.authorName = authorName;
        this.quantity = quantity;
    }
    void acceptBookInfo()
    {
        System.out.println("---Enter Book Information---");

        System.out.println("1. suspense\t2. thrillers\t3. adventure\t4. fantasy\t5. horror\t6. mystery\t7. romance");
        System.out.println("Select Genre");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                this.genre = category.suspense;
                break;
            case 2:
                this.genre = category.thrillers;
                break;
            case 3:
                this.genre = category.adventure;
                break;
            case 4:
                this.genre = category.fantasy;
                break;
            case 5:
                this.genre = category.horror;
                break;
            case 6:
                this.genre = category.mystery;
                break;
            case 7:
                this.genre = category.romance;
                break;
        }
        System.out.print("Enter Book isbn : ");
        this.isbn = sc.next();
        System.out.print("Enter Book Author name : ");
        this.authorName = sc.next();
        System.out.print("Enter quantity : ");
        this.quantity = sc.nextInt();
        System.out.print("Enter Book price : ");
        this.price = sc.nextDouble();
        System.out.println("Enter Date (yyyy-dd-mm): ");
        this.date = sc.next();
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", price=" + price +
                ", authorName='" + authorName + '\'' +
                ", quantity=" + quantity +
                ", genre=" + genre +
                ", date='" + date + '\'' +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
        Book b[] = new Book[5];
        for (int i = 0; i < 5; i++) {
            b[i] = new Book();
            b[i].acceptBookInfo();
        }
        HashSet<Book> hs = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            hs.add(b[i]);
        }
        System.out.println("------------------------------------------");
        Iterator<Book> itr = hs.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}