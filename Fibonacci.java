//Fibonacci Series (first N terms)
//Method: void printFibonacci(int n)

import java.util.*;
import java.io.*;

public class Fibonacci{
    public static void printFibonacci(int n){
        int first=0;
        int second=1;
        for(int i=0;i<=n;i++){
            System.out.print(first +" ");
            int next=first+second;
            first=second;
            second=next;
        }
    }
    public static void main(String[] args){
        printFibonacci(5);
    }
}