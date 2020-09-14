package com.learning.java.linkedlist;

public class QuickSort {

   //int[] scores =  {90, 60, 50, 80, 70, 100};
   //int[] scores =  {10,7, 5, 2 ,18, 3, 16, 8, 19, 9};
    int[] scores = {16,19,18};
    int k=1;

   public static void main(String[] args){
       QuickSort qs = new QuickSort();
       qs.print(qs.scores);
       qs.quickSort(qs.scores,0,(qs.scores.length-1));
       System.out.println("The End ++++++++++++++++++");
       System.out.println("The End ++++++++++++++++++");
       qs.print(qs.scores);
   }



   public void quickSort(int[] scores,int low,int high){
       int secondaryIndex=low;
       int thresold = low;
       int i = low;
       int j = high;

      // System.out.print("Low  :"+low+"  high :"+high+" threshold  :"+thresold);
       print(scores);
      k++;
       int secondLowindex = low;

      if(low<high) {
          while (i < j && scores[j] >= scores[thresold]) {
              j--;

          }
          while (low < high && scores[i] < scores[thresold]) {
              i++;

          }

          System.out.println("loop =" + k);
          System.out.println("Low  :" + low + "  high :" + high + " threshold  :" + thresold);

          if (i < j) {
              int tmp = scores[i];
              scores[i] = scores[j];
              scores[j] = tmp;
              print(scores);
              System.out.println("Low  :" + low + "  high :" + high + " threshold  :" + thresold);
              quickSort(scores, low, high);
          }
          if (i >= j) {
              int tmp = scores[i];
              scores[i ] = scores[thresold];
              scores[thresold] = tmp;
              print(scores);
              quickSort(scores, low, i-1);
              quickSort(scores, i+1 , high);
          }


      }





   }

public void print(int[] linearTable){
    for(int i=0;i<linearTable.length;i++){
        System.out.print(linearTable[i]+" ");
    }
    System.out.println("");
}



}
