// Write a Java program to create a new tree set, add some colors (string)
// and print out the tree set

import java.util.*;
class FirstComparator implements Comparator<String> {
    @Override public int compare(String b1, String b2)
    {
        return (b1).compareTo(b2);
    }
}

public class Main {
    static int num;
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of colours : ");
        num = sc.nextInt();
        for (int i = 0; i < num; i++)
        {
            System.out.print("Enter colour : ");
            String tmp = sc.next();
            al.add(tmp);
        }

        TreeSet<String> ts = new TreeSet<String>(new FirstComparator());
        for (int i = 0; i < 5; i++) {
            ts.add((String) al.get(i));
        }
        System.out.println("---Tree Set---");
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}