//Sum of Two Numbers
//Write a method int add(int a, int b) that returns the sum of two numbers.
import java.io.*;
import java.util.*;

public class SumofNumbers{
    public static int Sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        int c=Sum(10,20);
        System.out.println("Sum of a and b is:" +c);
    }
}
