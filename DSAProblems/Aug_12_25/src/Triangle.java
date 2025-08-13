import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] arr = new int[n];

        // Step 1: Copy last row into arr
        for (int i = 0; i < n; i++) {
            arr[i] = triangle.get(n - 1).get(i);
        }
        // Step 2: Process from second-last row up to first row
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                arr[col] = triangle.get(row).get(col) + Math.min(arr[col], arr[col + 1]);
            }
        }
        // Step 3: First element contains min total
        return arr[0];
    }
}
public class Triangle {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Sample triangle
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        // Call the method
        int result = sol.minimumTotal(triangle);

        // Print result
        System.out.println("Minimum path sum: " + result);
    }
}
