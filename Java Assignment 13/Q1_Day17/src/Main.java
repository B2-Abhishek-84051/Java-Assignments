import java.util.Arrays;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        Stream<Integer> strm2 = Stream.of(1,2,3,4,5,6);
        Stream<Integer> strm = Arrays.stream(arr);
        Integer res = strm.reduce(1, (a,n)->a*n);
        System.out.println(res);

        Integer res2 = strm2.reduce(1, (a,n)->a*n);
        System.out.println(res2);
    }
}