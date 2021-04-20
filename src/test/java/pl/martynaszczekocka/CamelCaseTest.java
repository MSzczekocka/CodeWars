package pl.martynaszczekocka;

import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCaseTest {
    public class SolutionTest {
        @Test
        public void testSomeUnderscoreLowerStart() {
            String input = "the_Stealth_Warrior";
            System.out.println("input: " + input);
            assertEquals("theStealthWarrior", CamelCase.toCamelCase(input));
        }

        @Test
        public void testSomeDashLowerStart() {
            String input = "the-Stealth-Warrior";
            System.out.println("input: " + input);
            assertEquals("theStealthWarrior", CamelCase.toCamelCase(input));
        }
    }
}