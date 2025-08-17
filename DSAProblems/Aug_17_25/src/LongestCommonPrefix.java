import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[] = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));

    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);  //for sorting given Array

        String str1 = strs[0];  //first string
        String str2 = strs[strs.length - 1]; //last string
        int index = 0; //This will track how many characters are matching.
        while (index < str1.length()) {
            if (str1.charAt(index) == str2.charAt(index)) { //cheack each char
                index++;
            } else {
                break;
            }

        }
        // return index == 0 ? "" : str1.substring(0, index);

        if (index == 0) {
            return "";
        } else {
            return str1.substring(0, index);
        }
    }
}
