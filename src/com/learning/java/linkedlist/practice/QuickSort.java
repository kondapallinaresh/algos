package com.learning.java.linkedlist.practice;

public class QuickSort {
    //               low                           high
    int[] scores = {16,19,18};
    //              i                              j

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        qs.quicksort(qs.scores,0,qs.scores.length-1);
    }

    private void quicksort(int[] scores, int start, int end) {

        int i = start;
        int j = end;

        if(start<end) {
            int thresholdValue = scores[start];
            while (i < j) {
                while (i < j && thresholdValue <= scores[j]) {
                    j--;
                }
                if (i < j) {
                    scores[i] = scores[j];
                    i++;
                }
                while (i < j && thresholdValue > scores[i]) {
                    i++;
                }
                if (i < j) {
                    scores[j] = scores[i];
                    j--;
                }

            }
             scores[i] = thresholdValue;
             quicksort(scores, start, i - 1);
             quicksort(scores, i + 1, end);

        }
        print(scores);

        }



    public void print(int[] linearTable){
        for(int k=0;k<linearTable.length;k++){
            System.out.print(linearTable[k]+" ");
        }
        System.out.println("");
    }


}
