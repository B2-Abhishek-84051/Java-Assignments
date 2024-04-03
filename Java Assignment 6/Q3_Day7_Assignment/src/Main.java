/* Q3) write a java program to count number of words in a String.
Hint: You can use , trim() , length() and split() methods*/
//India is my counrty. I love my country.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line : ");
        String str = sc.nextLine();

        String str1 = str.trim();
        String[] words = str1.split("\\s+");
        int wordCount = words.length;

        System.out.println("Number of words: " + wordCount);
    }
}