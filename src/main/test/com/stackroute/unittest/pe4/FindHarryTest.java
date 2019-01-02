package com.stackroute.unittest.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindHarryTest {
    FindHarry h1=new FindHarry();

    @Test
    public void presenceOfString() {
        String input = "This is Harry";
        assertEquals(true,h1.presenceOfString(input));
    }
    @Test
    public void checkFailure() {
        String input = "This is Henry";
        assertEquals(false,h1.presenceOfString(input));
    }
    @Test
    public void checkNotNull() {
        String input = "This is Henry";
        assertNotNull("Error",h1.presenceOfString(input));
    }

}
