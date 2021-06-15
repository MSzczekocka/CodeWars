package pl.martynaszczekocka;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeDecompTest {
    @Test
    public void testPrimeDecompOne() {
        int lst = 15;
        assertEquals(
                "(3)(5)",
                PrimeDecomp.factors(lst));
    }

    @Test
    public void testPrimeDecompOne2() {
        int lst = 7775460;
        assertEquals(
                "(2**2)(3**3)(5)(7)(11**2)(17)",
                PrimeDecomp.factors(lst));
    }

}