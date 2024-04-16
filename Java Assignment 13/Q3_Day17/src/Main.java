// 3. Create a collatz conjure series for the given number.
// Tn+1 = Tn / 2 (if Tn is even), and Tn+1 = 3 * Tn + 1 (if Tn is odd).

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Stream<Integer> strm = Stream.iterate(num, x-> {if(x%2 == 0)
        {x = x/2;}
        else{
            x=x*3+1;
        }
                    return x;
                }
        )
                .peek(x-> System.out.print(x+"\t"));
        strm.allMatch(x -> (x>1));
    }
}