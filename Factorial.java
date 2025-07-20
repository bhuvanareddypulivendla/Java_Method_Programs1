//Calculate Factorial
//Write a method int factorial(int n) using a loop.

import java.io.*;
import java.util.*;

public class Factorial{
    public static void main(String[] args){
            System.out.println(fact(5));
    }
    public static int fact(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;
    }
}

