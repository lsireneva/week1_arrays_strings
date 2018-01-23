import java.util.HashSet;
import java.util.List;

public class FindDuplicates {

    public int repeatedNumber(final List<Integer> a) {

        HashSet<Integer> aSet = new HashSet();
        int dup = -1; // not found

        for (int i = 0; i < a.size(); i++) {
            if (!aSet.add (a.get(i)))
                return dup = a.get(i);
        }
        return dup;
    }
}
