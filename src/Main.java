import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String... args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(Main.class.getResourceAsStream("input.txt")));
        NiceCalculator calculator = new NiceCalculator();
        int goodCount = 0;
        try {
            while (reader.ready()) {
                String line;
                line = reader.readLine();
                if (calculator.containsDoubleBigram(line) && calculator.containsRepeatingCharacter(line)) {
                    goodCount++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Good count: " + goodCount);
    }

}
