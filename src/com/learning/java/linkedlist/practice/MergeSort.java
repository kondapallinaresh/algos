package com.learning.java.linkedlist.practice;

public class MergeSort {
    int[] scores =  {10,7, 5, 2 ,18, 3, 16, 8, 19, 9};
    //int[] scores =  {10,7, 5, 2};

    public static void main(String[] args){
        MergeSort ms = new MergeSort();
        ms.split(ms.scores,0,ms.scores.length-1);
    }

     public void split(int[] scores,int left,int right){

             if(left<right){
             int center = (left+right)/2;
             split(scores,left,center);
             split(scores,center+1,right);
             merge(scores,new int[scores.length],left,center+1,right);
            }
     }

     public void merge(int[] scores,int[] tmp,int left,int right,int rightEndIndex){
        int currentIndex = left;
        int leftEndIndex = right-1;
        int elements = rightEndIndex-left+1;
        while(left<=leftEndIndex&&right<=rightEndIndex){
            if(scores[left]<=scores[right])
                tmp[currentIndex++] = scores[left++];
            else
                tmp[currentIndex++] = scores[right++];
       }
        while (left<=leftEndIndex){
            tmp[currentIndex++] = scores[left++];
        }
         while (right<=rightEndIndex){
             tmp[currentIndex++] = scores[right++];
         }
        for(int i=0;i<elements;i++){
            scores[rightEndIndex] = tmp[rightEndIndex];
            rightEndIndex--;
        }
         print(tmp);

     }

    public void print(int[] linearTable){
        for(int i=0;i<linearTable.length;i++){
            System.out.print(linearTable[i]+" ");
        }
        System.out.println("");
    }



}
