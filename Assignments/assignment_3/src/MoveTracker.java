import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoveTracker {
    public static List<Integer> SortByFrequency(int[] moves){
        Map<Integer, Integer> movesMap = new HashMap<>();
        int average = 0;
        List<Integer> res = new ArrayList<>();
        for (int move : moves){
            if (movesMap.containsKey(move)){
                movesMap.replace(move, movesMap.get(move)+1);
            }else{
                movesMap.put(move, 1);
            }
        }

        for (int item : movesMap.values()){
            average+=item;
        }
        average = average/ movesMap.size();

        for (int key: movesMap.keySet()){
            if (movesMap.get(key) < average){
                movesMap.remove(key);
            }
        }

        System.out.println(average);
        System.out.println(movesMap);

        return res;
    }

    public static void main(String[] args) {
        int[] input = new int[]{2, 3, 2, 4, 3, 2, 5, 4};
        List<Integer> lst  =  SortByFrequency(input);
    }
}
