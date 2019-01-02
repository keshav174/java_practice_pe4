package com.stackroute.unittest.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceAllTest {
    ReplaceAll obj;

    @Before
    public void setUp() throws Exception {
        obj=new ReplaceAll();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void replace() {
        assertEquals("errr","fairy fairy",obj.replace("fairy dairy"));
        assertEquals("errr","tutttt",obj.replace("lullll"));
        assertEquals("errr","fethi",obj.replace("delhi"));
        assertEquals("errr","yoooo",obj.replace("yoooo"));
    }
    @Test
    public void replacefail() {
       assertNotNull("error",obj.replace("daily"));
    }
}