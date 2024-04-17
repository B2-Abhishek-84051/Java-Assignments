//4. Write a program to count occurrences of each word from a ﬁle.
//Hint 1: To read all lines from the ﬁle use Stream<String> stream = Files.lines(path);
//Hint 2: Use mergeFunction in Collectors.toMap()

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Stream<String> strm = (Stream<String>) Files.lines(Paths.get("/home/abhishek/Desktop/My DBDA/Java Assign/Assign 13/Q4_Day17/MyFile.txt"));


//        strm
//                .flatMap(s -> Stream.of(s.split(" ")))
//                .forEach(System.out::println);

        Map<String, Integer> map = strm.flatMap(s -> Stream.of(s.split(" ")))
                .collect(Collectors.toMap(k -> k,v -> 1,(a,b)-> a+1));

        map.forEach((k, v) -> System.out.println(k + " -- " + v));

    }
}