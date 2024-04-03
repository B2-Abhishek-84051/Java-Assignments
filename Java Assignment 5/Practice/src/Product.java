import java.util.Scanner;

public class Product {
    Date dom = new Date();
    private double price;
    private int pid;

    public Date getDom() {
        return dom;
    }

    public void setDom(Date dom) {
        this.dom = dom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void acceptProductInfo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pid : ");
        setPid(sc.nextInt());
        System.out.println("Enter Date of Manufacturing : ");
        dom.acceptDate();
        System.out.println("Enter Price : ");
        setPrice(sc.nextDouble());
    }

    @Override
    public String toString() {
        return "dom=" + dom.toString() +", price=" + price +", pid=" + pid +'}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of products : ");
        int num = sc.nextInt();

        Product[] p = new Product[num];
        for (int i = 0; i < num; i++) {
            p[i] = new Product();
        }

        System.out.println("Enter Product Details : ");
        for (int i = 0; i < num; i++) {
            System.out.print("Product["+(i+1)+"] : ");
            p[i].acceptProductInfo();
        }
        System.out.println("--------Product Details--------");
        for (int i = 0; i < num; i++) {
            System.out.println("Product["+(i+1)+"] : ");
            System.out.println(p[i].toString());
        }
    }
}
