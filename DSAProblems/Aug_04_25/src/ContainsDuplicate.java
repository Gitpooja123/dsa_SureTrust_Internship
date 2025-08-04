//LeetCode-->219 (Contains Duplicate)
//Time Complexity-->O(n)
//Approach Name--->Sliding Window using HashSet

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Set<Integer> set1 = new HashSet<Integer>(); //Create a HashSet to store the last k unique elements
            for (int i = 0; i < nums.length; i++) {
                if (set1.contains(nums[i])) { //Check if the current number is already in the set
                    return true;
                }
                set1.add(nums[i]); //Add the current number to the set

                if (set1.size() > k) {   //If the set size becomes larger than k, we remove the oldest value
                    set1.remove(nums[i - k]); //maintains a sliding window of size
                }
            }
            return false; // find no such duplicates, return false
        }
        public static void main(String[] args) {
            ContainsDuplicate sol = new ContainsDuplicate();

            int[] nums1 = {1, 2, 3, 1};
            int k1 = 3;
            System.out.println("Test Case 1: " + sol.containsNearbyDuplicate(nums1, k1));

            int[] nums2 = {1, 0, 1, 1};
            int k2 = 1;
            System.out.println("Test Case 2: " + sol.containsNearbyDuplicate(nums2, k2));

            int[] nums3 = {1, 2, 3, 1, 2, 3};
            int k3 = 2;
            System.out.println("Test Case 3: " + sol.containsNearbyDuplicate(nums3, k3));
        }
    }

