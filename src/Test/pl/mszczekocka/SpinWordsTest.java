package pl.mszczekocka;

import org.junit.Test;
import pl.mszczekocka.SpinWords;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class SpinWordsTest {

    @Test
    public void test() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }
}