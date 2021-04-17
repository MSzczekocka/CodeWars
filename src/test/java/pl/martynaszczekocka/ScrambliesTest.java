package pl.martynaszczekocka;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScrambliesTest {
    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests scramble");
        testing(Scramblies.scramble("rkqodlw","world"), true);
    }

    @Test
    public void test2() {
        System.out.println("Fixed Tests scramble");
        testing(Scramblies.scramble("cedewaraaossoqqyt","codewars"),true);
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests scramble");
        testing(Scramblies.scramble("katas","steak"),false);
    }
    @Test
    public void test4() {
        System.out.println("Fixed Tests scramble");
        testing(Scramblies.scramble("scriptjavx","javascript"),false);
    }

    @Test
    public void test5() {
        System.out.println("Fixed Tests scramble");
        testing(Scramblies.scramble("scriptingjava", "javascript"), true);
    }

    @Test
    public void test6() {
            System.out.println("Fixed Tests scramble");
            testing(Scramblies.scramble("scriptsjava", "javascripts"), true);
    }

    @Test
    public void test7() {
        System.out.println("Fixed Tests scramble");
        testing(Scramblies.scramble("javscripts", "javascript"), false);
    }

    @Test
    public void test8() {
        System.out.println("Fixed Tests scramble");
        testing(Scramblies.scramble("aabbcamaomsccdd", "commas"), true);
    }

    @Test
    public void test9() {
        System.out.println("Fixed Tests scramble");
        testing(Scramblies.scramble("commas", "commas"), true);
    }

    @Test
    public void test10() {
        System.out.println("Fixed Tests scramble");
        testing(Scramblies.scramble("sammoc", "commas"), true);
    }
}