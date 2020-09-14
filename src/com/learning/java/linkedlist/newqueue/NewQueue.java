package com.learning.java.linkedlist.newqueue;

public class NewQueue {

    private Node head;
    private Node tail;
    private int size;

    public void offer(String data){

        if(head==null){
            head = new Node(data);
            tail=head;
        }else{
            Node newNode = new Node(data);
            tail.previous = newNode;
            newNode.next = tail;
            tail=newNode;
        }
        size++;
    }

    public Node pop(){

        Node headNode = head;
        if(headNode==null)
            return null;

        head = headNode.previous;

        headNode.previous=null;
        headNode.next=null;

        return headNode;
    }


}
