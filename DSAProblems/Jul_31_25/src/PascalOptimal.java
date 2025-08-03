//Optimal Approach (Iterative using nCr logic)
//Time Complexity: O(n)

import java.util.ArrayList;
import java.util.List;

public class PascalOptimal {
    public static void main(String[] args) {

        List<Integer> lst1= new ArrayList<>();

        long num=1;

        lst1.add((int)num);

        for(int i=1; i<=3;i++)
        {
            num= num*(3-i+1)/i;
            lst1.add((int)num);
        }
        //lst1.add(1);
        System.out.println(lst1);
    }
}
