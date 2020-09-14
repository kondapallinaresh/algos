package com.learning.java;

public class LinearTableDelete {


    public static void main(String args[]){
        int[] linearTable = {1,2,3,4,5,6,7,8};
        int deleteAt =5 ;

        int[] tmp = new int[linearTable.length-1];

        for(int i=0;i<linearTable.length-1;i++){
            if(i<deleteAt-1){
                tmp[i] =  linearTable[i];
             }else {
                tmp[i] =  linearTable[i+1];
            }
        }
        linearTable =  tmp;
        for(int i=0;i<tmp.length;i++){
            System.out.println(tmp[i]);
        }
    }
}
