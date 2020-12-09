import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

    List<Integer> list;

//    @Before
//    public void setup() {
//        list = new ArrayList();
//    }

    @Test
    public void sumOfList() {
        list.add(1);
        list.add(2);
        list.add(3);
        int expected = 6;
        int actual = Sum.sumList(list);
        assertEquals(expected, actual);
    }

    @Test
    public void emptyList(){
        int expected = 0;
        int actual = Sum.sumList(list);
        assertEquals(expected, actual);
    }

    @Test
    public void oneElementList(){
        list.add(2);
        int expected = 2;
        int actual = Sum.sumList(list);
        assertEquals(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void nullList(){
        Sum.sumList(list);

    }
}