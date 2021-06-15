package pl.martynaszczekocka;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImmortalTest {
    @Test
    public void example() {
        assertEquals(5, Immortal.elderAge(8, 5, 1, 100));
    }

    @Test
    public void example2() {
        assertEquals(224, Immortal.elderAge(8, 8, 0, 100007));
    }

    @Test
    public void example3() {
        assertEquals(11925, Immortal.elderAge(25, 31, 0, 100007));
    }

    @Test
    public void example4() {
        assertEquals(4323, Immortal.elderAge(5, 45, 3, 1000007));
    }

    @Test
    public void example5() {
        assertEquals(1586, Immortal.elderAge(31, 39, 7, 2345));
    }

    @Test
    public void example6() {
        assertEquals(808451, Immortal.elderAge(545, 435, 342, 1000007));
    }

    @Test
    public void example7() {
        assertEquals(5456283, Immortal.elderAge(28827050410L, 35165045587L, 7109602, 13719506));
    }


}