import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Word_sortTest {
    Word_sort obj;

    @Before
    public void setUp() throws Exception {
        obj=new Word_sort();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void word_sort() {
        assertEquals("error",
                "aa bb cc dd",obj.word_sort("dd cc bb aa") );
        assertEquals("error",
                "keshav kumar",obj.word_sort("kumar keshav") );
        assertEquals("error",
                "keshav kumar",obj.word_sort("kumar"+"\n"+"keshav") );
        assertEquals("error",
                "hell the what",obj.word_sort("what the hell") );

    }
}