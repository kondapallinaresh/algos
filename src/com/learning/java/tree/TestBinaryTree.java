package com.learning.java.tree;

public class TestBinaryTree {
    static int[]  scores =  {10,7, 5, 2 ,18, 3, 16, 8, 19, 9};
    public static void main(String[] args){





       BinarySearchTree bs = new BinarySearchTree();
        bs.setSortArray(scores);

           int[] sortedScores = bs.getSortArray();
             for(int i=0;i<sortedScores.length;i++){
                System.out.print(sortedScores[i]+" ");
            }

             int min = bs.getMin(bs.getBinaryNode());
           int max = bs.getMax(bs.getBinaryNode());
            System.out.println("Min +"+min +"Max :"+max);
        //bs.deleteNode(bs.getBinaryNode(),2);
       // System.out.println("Min +"+min +"Max :"+max);
        //bs.printNodes(bs.getBinaryNode());
       // bs.deleteNode(bs.getBinaryNode(),3);
        //bs.printNodes(bs.getBinaryNode());
        bs.deleteNode(bs.getBinaryNode(),18);
        bs.printNodes(bs.getBinaryNode());


    }
}
