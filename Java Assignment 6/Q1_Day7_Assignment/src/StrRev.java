//Q1) Write a java program to reverse a String

public class StrRev {
    public static void main(String[] args) {
        String str1 = "Sunbeam";
        StringBuffer sb1 = new StringBuffer(str1);
        sb1.reverse();
        System.out.println(sb1);
    }
}
