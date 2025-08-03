import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class ArrayListExam {
    public static void main(String[] args) {
        // Step 1: Create a 2D list with values [10], [10], ...
        List<List<Integer>> lst = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            List<Integer> inner = new ArrayList<>();
            inner.add(10);
            lst.add(inner);
        }
        System.out.println(lst);

    }
}
