package com.stackroute.unittest.pe4;
import static org.junit.Assert.*;

public class CharoccuranceTest {
    Charoccurance obj;

    @org.junit.Before
    public void setUp() throws Exception {
        obj=new Charoccurance();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        obj=null;
    }

    @org.junit.Test
    public void count_occur() {
        assertEquals("Error",2,obj.countoccur("Keskav kumar",'k',0));
        assertEquals("Error",2,obj.countoccur("knapsack problem",'a',0));
        assertEquals("Error",1,obj.countoccur("Guns and Roses",'o',0));
        assertEquals("Error",4,obj.countoccur("knock knock",'k',0));


    }
    @org.junit.Test
    public void count_occurFails()
    {
        assertNotNull("Error",obj.countoccur("keshav",'k',0));
    }
}