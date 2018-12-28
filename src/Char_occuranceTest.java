import static org.junit.Assert.*;

public class Char_occuranceTest {
    Char_occurance obj;

    @org.junit.Before
    public void setUp() throws Exception {
        obj=new Char_occurance();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        obj=null;
    }

    @org.junit.Test
    public void count_occur() {
        assertEquals("Error",2,obj.count_occur("Keskav kumar",'k',0));
        assertEquals("Error",2,obj.count_occur("knapsack problem",'a',0));
        assertEquals("Error",1,obj.count_occur("Guns and Roses",'o',0));
        assertEquals("Error",4,obj.count_occur("knock knock",'k',0));


    }
    @org.junit.Test
    public void count_occurFails()
    {
        assertNotNull("Error",obj.count_occur("keshav",'k',0));
    }
}