interface Check<Integer>
{
    boolean compare(Integer x, Integer y);
}

public class Main implements Check<Integer>
{
    static int countIf(Integer[] arr, Integer key, Check<Integer> c){
        int count = 0;
        for(Integer i : arr)
        {
            if(c.compare(i, key)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer [] arr = {44, 77, 99, 22, 55, 66};
        Integer key = 50;
        int cnt = countIf(arr, key, (x,y)-> x > y);
        System.out.println("Count = " + cnt); // 4 (because 4 elements in array are greater than given key i.e. 50)
    }

    @Override
    public boolean compare(Integer x, Integer y) {
        return false;
    }
}