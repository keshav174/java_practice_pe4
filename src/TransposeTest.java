import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose obj;

    @Before
    public void setUp() throws Exception {
        obj=new Transpose();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void transpose() {
     assertEquals("Error","a kciuq nworb xof spmuj revo eht yzal god",obj.transpose("a quick brown fox jumps over the lazy dog"));
    }
    @Test
    public void transpose1() {
        assertEquals("Error","avaj si eht tselooc",obj.transpose("java is the coolest"));
    }
    @Test
    public void transpose2() {
        assertEquals("Error","tsaeB",obj.transpose("Beast"));
    }
    @Test
    public void transpose3() {
        assertEquals("Error","",obj.transpose(""));
    }
}