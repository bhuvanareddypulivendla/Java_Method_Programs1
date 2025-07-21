//Check Armstrong Number
//Method: boolean isArmstrong(int n)

import java.io.*;
import java.util.*;

public class ArmstrongNumber{
    public static void main(String[] args){
        System.out.println(isArmstrong(153));
    }
    public static boolean isArmstrong(int n){
        int arm=0;
        int d=n;
        while(n>0){
            int a=n%10;
            arm=arm+a*a*a;
            n=n/10;
        }
        if(arm==d){
            return true;
        }else{
            return false;
        }
    }
}