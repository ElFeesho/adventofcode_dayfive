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

    @Test
    public void canDetectDoubleBigrams()
    {
        NiceCalculator niceCalculator = new NiceCalculator();

        assertThat(niceCalculator.containsDoubleBigram("abxtsjsab"), is(true));
        assertThat(niceCalculator.containsDoubleBigram("abbxbba"), is(true));

        assertThat(niceCalculator.containsDoubleBigram("abba"), is(false));
        assertThat(niceCalculator.containsDoubleBigram("baaab"), is(false));
    }

    @Test
    public void canDetectRepeatingCharactersWithSpaceInBetween()
    {
        NiceCalculator niceCalculator = new NiceCalculator();

        assertThat(niceCalculator.containsRepeatingCharacter("axa"), is(true));
        assertThat(niceCalculator.containsRepeatingCharacter("xyuyx"), is(true));

        assertThat(niceCalculator.containsRepeatingCharacter("aab"), is(false));
        assertThat(niceCalculator.containsRepeatingCharacter("baab"), is(false));
    }

}
