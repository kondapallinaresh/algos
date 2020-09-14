package com.learning.java.linkedlist.newqueue;

public class TestNewQueue {

    public static void main(String[] args){
        NewQueue nq = new NewQueue();

        nq.offer("A");
        nq.offer("B");
        nq.offer("C");
        nq.offer("D");
        nq.offer("E");
        Node node;
        while((node=nq.pop())!=null){
            System.out.print(node.getData()+"--->");
        }

    }
}
