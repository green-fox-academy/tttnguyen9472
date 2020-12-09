import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {


    @Test
    public void notSameLength() {
        boolean expected = false;
        boolean actual = Anagram.isAnagram("dog", "dogo");
        assertEquals(expected, actual);
    }

    @Test
    public void hasSpecialCharacters(){
        boolean expected = true;
        boolean actual = Anagram.isAnagram("u&i", "i&u");
        assertEquals(expected, actual);
    }

    @Test
    public void hasNumbersInTheWords(){
        boolean expected = true;
        boolean actual = Anagram.isAnagram("1es", "es1");
        assertEquals(expected, actual);
    }

    @Test
    public void emptyWords(){
        boolean expected = true;
        boolean actual = Anagram.isAnagram(" ", " ");
        assertEquals(expected, actual);
    }

    @Test
    public void noWords(){
        boolean expected = true;
        boolean actual = Anagram.isAnagram("", "");
        assertEquals(expected, actual);
    }

    @Test
    public void checkLowerUpperCases(){
        boolean expected = false;
        boolean actual = Anagram.isAnagram("Tab", "Bat");
        assertEquals(expected, actual);
    }

    @Test
    public void checkLowerUpperCases2(){
        boolean expected = true;
        boolean actual = Anagram.isAnagram("Tab", "baT");
        assertEquals(expected, actual);
    }
}