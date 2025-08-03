import java.util.ArrayList;
import java.util.List;
public class PascalsTriangle {
    public static void main(String[] args) {

        List<List<Integer>> PascalTriangle = new ArrayList<List<Integer>>();

        List<Integer> firstElement = new ArrayList<>();
        firstElement.add(1);
        PascalTriangle.add(firstElement);

        for (int i = 1; i < 5; i++) {
            List<Integer> prevRow = PascalTriangle.get(i - 1);
            List<Integer> middleList = new ArrayList<>();

            middleList.add(1);
            for (int j = 1; j < i; j++) {
                middleList.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            middleList.add(1);
            PascalTriangle.add(middleList);
        }
        System.out.println(PascalTriangle);
    }

}
