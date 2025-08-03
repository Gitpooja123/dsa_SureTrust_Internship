import java.util.ArrayList;
import java.util.List;

public class TypeSafeIntegerList {
    public static void printSquares(List<Integer> list) {
        System.out.println("Squares of integers in the list:");
        for (Integer num : list) {
            System.out.println(num + "^2 = " + (num * num));
        }
    }
    public static void main(String[] args) {
        // Type-safe list that only accepts Integer
        List<Integer> numbers = new ArrayList<>();

        // Adding integers to the list
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);
        numbers.add(13);

        printSquares(numbers);
    }
}
