package com.learning.java.linkedlist;

public class UnidirectionalLinkedList {

    public static Node head;
    public static Node tail;

    public static void main(String[] args){

       Node head =  initLinkedList();

      // print(head);

        addNewNode(new Node("hayward",null));
        print(head);
        System.out.println("   ");
        addNodeAt(4,new Node("Milpitas",null));
        print(head);
        System.out.println("   ");
        remove(4);
        System.out.println("   ");
        print(head);
    }

    private static void print(Node head) {
       // System.out.println(head.getData());
        while(head!=null){
             System.out.print("-->"+head.getData());
            head = head.next;
        }
    }

    private static Node initLinkedList() {
         head = new Node("SFO",null);
        Node oakLandNode = new Node("Oakland",null);
        head.next = oakLandNode;
        Node berkleyNode = new Node("Berkley",null);
        oakLandNode.next = berkleyNode;
         tail = new Node("Fremont",null);
        berkleyNode.next = tail;
        return head;
    }

    private static void addNewNode(Node node){
         tail.next = node;
         tail = node;
   }

   private static void addNodeAt(int index,Node node){
        int i = 1;
    while(head!=null&&index>=1){
          if(i==index-1){
            Node existingNode  = head.next;
            head.next = node;
            node .next = existingNode;
            break;
         }
        head =head.next;
        i++;
    }



   }
    private static void remove(int index){
        int i = 1;
        while(head!=null&&index>=1){
            if(i==index-2){
             head.next  = head.next.next;
             break;
            }
            head =head.next;
            i++;
        }

    }
}
