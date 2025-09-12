import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, List<String>> tree = new HashMap<>();

        tree.put("A", Arrays.asList("B", "C")); //.asList(...) → A method that converts given values into a fixed-size List
        tree.put("B", Arrays.asList("D", "E"));
        tree.put("C", Arrays.asList("F"));
        tree.put("D", Collections.emptyList()); // leaf
        tree.put("E", Collections.emptyList()); // leaf
        tree.put("F", Collections.emptyList()); // leaf

        System.out.println(tree.get("A"));
        System.out.println(tree.get("B"));
        System.out.println(tree.get("C"));
        System.out.println(tree.get("D"));
    }
}
