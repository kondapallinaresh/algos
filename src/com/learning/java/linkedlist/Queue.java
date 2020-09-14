package com.learning.java.linkedlist;

public class Queue {

    private  DNode head;
    private  DNode tail;
    private int size;


    public void offer(String data){
        if(head==null){
            head = new DNode(data);
            tail=head;
            size++;
        }else{
            DNode dNode = new DNode(data);
            dNode.nextNode =tail;
            tail.previousNode = dNode;
            tail = dNode;
            size++;

        }
    }

    public DNode pop(){
        DNode p =head;
        if(p==null)
            return null;

        head = head.previousNode;
        p.nextNode=null;
        p.previousNode=null;
        size--;
        return p;

    }

    public int size(){
        return size;
    }






}
