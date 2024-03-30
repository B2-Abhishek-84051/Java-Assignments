/*1. Create a class called Invoice that a hardware store might use to represent
        an invoice for an item sold at the store. An Invoice should include four
pieces of information as instance variables—a part number (type String), a
part description (type String), a quantity of the item being purchased (type
int) and a price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method
for each instance variable. "calculates" the invoice amount (i.e. multiplies the
quantity by the price per item), then returns the amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s
capabilities.*/

import java.util.Scanner;

class Invoice{
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price_per_item;
    Invoice()
    {
        this.partNumber = "NULL";
        this.partDescription = "NULL";
        this.quantity = 0;
        this.price_per_item = 0.0;
    }

    public Invoice(String partNumber, String partDescription, int quantity, double price_per_item) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price_per_item = price_per_item;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0)
        {
            this.quantity = quantity;
        }
    }

    public double getPrice_per_item() {
        return price_per_item;
    }

    public void setPrice_per_item(double price_per_item) {
        if (price_per_item > 0) {
            this.price_per_item = price_per_item;
        }
    }
    double calculateInvoiceAmt()
    {
        double invoiceAmount = (double) quantity*price_per_item;
        return invoiceAmount;
    }
    void acceptData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter part number : ");
        partNumber = sc.next();
        System.out.print("Enter part Description : ");
        partDescription = sc.next();
        System.out.print("Enter part qunatity : ");
        int qty = sc.nextInt();
        setQuantity(qty);
        System.out.print("Enter part price per item : ");
        double price = sc.nextDouble();
        setPrice_per_item(price);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "partNumber='" + partNumber + '\'' +
                ", partDescription='" + partDescription + '\'' +
                ", quantity=" + quantity +
                ", price_per_item=" + price_per_item +
                '}';
    }
}
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice i1 = new Invoice();
//        i1.setPartNumber("101");
//        i1.setPartDescription("Motor");
//        i1.setQuantity(10);
//        i1.setPrice_per_item(5000);
        System.out.println(i1);
        System.out.println("Invoice Amount = "+i1.calculateInvoiceAmt());
        i1.acceptData();
        System.out.println(i1);
        System.out.println("Invoice Amount = "+i1.calculateInvoiceAmt());
    }
}
