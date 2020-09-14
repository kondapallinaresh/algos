package com.learning.java;

public class LinearTableInsert {

    public static void main(String args[]){

        int[] linearTable = {1,2,3,4,5,6,7,8};
        int insertAt = 5;
        int insertNumber = 25;
        int tempArray [] = new int[linearTable.length+1];
         tempArray [insertAt-1] = insertNumber;
        for(int i=0;i<linearTable.length;i++) {
             if (i<insertAt-1)
                tempArray[i] = linearTable[i];
            else
             tempArray[i+1] = linearTable[i];

        }
        linearTable =  tempArray;
        for(int i=0;i<linearTable.length;i++){
            System.out.println(linearTable[i]);
        }


    }
}
