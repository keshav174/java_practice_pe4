import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurenceUsingMatcherTest {

    private MultipleOccurenceUsingMatcher matcher = new MultipleOccurenceUsingMatcher();
    @Test
    public void checkSuccess() {
        String input = "She sells seashells by the seashore";
        String checkPattern = "se";
        String output = "Found at:4-6" +
                "Found at:10-12" +
                "Found at:27-29";
        assertEquals(output,matcher.multipleOccurenceUsingMatcher(input,checkPattern));
    }
    @Test
    public void checkFailure() {
        String input = "She sells seashells by the seashore";
        String checkPattern = "se";
        String output = "Found at:4-6" +
                "Found at:10-12" +
                "Found:27-29";
        assertNotSame(output,matcher.multipleOccurenceUsingMatcher(input,checkPattern));
    }
    @Test
    public void checkNotNull() {
        String input = "She sells seashells by the seashore";
        String checkPattern = "se";
        String output = "Found at:4-6" +
                "Found at:10-12" +
                "Found at:27-29";
        assertNotNull(matcher.multipleOccurenceUsingMatcher(input,checkPattern));
    }
}