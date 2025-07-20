//Find Second Largest in Array
//Method: int secondLargest(int[] arr)

import java.io.*;
import java.util.*;

public class SecondLargest{
    public static int secondLargest(int[] arr){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int n:arr){
            if(n>first){
                second=first;
                first=n;
            }else if(n>second&&n!=first){
                second=n;
            }

        }
        return second;
    }
    public static void main(String[] args){
        int[] arr={89,80,76,87};
        System.out.println(secondLargest(arr));
    }
}
