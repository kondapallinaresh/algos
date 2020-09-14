package com.learning.java;

public class LinearTableSearch {

    public static void main(String args[]){

        int[] linearTable = {2,4,5,8,19,21,23};

        int searchNumber = 24;
        int searchIndex = -1;
        for(int i=0;i<linearTable.length;i++){
            if(linearTable[i]==searchNumber) {
                searchIndex = i;
                System.out.println("index id " + i);
                break;
            }
        }
        if(searchIndex<0){
            System.out.println("index id not found");
        }


    }
}
