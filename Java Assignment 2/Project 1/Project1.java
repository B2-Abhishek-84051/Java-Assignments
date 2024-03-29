/*1. Accept a integer number and when the program is executed print the
binary, octal and hexadecimal equivalent of the given number.
Sample Output:
java Test
Enter Number : 20
Given Number :20
Binary equivalent :10100
Octal equivalent :24
Hexadecimal equivalent :14
Hint : toBinaryString() , toOctalString(), toHexString()*/

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Given number = "+num);
        System.out.println("Binary equivalent of "+num+"="+Integer.toBinaryString(num));
        System.out.println("Octal equivalent of "+num+"="+Integer.toOctalString(num));
        System.out.println("Hexadecimal equivalent of "+num+"="+Integer.toHexString(num));
    }
}
