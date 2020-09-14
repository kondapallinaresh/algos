package com.learning.java;

public class TwowayMerge {
    /*
     * private static int left; private static int right;
     */
    public static void main(String[] args) {
        int scores[] = { 50, 65, 99, 87, 74, 63, 76, 100 };
        int sortedScores[] = mergeSort(scores);
        print(sortedScores);
    }
    private static void print(int[] sortedScores) {
    }
    private static int[] mergeSort(int[] scores) {
        split(scores, new int[scores.length], 0, scores.length - 1);
        return null;
    }
    private static void split(int[] scores, int[] temp, int left, int right) {
        if (left < right) {
            int center = getCenter(left, right);
            split(scores, temp, left, center);
            //split(scores, temp, center + 1, right);
            merge(scores, temp, left, center + 1, right);
        }
    }
    private static void merge(int[] scores, int[] temp, int left, int right, int rightEndIndex) {
        System.out.println(left + "  " + rightEndIndex);
        // System.out.println(scores[left] + " " + scores[right]);
        /*
         * if (scores[left] > scores[right]) { temp[right] = scores[left];
         * temp[left] = scores[right]; } else { temp[left] = scores[left];
         * temp[right] = scores[right]; }
         */
        /*
         * System.out.println(); for (int i = 0; i < temp.length; i++) {
         * System.out.print(temp[i] + "-->"); } System.out.println();
         */
    }
    private static int getCenter(int left, int right) {
        int center = (left + right) / 2;
        return center;
    }
}
