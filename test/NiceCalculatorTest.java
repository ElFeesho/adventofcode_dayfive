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
            char lastCharacter = 0;
            for (char character : input.toCharArray()) {
                if(character == lastCharacter) {
                    return true;
                }
                lastCharacter = character;
            }
            return false;
        }
    }
}
