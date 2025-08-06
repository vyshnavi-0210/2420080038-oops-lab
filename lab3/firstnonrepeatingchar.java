package lab3;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstnonrepeatingchar {
    public static void main(String[] args) {
        String input = "swiss";

        // Using LinkedHashMap to maintain the order of characters
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Find first character with count 1
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
