//Prime Number Checker
//Method: boolean isPrime(int n)

import java.io.*;
import java.util.*;

public class PrimeCheck{
    public static boolean prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("IsPrime:" +prime(7));
        System.out.println("IsPrime:" +prime(10));

    }
}