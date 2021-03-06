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
        for(int i = 0; i<input.length()-2; i++)
        {
            String substring = input.substring(i, i+2);
            if (input.substring(i+2).contains(substring))
            {
                return true;
            }
        }
        return false;
    }

    public boolean containsRepeatingCharacter(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(i+2 < chars.length && chars[i] == chars[i+2])
            {
                return true;
            }
        }
        return false;
    }
}
