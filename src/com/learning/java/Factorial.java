package com.learning.java;

public class Factorial {

    public static void main(String[] aargs){
System.out.print(factorial(2));

    }

    public static int factorial(int n){
       if(n==1){
            return n;
        }else{
            n = n*factorial(n-1);
        }
        return n;
    }
}
