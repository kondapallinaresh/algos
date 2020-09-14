package com.learning.java.linkedlist;

import java.awt.dnd.DnDConstants;

public class LinkedList {
    public static DNode head;
    public static DNode tail;

    public static void main(String[] args){
        init();
        print();
        System.out.println("After Add");
       // addAt(8,new DNode("F"));
        print();
        System.out.println("After remove");
        removeAt(5);
        print();
    }

    public static void init(){
        head = new DNode("A");
        DNode bNode = new DNode("B");
        head.nextNode = bNode;
        bNode.previousNode= head;

        DNode cNode = new DNode("C");
        bNode.nextNode = cNode;
        cNode.previousNode= bNode;

        DNode dNode = new DNode("D");
        cNode.nextNode = dNode;
        dNode.previousNode= cNode;

        tail = new DNode("E");
        dNode.nextNode = tail;
        tail.nextNode = head;
        tail.previousNode= dNode;
        head.previousNode = tail;
  }

  public static void print(){
         DNode positionNode = head;
          do{
            System.out.print(positionNode.getData() +"-->");
              positionNode = positionNode.nextNode;
           }while (positionNode.nextNode!=head);
      System.out.print(positionNode.getData() +"-->");
  }

  public static void addAt(int position,DNode dnode){
        DNode positionNode =head;
        if(position==1){
            dnode.nextNode = head;
            dnode.previousNode =tail;
            tail.nextNode = dnode;
            head.previousNode=dnode;
            head = positionNode;
            tail = dnode;
        }else{
            int i=1;
            while(positionNode.nextNode!=head){
              if(i == position-1){
                    positionNode.nextNode.previousNode = dnode;
                    dnode.nextNode = positionNode.nextNode;
                    positionNode.nextNode = dnode;
                    dnode.previousNode = positionNode;
                    break;
                }
                positionNode = positionNode.nextNode;
                i++;
            }
            if(positionNode.nextNode==head&&i==position){
                positionNode.nextNode = dnode;
                dnode.previousNode=positionNode;
                dnode.nextNode = head;
                head.previousNode = dnode;
                tail= dnode;
            }

        }
  }

  public static void removeAt(int position) {
      DNode positionNode = head;
      int i = 1;
      if (position == 1) {
          tail.nextNode =positionNode.nextNode;
          positionNode.nextNode.previousNode = tail;
          head = positionNode.nextNode;

      } else {
          while (positionNode.nextNode != head) {
              if (i == position-1) {
                  DNode node = positionNode.nextNode;
                  positionNode.nextNode = node.nextNode;
                  positionNode.nextNode.previousNode = node.previousNode;
                  break;
              }
              i++;
              positionNode = positionNode.nextNode;
          }
          tail = head.previousNode;

      }
  }
}
