//Check Even or Odd
//Write a method boolean isEven(int n) that returns true if the number is even.

import java.io.*;
import java.util.*;

public class EvenorOdd{
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(isEven(10));
    }
}
