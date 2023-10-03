package practise;

import java.util.HashMap;
import java.util.Map;

public class NonRepeated {

	public static Character firstNonRepeated(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                return ch;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String inputString = "programming";
        Character firstNonRepeatedChar = firstNonRepeated(inputString);

        if (firstNonRepeatedChar != null) {
            System.out.println("First Non-Repeated Character: " + firstNonRepeatedChar);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}
