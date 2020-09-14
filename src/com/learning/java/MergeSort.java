package com.learning.java;

public class MergeSort {

public static int scores[] = { 50,71, 65, 99, 87,72,71, 74, 63, 76, 100 };

    public static void main(String[] args){

       MergeSort ms = new MergeSort();
        int[] tmp = new int[scores.length];
         ms.split(scores,tmp,0,(scores.length-1));
       final int length = scores.length;
        for(int i = 0 ;i<scores.length;i++){
            System.out.print(scores[i]+" ");
        }
    }

    public  void split(int[] array,int[] tmp, int left,int right){

        if(left<right){
            int center= (left+right)/2;
            split( array,tmp, left, center);
            split( array, tmp,center+1, right);
            merge( array, tmp,left,center+1, right);
        }

    }

    public  String merge(int[] array,int[] tmp,int left,int right,int rightEndPoint){
        int leftEndPoint= right-1;
        int currentIndex=left;
        int size = rightEndPoint-left+1;
        //left rray
        //start of left left -- enf of left right

        //right array and left array
        //right start part right+1  -- end point rightEnd

          while(left<=leftEndPoint && right<=rightEndPoint){
               if(array[left]<=array[right]){
                   tmp[currentIndex++] = array[left++];
               }else{
                  tmp[currentIndex++] = array[right++];

               }

            }

        while(left<=leftEndPoint ){
            tmp[currentIndex++] = array[left++];

        }
        while(right<=rightEndPoint){
            tmp[currentIndex++] = array[right++];

        }
          for(int i = 0 ;i<size;i++){
              array[rightEndPoint] = tmp[rightEndPoint];
              rightEndPoint--;
          }

        return null;
    }
}
