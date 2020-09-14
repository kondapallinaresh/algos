package com.learning.java.linkedlist;

public class TestQueue {
    public static void main(String[] args){

        Queue qe = new Queue();
        qe.offer("A");
        qe.offer("B");
        qe.offer("C");
        qe.offer("D");
        qe.offer("E");
        System.out.print("abc");
        DNode dnode;
        while((dnode=qe.pop())!=null){
            System.out.print(dnode.getData()+"--->");
        }
    }
}
