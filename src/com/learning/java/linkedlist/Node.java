package com.learning.java.linkedlist;

public class Node {

    private String data;
    public Node next;
    public Node (String data,Node next){
        this.data = data;
        this.next=next;
    }
    public String getData(){
        return this.data;
    }
}
