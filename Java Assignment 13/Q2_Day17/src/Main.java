// Write a program to calculate sum of 10 unique even random integers using streams.

import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Stream<Integer> strm = Stream.generate(()->r.nextInt(100))
                .distinct()
                .filter(x -> x % 2 == 0)
                .limit(10);

        Integer result = strm.reduce(0, (a,n)->a+n);
        System.out.println(result);
    }
}