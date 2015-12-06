import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NiceCalculatorTest {

    @Test
    public void canDetectAWordWithDoubleCharacters()
    {
        NiceCalculator niceCalculator = new NiceCalculator();

        assertThat(niceCalculator.containsDouble("aaa"), is(true));
    }

    private class NiceCalculator {

        public boolean containsDouble(String input) {
            return false;
        }
    }
}
