package com.learning.java.linkedlist;

public class DLinkedList {

    public static DNode head;
    public static DNode tail;

    public static void main(String[] args){
         head =  intDlist();
        addNodeAtEnd(5,new DNode("Milpitas"));
        print();
    }

    private static void print( ) {

        while(head!=null){
            System.out.print(head.getData()+"-->");
              head = head.nextNode;
        }
        System.out.println("");

        while(tail!=null){
            System.out.print(tail.getData()+"-->");
            tail = tail.previousNode;
        }
    }

    private static DNode intDlist() {

        head = new DNode("SFO");
        DNode oakNode = new DNode("OAKLAND");
        oakNode.previousNode = head;
        head.nextNode = oakNode ;
        DNode berkNode = new DNode("BERKLEY");
        berkNode.previousNode = oakNode;
        oakNode.nextNode = berkNode ;
        tail = new DNode("FREMONT");
        tail.previousNode= berkNode;
        berkNode.nextNode = tail;
      return head;

    }

    public static void addNodeAtEnd(int position,DNode dnode){
        //DNode positionNode = head;
        if(position==1){
             head.previousNode = dnode;
            dnode.nextNode = head;
            head = dnode;
            dnode.previousNode=null;
         }else {
            int i = 2;
            DNode positionNode = head.nextNode;
            while (positionNode != null) {
              if(i==position) {
                   DNode previousNode =  positionNode.previousNode;
                    dnode.nextNode = positionNode;
                    positionNode.previousNode.nextNode = dnode;
                    positionNode.previousNode = dnode;
                    dnode.previousNode = previousNode;
                 break;
                }else if(positionNode.nextNode==null){
                  positionNode.nextNode = dnode;
                  dnode.previousNode= positionNode;
                  dnode.nextNode=null;
                  tail = dnode;
                  break;
              }
                positionNode = positionNode.nextNode;
                i++;
            }
        }


    }
}
