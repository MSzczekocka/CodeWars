package pl.mszczekocka;

import org.junit.Test;
import pl.mszczekocka.Kata;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void tests() {
        assertEquals("(123) 456-7890", Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}