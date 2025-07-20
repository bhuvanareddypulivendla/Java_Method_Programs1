//Find Maximum of Three Numbers
//Write a method int maxOfThree(int a, int b, int c).

import java.io.*;
import java.util.*;

public class MaximumNumber{
    public static int Maximum(int a,int b,int c){
        if(a>b&&a>c){
            return a;
        }else if(b>c&&b>c){
            return b;
        }else{
            return c;
        }
    }
    public static void main(String[] args){
        System.out.println("The highest numbers among a,b,c is:" +Maximum(10,20,30));
    }
}
