import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculaterTest {

    @Test
    public void emptyStringShouldReturnZero() {
        StringCalculater calculater = new StringCalculater();
        assertEquals(0, calculater.add(""));
    }

    @Test
    public void oneArgumentShouldReturnNumberItSelf() {
        StringCalculater calculater = new StringCalculater();
        assertEquals(5, calculater.add("5"));
    }
}