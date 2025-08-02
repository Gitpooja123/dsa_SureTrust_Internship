//22/07/2025
//leetcode 1051 -->height checker
package Array;
import java.util.Arrays;
public class LeetCode1051 {
    public static int heightChecker(int[] heights) {
        // Make a copy of the original array
        int[] expected = Arrays.copyOf(heights, heights.length);
        // Sort the copied array
        Arrays.sort(expected);
        // Compare both arrays and count mismatches
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        //Return the number of mismatches
        return count;
    }
    public static void main(String[] args) {
        int[] heights = {1, 6, 4, 2, 10, 3};
        int result = heightChecker(heights);
        System.out.println("Number of students in wrong position: " + result);
    }
}
