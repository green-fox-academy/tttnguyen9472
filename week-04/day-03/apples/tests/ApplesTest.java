import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

    @Test
    public void getApple(){
        String expected = "apple";
        String actual = Apples.getApple();
        assertEquals(expected, actual);
    }
}