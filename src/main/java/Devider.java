import java.util.HashSet;
import java.util.Set;

public class Devider {


    public static HashSet<String> divide(String s, HashSet<String> d) {
        Set<String> tmp = new HashSet<String>();
        int i = 0;

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == ' ') {
                if (j > i) {
                    tmp.add(s.substring(i, j));
                }
                i = j + 1;
            }
        }
        if (i < s.length()) {
            d.add(s.substring(i));
        }
        return d;

    }

}
