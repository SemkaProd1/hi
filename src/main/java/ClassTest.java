
import java.util.ArrayList;
import java.util.List;

public class ClassTest {

    public List<Integer> hi(List<String> list) {

        ArrayList<Integer> intList = new ArrayList<Integer>();
        for (String aList : list) {
            int a = aList.length();
            intList.add(a);
        }
        return intList;
    }
}
