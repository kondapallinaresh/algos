package com.practice;

public class BinaryToDecimal {

    public static void main (String args[]){
        String binaryNumber = "101" ;
        int decimalNumber=0;
        for (int i=1;i<=binaryNumber.length();i++){
             decimalNumber+= (int) ( Integer.valueOf(String.valueOf(binaryNumber.charAt(binaryNumber.length()-i)))*Math.pow(2,i-1));
        }
        System.out.println(decimalNumber);
    }
}
