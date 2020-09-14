package com.learning.java.linkedlist;

public class NewMergeSort {

    //public int[] array = { 50,71, 65, 99, 87,72,71, 74, 63, 76, 100 };
    int[] array =  {10,7, 5, 2};


    public static void main(String[] args){

        NewMergeSort nms = new NewMergeSort();
        nms.split(nms.array,0,nms.array.length-1);
        for(int i = 0 ;i<nms.array.length;i++){
            System.out.print(nms.array[i]+" ");
        }

    }

    public void split(int[] array,int left,int right){
      if(left<right){
             int center = (left+right)/2;
            split(array,left,center);
            split(array,center+1,right);
            merge(array,new int[array.length],left,center+1,right);
        }
    }

    private void merge(int[] array,int[] tmp, int left, int right, int rightEndIndex) {
        int leftEndPoint = right-1;
        int currentIndex=left;
        int elements = rightEndIndex-left+1;
        while(left<=leftEndPoint && right<=rightEndIndex){
            if(array[left]<=array[right]){
                tmp[currentIndex++] = array[left++];
            }else{
                tmp[currentIndex++] = array[right++];
            }
        }
        while(left<=leftEndPoint){
            tmp[currentIndex++] = array[left++];
        }
        while(right<=rightEndIndex){
            tmp[currentIndex++] = array[right++];
        }
        for(int i=0;i<elements;i++){
            array[rightEndIndex] = tmp[rightEndIndex];
            rightEndIndex--;
        }
  }
}
