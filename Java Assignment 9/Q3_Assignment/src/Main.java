import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(22);
        al.add(33);
        al.add(44);
        al.add(55);

        System.out.println(al);
        al.set(1,999);
        System.out.println(al);


    }
}