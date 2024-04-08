public class Product {
    String name;
    int pid;
    double price;

    Product()
    { this("Default", 100, 2500); }
    Product(String name, int pid, double price)
    {
        this.name = name;
        this.pid = pid;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product [" +
                "name='" + name + '\'' +
                ", pid=" + pid +
                ", price=" + price +
                ']';
    }
}
