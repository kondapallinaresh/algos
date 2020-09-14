package com.learning.java.linkedlist.newqueue;

public class Node {
    private String data;
    public Node previous;
    public Node next;

    public Node(String data){
        this.data=data;
    }

    public String getData(){
        return this.data;
    }
}
