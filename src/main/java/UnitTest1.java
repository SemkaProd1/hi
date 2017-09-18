import org.junit.Test;
import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;

public class UnitTest1 {

    @Test
    public void MostHappend1(){
    ClassTest classTest = new ClassTest();
        ArrayList<String> list = new ArrayList<String>();
        list.add("0");
        list.add("dddkvii");
        int a = list.get(0).length();
        int b = list.get(1).length();
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(a);
        intList.add(b);
        classTest.hi(list);
        ArrayList<Integer> intList2 = new ArrayList<Integer>();
        intList2.add(1);
        intList2.add(7);
        assertEquals(intList, intList2);
    }
    @Test
    public void MostHappen2(){
        ClassTest classTest = new ClassTest();
        ArrayList<String> list = new ArrayList<String>();
        int a = list.get(0).length();
        classTest.hi(list);
        assertEquals(a, 0);
    }
    @Test
    public void MostHappend3(){
        ClassTest classTest = new ClassTest();
        ArrayList<String> list = new ArrayList<String>();
        list.add("");
        int a = list.get(0).length();
        classTest.hi(list);
        assertEquals(a, 0);
    }
}
