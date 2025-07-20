//Reversing Elements of Array
//Method: void reverseArray(int[] arr)


import java.util.*;
import java.io.*;

import java.util.*;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {97, 98, 99, 94, 92};
        reverseArray(arr);
        System.out.println("Array after reversing:");
        System.out.println(Arrays.toString(arr));
    }
}
