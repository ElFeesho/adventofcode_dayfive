import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class NiceCalculator {

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

    public boolean containsDoubleBigram(String input) {
        return false;
    }
}
