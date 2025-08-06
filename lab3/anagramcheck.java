package lab3;

import java.util.Arrays;

public class anagramcheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Convert strings to lowercase and remove spaces (optional step)
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted arrays
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
