//Valid Anagram Check
//Method: boolean isAnagram(String str1, String str2)

import java.io.*;
import java.util.*;

public class Anagram{
    public static void main(String[] args){
        System.out.println(isAnagram("listen","silent"));
    }
    public static boolean isAnagram(String str1,String str2){
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}