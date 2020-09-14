package com.learning.java.tree;

public class TestHeapSort {
    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] scores = {10, 90, 20, 80, 30, 70, 40, 60, 50};
        System.out.println("Before building a heap : ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + ", ");
        }
        System.out.print("\n\n");          ////////////////////////////////////////////////////////////
        System.out.println("After building a heap : ");

        heapSort.createHeap(scores);
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + ", ");
        }
        System.out.print("\n\n");
        System.out.println("After heap sorting : ");
        heapSort.heapSort();
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + ", ");
        }
    }


    }
