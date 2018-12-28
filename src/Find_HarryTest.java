import org.junit.Test;

import static org.junit.Assert.*;

public class Find_HarryTest {
    Find_Harry h1=new Find_Harry();

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
