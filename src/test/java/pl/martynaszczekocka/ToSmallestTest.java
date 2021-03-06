package pl.martynaszczekocka;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ToSmallestTest {
    private static void testing(long n, String res) {
        assertEquals(res,
                Arrays.toString(ToSmallest.smallest(n)));
    }
    @Test
    public void test() {
        System.out.println("Basic Tests smallest");
        testing(261235, "[126235, 2, 0]");

    }
    @Test
    public void test1() {
        System.out.println("Basic Tests smallest");
        testing(209917, "[29917, 0, 1]");
    }

    @Test
    public void test2() {
        System.out.println("Basic Tests smallest");
        testing(285365, "[238565, 3, 1]");
    }

    @Test
    public void test3() {
        System.out.println("Basic Tests smallest");
        testing(269045, "[26945, 3, 0]");
    }

    @Test
    public void test4() {
        System.out.println("Basic Tests smallest");
        testing(296837, "[239687, 4, 1]");
    }



}