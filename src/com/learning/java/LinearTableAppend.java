package com.learning.java;

public class LinearTableAppend {
    public static void main(String args[]){

        int[] linearTable = {2,4,5,8,19,21,23};

        int[] temp = new int[linearTable.length+1];

        for(int i=0;i<linearTable.length;i++){
            temp[i] = linearTable[i];
        }

        temp[linearTable.length] = 78;
        linearTable = temp;

        for(int i=0;i<linearTable.length;i++){
            System.out.println(linearTable[i]);
        }


    }
}
