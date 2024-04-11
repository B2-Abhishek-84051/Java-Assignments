import java.util.*;

public class Main
{
    public static <T extends Comparable<T>> T findMax(List<T> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            T current = list.get(i);
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Create various lists using Collection Framework
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);
        integerList.add(3);
        integerList.add(8);

        List<Double> doubleList = new LinkedList<>();
        doubleList.add(2.5);
        doubleList.add(6.7);
        doubleList.add(3.4);
        doubleList.add(8.9);

        List<Float> floatList = new ArrayList<>();
        floatList.add(1.2f);
        floatList.add(3.5f);
        floatList.add(2.0f);
        floatList.add(4.8f);

        // Find max number from any List of numbers
        System.out.println("Max number from integerList: " + findMax(integerList));
        System.out.println("Max number from doubleList: " + findMax(doubleList));
        System.out.println("Max number from floatList: " + findMax(floatList));
    }
}