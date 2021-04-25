package pl.martynaszczekocka;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfZerosTest {
    @Test
    public void testZeros() throws Exception {
        assertEquals(0,NumberOfZeros.zeros(0));
    }

    @Test
    public void testZeros2() throws Exception {
        assertEquals(1,NumberOfZeros.zeros(6));
    }

    @Test
    public void testZeros3() throws Exception {
        assertEquals(2,NumberOfZeros.zeros(14));
    }


}