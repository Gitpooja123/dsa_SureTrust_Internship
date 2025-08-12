# Problem Statement- Contains Duplicate
### Approach Name-Sliding Window using HashSet 
### Maintains a moving window of at most size k
### Quickly checks for duplicates within that window
### Time Complexity: O(n)
### Each add(), remove(), and contains() operation in a HashSet takes O(1) on average.

## Why HashSet in this program?
### Because the goal is to:
### Check if a number already appeared in the last k steps
### Do this check fast (preferably in constant time
``` java 
if(set1.size() > k){  //This keeps the sliding window size limited to k
    set1.remove(nums[i - k]); //if our set grows beyond k, we remove the oldest number 
                              //in the window — that is nums[i - k]
}
```