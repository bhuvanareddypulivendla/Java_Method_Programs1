//Palindrome Check
//Write a method boolean isPalindrome(String str) that checks if the input string is a palindrome.



import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(String n) {
        String reversed = new StringBuilder(n).reverse().toString();
        return n.equalsIgnoreCase(reversed); // Ignores case when comparing
    }

    public static void main(String[] args) {
        boolean result = isPalindrome("Bhuvana");
        System.out.println("Is Palindrome: " + result);
    }
}
