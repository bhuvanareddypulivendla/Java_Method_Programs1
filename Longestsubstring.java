// Longest Word in a Sentence
// Method: String longestWord(String sentence)

import java.util.*;

public class  Longestsubstring{
    public static void main(String[] args) {
        String longword = longestWord("Bhuvana is a good girl..");
        System.out.println("Longest word: " + longword);
    }

    public static String longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            // Remove punctuation like '..' if needed
            word = word.replaceAll("[^a-zA-Z]", "");
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }
}
