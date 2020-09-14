package com.learning.java.linkedlist.stack;

public class StackNode {
    private String data;
    public StackNode top;

    public StackNode(String data){
        this.data = data;
    }
    public String getData(){
        return this.data;
    }
}
