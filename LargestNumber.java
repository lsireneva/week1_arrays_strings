import java.util.Comparator;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {

        StringBuilder res = new StringBuilder();
        A.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer X, Integer Y) {
                String XY= X.toString().concat(Y.toString());
                String YX = Y.toString().concat(X.toString());
                return YX.compareTo(XY);
            }});


        for (int i=0; i<A.size(); i++) {
            res.append(A.get(i));
        }

        if (A.get(0) == 0) {
            res.delete(0, A.size()-1);
        }

        return  res.toString();
    }
}

