import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;

public class DNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> dnaSet = new HashSet<>(), retDnaSet = new HashSet<>();

        for (int i = 0; i + 9 < s.length(); i++) {
            String sub = s.substring(i, i + 10);

            if (dnaSet.contains(sub)) {
                retDnaSet.add(sub);
            }
            dnaSet.add(sub);
        }
        return new ArrayList<>(retDnaSet);
    }

    public static void main(String[] args) {
        DNASequences obj = new DNASequences();
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";

        List<String> result = obj.findRepeatedDnaSequences(s);

        System.out.println("Repeated DNA Sequences:");
        for (String seq : result) {
            System.out.println(seq);
        }
    }
}
