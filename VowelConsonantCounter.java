// Count Vowels and Consonants
// Method: Map<String, Integer> countVowelsAndConsonants(String input)

import java.util.*;

public class VowelConsonantCounter {

    public static Map<String, Integer> countVowelsAndConsonants(String input) {
        Map<String, Integer> result = new HashMap<>();
        int vowels = 0, consonants = 0;

        input = input.toLowerCase();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        result.put("Vowels", vowels);
        result.put("Consonants", consonants);
        return result;
    }

    public static void main(String[] args) {
        String input = "Bhuvana is brilliant!";
        Map<String, Integer> result = countVowelsAndConsonants(input);

        System.out.println("Vowels: " + result.get("Vowels"));
        System.out.println("Consonants: " + result.get("Consonants"));
    }
}
