package com.learning.java.linkedlist.stack;

public class Stack {
    private StackNode node;
    private int size;

    public void push(String data){
        StackNode addNode =new StackNode(data);
        if(node==null){
            node = addNode;
        }else{
           addNode.top = node;
           node = addNode;
        }
        size++;
    }

    public StackNode pop(){
        StackNode popNode = node;
        if(popNode==null)
            return null;

        node = popNode.top;
        popNode.top =null;
        size--;
        return popNode;

    }

    public int size(){
        return this.size;
    }
}
