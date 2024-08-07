import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculaterTest {

    @Test
    public void EmptyStringShouldReturnZero() {
        StringCalculater calculater = new StringCalculater();
        assertEquals(0, calculater.add(""));
    }
}