package com.learning.java;

public class BubbleSort {

    public static void main(String[] args){

        int[] unsordetArray = {90,70,50,80,60,85,50} ;

        for(int i =0;i<unsordetArray.length;i++) {
               for(int j=0;j<unsordetArray.length-1-i;j++){
                 if(unsordetArray[j]>unsordetArray[j+1]){
                     int tmp = unsordetArray[j] ;
                     unsordetArray[j] = unsordetArray[j+1];
                     unsordetArray[j+1] = tmp;
                 }
            }
        }

        for(int i=0;i<unsordetArray.length;i++){
            System.out.println(unsordetArray[i]);
        }

    }
}
