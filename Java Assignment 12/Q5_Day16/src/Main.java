import java.util.Scanner;

interface Check<Double>
{
    boolean compare(Double x, Double y);
}

public class Main implements Check<Double>
{
    static int countIf(Double[] arr, Double key, Check<Double> c){
        int count = 0;
        for(Double i : arr)
        {
            if(c.compare(i, key)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Double [] arr = {44.0, 77.0, 99.0, 22.0, 50.0, 66.0, 50.0, 77.0, 77.0};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to count occurances : ");
        Double key = sc.nextDouble();

        int cnt = countIf(arr, key, (x,y)-> x.equals(y));

        System.out.println("Count = " + cnt); // 4 (because 4 elements in array are greater than given key i.e. 50)
    }

    @Override
    public boolean compare(Double x, Double y) {
        return false;
    }
}