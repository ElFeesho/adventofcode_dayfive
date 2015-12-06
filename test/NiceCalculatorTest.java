import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NiceCalculatorTest {

    @Test
    public void canDetectAWordWithDoubleCharacters()
    {
        NiceCalculator niceCalculator = new NiceCalculator();

        assertThat(niceCalculator.containsDouble("aaa"), is(true));
    }

    @Test
    public void canCountAmountOfVowelsInAString()
    {
        NiceCalculator niceCalculator = new NiceCalculator();

        assertThat(niceCalculator.countVowels("aeioucdf"), is(5));
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

        public int countVowels(String input) {
            int count = 0;

            Set<Character> vowelSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            for (char c : input.toCharArray()) {
                if (vowelSet.contains(c))
                {
                    count++;
                }
            }
            return count;
        }
    }
}
