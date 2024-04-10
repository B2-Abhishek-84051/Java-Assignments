import java.util.Scanner;
import java.util.TreeSet;
import java.util.*;


class FirstComparator implements Comparator<Book> {
    @Override public int compare(Book b1, Book b2)
    {
        return (b1.date).compareTo(b2.date);
    }
}

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

    public Book(String isbn, double price, String authorName, int quantity, category genre, String date) {
        this.isbn = isbn;
        this.price = price;
        this.authorName = authorName;
        this.quantity = quantity;
        this.genre = genre;
        this.date = date;
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
        System.out.println("Enter Date (mm-dd-yyyy): ");
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
        b[0] = new Book("101", 100, "Ram", 120, category.thrillers, "2020-12-12");
        b[1] = new Book("102", 250, "Shyam", 250, category.suspense, "2021-05-03");
        b[2] = new Book("103", 200, "Vishnu", 130, category.romance, "2019-02-01");
        b[3] = new Book("104", 150, "Mahesh", 110, category.mystery, "2019-11-11");
        b[4] = new Book("105", 350, "Lakshman", 160, category.mystery, "2024-05-05");

        HashSet<Book> hs = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            hs.add(b[i]);
        }
        System.out.println("---Hashset---(unordered, unsorted)");
        Iterator<Book> itr = hs.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        System.out.println("-----------------------------------");
        System.out.println("---TreeSet---(Unordered,Sorted)");
        TreeSet<Book> ts = new TreeSet<Book>(new FirstComparator());
        for (int i = 0; i < 5; i++) {
            ts.add((Book)b[i]);
        }
        Iterator<Book> itr2 = ts.iterator();
        while (itr2.hasNext())
            System.out.println(itr2.next());
        System.out.println("-----------------------------------------------------");

    }
}