package com.learning.java;

import com.sun.codemodel.internal.JWhileLoop;

public class DichtomyBinarySearch {

    public static void main(String[] args){
    int[] unsordetArray = { 30, 40, 50, 70, 85, 90, 100,110 };

    int midIndex = 0;
    int minValue=0;
    int arrayLength = unsordetArray.length;
    int searchValue = 110;
    int searchIndex = -1;

       while(minValue<arrayLength){
           midIndex = (minValue+arrayLength)/2;
          if(searchValue==unsordetArray[midIndex]){
               searchIndex = midIndex;
               break;
           } else if(searchValue<unsordetArray[midIndex]){
               arrayLength = midIndex-1;
          }else if((searchValue>unsordetArray[midIndex])){
               minValue = midIndex+1;
         }
       }

        System.out.println("Search Index ="+searchIndex);



}
}
