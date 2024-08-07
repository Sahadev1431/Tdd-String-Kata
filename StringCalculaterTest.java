import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculaterTest {

    // ""
    @Test
    public void emptyStringShouldReturnZero() {
        StringCalculater calculater = new StringCalculater();
        assertEquals(0, calculater.add(""));
    }

    // "1"
    @Test
    public void oneArgumentShouldReturnNumberItSelf() {
        StringCalculater calculater = new StringCalculater();
        assertEquals(1, calculater.add("1"));
    }

    // "1,2"
    @Test
    public void TwoArgsSum() {
        StringCalculater calculater = new StringCalculater();
        assertEquals(3, calculater.add("1,2"));
    }

    // "1,2,3"
    @Test
    public void unknownAmountOfNumber() {
        StringCalculater calculater = new StringCalculater();
        assertEquals(10, calculater.add("1,2,3,4"));
    }

    @Test
    public void handleNewLineBetweenNumbers() {
        StringCalculater calculater = new StringCalculater();
        assertEquals(6, calculater.add("1\n2,3"));
    }
}