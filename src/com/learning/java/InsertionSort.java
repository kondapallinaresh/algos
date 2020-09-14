package com.learning.java;

public class InsertionSort {
    public static void main(String[] args){
    int[] unsordetArray = {90,70,50,80,60,85,50} ;

        int insertIndex = 0;
        for(int i =0;i<unsordetArray.length;i++) {
            insertIndex = i;
         for(int j=insertIndex;j>0;j--){
            if(unsordetArray[j]<unsordetArray[j-1]){
                int tmp = unsordetArray[j] ;
                unsordetArray[j] = unsordetArray[j-1];
                unsordetArray[j-1] = tmp;
            }
        }
    }

        for(int i=0;i<unsordetArray.length;i++){
        System.out.println(unsordetArray[i]);
    }

}
}
