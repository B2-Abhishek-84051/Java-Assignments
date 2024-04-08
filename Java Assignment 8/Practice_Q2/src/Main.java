import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> p = new ArrayList<>();
        p.add(new Product("laptop", 101, 1000));
        p.add(new Product("mobile", 102, 1500));
        p.add(new Product("tablet", 103, 2000));
        p.add(new Product("printer", 104, 2500));
        p.add(new Product("laptop", 105, 3000));
        p.add(new Product("mobile", 106, 3500));
        p.add(new Product("tablet", 107, 4000));
        p.add(new Product("laptop", 108, 4500));
        p.add(new Product("projector", 109, 5000));
        p.add(new Product("projector", 110, 5500));

        for(Product i : p)
            System.out.println(i);

        System.out.println("-----------------------------------------------");
        System.out.println(p.get(2));

        System.out.println("-----------------------------------------------");
        Iterator<Product> itr = p.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());

        String[] str = new String[10];
        for (int i = 0; i < 10; i++) {
            str[i] = p.get(i).name;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(str[i] + "\t");
        }
        System.out.println();
        System.out.println("-----------------------------------------------");
        ArrayList<Product> a2 = new ArrayList<>();
        for (int i=0; i<10 ; i++)
        {
            if (p.get(i).name.compareToIgnoreCase("laptop") == 0)
            {
                a2.add(p.get(i));
            }
        }
        for (Product i : a2)
        {
            System.out.println(i);
        }
    }
}