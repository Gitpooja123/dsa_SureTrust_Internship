//O(n) solution using HashMap(Optimal Solution)

import java.util.Arrays;
import java.util.HashMap;

public class Leet01 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> keys = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (keys.containsKey(key)) {
                return new int[]{keys.get(key), i};
            }
            keys.put(nums[i], i);
        }
        return new int[]{}; // agar solution na mile
    }
    public static void main(String[] args) {
        Leet01 obj = new Leet01();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        if (result.length == 0) {
            System.out.println("No two numbers add up to target!");
        } else {
            System.out.println("Indices: " + Arrays.toString(result));
            System.out.println("Numbers: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        }
    }
}

