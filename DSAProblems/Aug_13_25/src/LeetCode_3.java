import java.util.HashSet;
import java.util.Set;

public class LeetCode_3 {
    public static int lengthOfLongestSubstring(String str) {
        int l = 0, r = 0, max = 0;
        Set<Character> ch = new HashSet<>();
        for(int i = 0; i < str.length();i++)
        {
            if (!ch.contains(str.charAt(r)))
            {
                ch.add(str.charAt(r));
                r++;
                max = Math.max(max, ch.size());// update max
            }else {
                ch.remove(str.charAt(l));
                l++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println("Longest substring length: " + lengthOfLongestSubstring(str));
    }
    }

