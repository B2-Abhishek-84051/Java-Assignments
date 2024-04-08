import java.util.Scanner;

class ExceptionLineTooLong extends Exception
{
    public ExceptionLineTooLong (String msg)
    {
        super(msg);
    }
}
public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        try {
            if (str.length() > 80) {
                throw new ExceptionLineTooLong("The strings is too long");
            } else {
                System.out.println(str);
                System.out.println("String printed successfully");
            }
        } catch (ExceptionLineTooLong e)
        {
            System.out.println(e);
        }
    }
}