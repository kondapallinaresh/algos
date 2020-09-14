package com.practice;

public class OcaltoDecimal {

    public static void  main(String args[]){
        String octalNumber ="72625";
        int decimalNumber = 0;

        for(int i=1;i<=octalNumber.length();i++){
            decimalNumber+= (int) ( Integer.valueOf(String.valueOf(octalNumber.charAt(octalNumber.length()-i)))*Math.pow(8,i-1));
        }
        System.out.println(decimalNumber);

    }
}
