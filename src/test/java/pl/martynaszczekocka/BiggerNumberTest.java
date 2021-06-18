package pl.martynaszczekocka;

import org.junit.Test;

import static org.junit.Assert.*;

public class BiggerNumberTest {
    @Test
    public void basicTests() {
        assertEquals(21, BiggerNumber.nextBiggerNumber(12));
    }

    @Test
    public void basicTests2() {
        assertEquals(531, BiggerNumber.nextBiggerNumber(513));
    }

    @Test
    public void basicTests3() {
        assertEquals(2071, BiggerNumber.nextBiggerNumber(2017));
    }

    @Test
    public void basicTests4() {
        assertEquals(441, BiggerNumber.nextBiggerNumber(414));
    }

    @Test
    public void basicTests5() {
        assertEquals(414, BiggerNumber.nextBiggerNumber(144));
    }
    @Test
    public void basicTests6() {
        assertEquals(19009, BiggerNumber.nextBiggerNumber(10990));
    }

    @Test
    public void basicTests7() {
        assertEquals(123456798, BiggerNumber.nextBiggerNumber(123456789));
    }

}