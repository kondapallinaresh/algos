package com.learning.java;

public class SelectionSort {

    public static void main(String[] args){

        int[] unsordetArray = {45,90,70,50,80,60,85,50} ;
        int tmp =0;
        for(int i =0;i<unsordetArray.length;i++) {
            tmp =i;
            for(int j=i;j<unsordetArray.length;j++){
               if(unsordetArray[tmp]>unsordetArray[j]){
                     tmp = j ;
                }
           }
            if(i!=tmp) {
                int swapValue = unsordetArray[i];
                unsordetArray[i] = unsordetArray[tmp];
                unsordetArray[tmp] = swapValue;
            }

        }
      for(int score:unsordetArray){
            System.out.println(score);
        }

    }
}
