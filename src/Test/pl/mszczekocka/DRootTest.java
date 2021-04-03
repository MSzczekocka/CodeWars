package pl.mszczekocka;

import org.junit.Test;
import pl.mszczekocka.DRoot;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class DRootTest {
    @Test
    public void Test1() {
        assertEquals( "Nope!" , 7, DRoot.digital_root(16));
    }
    @Test
    public void Test2() {
        assertEquals( "Nope!" , 6, DRoot.digital_root(456));
    }

}