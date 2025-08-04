//Height Checker (counting sort approach) in O(n) time complexity

public class HeightChecker {
    // Counting sort function (modular)
    static void countSort(int[] input, int[] output) {
        int[] count = new int[101];  // because heights range from 1 to 100

        // Step 1: Count frequencies
        for (int height : input) {
            count[height]++;
        }

        // Step 2: Fill the sorted array
        int index = 0;
        for (int i = 1; i < count.length; i++) {
            while (count[i] > 0) {
                output[index++] = i;
                count[i]--;
            }
        }
    }

    // Main heightChecker function using counting sort
    static int heightChecker(int[] heights) {
        int[] sorted = new int[heights.length];
        countSort(heights, sorted);  // sort using counting sort

        // Compare sorted vs original
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};

        int result = heightChecker(heights);
        System.out.println("Students not in correct position: " + result);
    }
}
