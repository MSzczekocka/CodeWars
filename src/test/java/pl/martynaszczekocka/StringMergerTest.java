package pl.martynaszczekocka;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringMergerTest {

    @Test
    public void normalHappyFlow() {
        assertTrue("codewars can be created from code and wars", StringMerger.isMerge("codewars", "code", "wars"));
    }
    @Test
    public void normalHappyFlow2() {
        assertTrue("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", "oeas"));
    }
    @Test
    public void normalHappyFlow3() {
        assertFalse("Codewars are not codwars", StringMerger.isMerge("codewars", "cod", "wars"));
    }

}