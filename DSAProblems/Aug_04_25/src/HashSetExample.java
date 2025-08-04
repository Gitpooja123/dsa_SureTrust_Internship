//For Better Understandling Hashset

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of integers
        Set<Integer> numbers = new HashSet<>();

        // Add elements using add()
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);
        numbers.add(30);
        numbers.add(100);
       // numbers.add(10); -->Duplicate not allow

        System.out.println("After adding: " + numbers);

        // Check if element exists using contains()
        if (numbers.contains(20)) {
            System.out.println("20 is present in the set");
        } else {
            System.out.println("20 is not present");
        }

        // Remove an element using remove()
        numbers.remove(10);
        System.out.println("After removing 10: " + numbers);

        System.out.println("Final set: " + numbers);
    }
}
