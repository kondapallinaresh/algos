package com.learning.java.tree;

public class HeapSort {
    private int[] array;

    //Initialize the heap
    public void createHeap(int[] array) {
        this.array = array;
        //Build a heap, (array.length - 1) / 2 scan half of the nodes with child nodes
        for (int i = (array.length - 1) / 2; i >= 0; i--) {
            adjustHeap(i, array.length - 1);
        }
    }

    public void adjustHeap(int currentIndex, int maxLength) {
        int noLeafValue = array[currentIndex];
        // Current non-leaf node
        //2 * currentIndex + 1  Current left subtree subscript      
        for (int j = 2 * currentIndex + 1; j <= maxLength; j = currentIndex * 2 + 1) {
            if (j < maxLength && array[j] < array[j + 1]) {
                j++; // j Large subscript
            }
            if (noLeafValue >= array[j]) {
                break;
            }
            array[currentIndex] = array[j];
            // Move up to the parent node
            currentIndex = j;
        }
        array[currentIndex] = noLeafValue; // To put in the position
    }

    public void heapSort() {
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            adjustHeap(0, i - 1);
        }
    }


}
