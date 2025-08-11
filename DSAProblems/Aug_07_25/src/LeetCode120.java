import java.util.ArrayList;
import java.util.List;
public class LeetCode120 {
    public static void main(String[] args) {

    }
    static int triangle(List<List<Integer>> triangle){
        int sum = 0;
        int indexRecord = 0;
        List<Integer> list = new ArrayList<Integer>();

        list.add(triangle.get(0).get(0));

        for (int i = 2; i < triangle.size(); i++) {

            List<Integer> prev = triangle.get(i-1);

            if (indexRecord + 1 < prev.size()){
                int minValue = Math.min(prev.get(indexRecord), prev.get(indexRecord+1));
                list.add(minValue);
                indexRecord = prev.indexOf(minValue);
            }
        }
        for (Integer integer : list) {
            sum = sum + integer;
        }
        return sum;
    }

}
