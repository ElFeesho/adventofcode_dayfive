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

    @Test
    public void canDetectBadStrings()
    {
        NiceCalculator niceCalculator = new NiceCalculator();

        assertThat(niceCalculator.hasBadStrings("aieoab"), is(true));
        assertThat(niceCalculator.hasBadStrings("aicdeo"), is(true));
        assertThat(niceCalculator.hasBadStrings("aipqeo"), is(true));
        assertThat(niceCalculator.hasBadStrings("xyieo"), is(true));
    }

    private class NiceCalculator {

        private Set<String> badStrings = new HashSet<>(Arrays.asList("ab", "cd", "pq", "xy"));

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

        public boolean hasBadStrings(String input) {
            for (String badString : badStrings) {
                if (input.contains(badString))
                {
                    return true;
                }
            }
            return false;
        }
    }
}
