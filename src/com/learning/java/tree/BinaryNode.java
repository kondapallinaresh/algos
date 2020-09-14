package com.learning.java.tree;

public class BinaryNode {
    private int data;

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    BinaryNode left;

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    BinaryNode  right;

    public BinaryNode (int data,BinaryNode left,BinaryNode right ){
        this.data= data;
        this.left = left;
        this.right = right;
    }
    public BinaryNode(){
    }
    public int getData(){
        return this.data;
    }

    public void setData(int data){
         this.data = data;
    }


}
