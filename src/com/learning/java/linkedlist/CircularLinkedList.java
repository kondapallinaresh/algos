package com.learning.java.linkedlist;

public class CircularLinkedList {

    private static Node head;
    private static Node tail;
    public static void main(String[] args){
        init();
        print();
        addAt(8,new Node("Walnut",null));
        System.out.println("");
        print();
        removeAt(2);
        System.out.println("after remove");
        print();
    }

    public static void init(){
        head = new Node("SFO",null);
        Node oakNode = new Node("OAKLAND",null);
        head.next = oakNode;
        Node berkNode = new Node("BERKELEY",null);
        oakNode.next = berkNode;
        tail = new Node("FREEMONT",null);
        berkNode.next=tail;
        tail.next = head;
     }

    public static void print(){
        String data = head.getData();
        Node positionNode = head;
        String headData="";
        do {
            System.out.print(positionNode.getData() + "--->");
            positionNode = positionNode.next;
            headData = head.getData();
        }
        while(positionNode!=head);
        System.out.println("Reverse Order");


    }

    public static void addAt(int index,Node addNode){
        Node positionNode = head;
        if(index==1){
            addNode.next = head;
            tail.next = addNode;
            head = addNode;
        }else{
            int i = 1;
            while(positionNode.next!=head){
                if(i==index-1) {
                    Node nextNode = positionNode.next;
                    positionNode.next = addNode;
                    addNode.next = nextNode;
                    break;
                }
                positionNode=positionNode.next;
                i++;
            }
            if(positionNode.next==head&&i==index){
                positionNode.next = addNode;
                addNode.next = head;
            }

            /*String data = head.getData();
            String headData="";
            while(i<=index&&positionNode!=null){
                if(data==positionNode.next.getData()){
                    positionNode.next = addNode;
                    addNode.next = head;
                    break;
                }else if(i==index-1){
                    Node nextNode = positionNode.next;
                    positionNode.next =addNode;
                    addNode.next = nextNode;
                   break;
                }
                i++;
                if(data==positionNode.next.next.getData()){
                    if(index>i+1){
                        System.out.println("WE HAD ONLY "+i+"  Nodes Not Possible to add at index "+index+" ,max allowed index is "+(i+1));
                        break;
                    }
                }
                positionNode=positionNode.next;
             }*/

        }
    }
    public static void removeAt(int index){
        Node positionNode = head;
        if(index==1){
            tail.next = head.next;
            head = head.next;
        }else{

            int i =1;
            while(positionNode.next!=head){
                if(i==index-1) {
                    positionNode.next = positionNode.next.next;
                    break;
                }
                positionNode=positionNode.next;
                i++;
            }
           /* int i = 1;
            String data = head.getData();
            String headData="";
            boolean tailNode=false;
            while(i<=index&&positionNode!=null){
                if(tailNode){
                    positionNode.next = head;
                     tail = positionNode;
                    break;
                }else if(i==index-1){
                    positionNode.next = positionNode.next.next;
                    break;
                }
                i++;
                if(data==positionNode.next.next.getData()){
                    tailNode = true;
                    if(index>i+1){
                        System.out.println("WE HAD ONLY "+i+"  Nodes Not Possible to add at index "+index+" ,max allowed index is "+(i+1));
                        break;
                    }
                }
                positionNode=positionNode.next;
             }*/
         }
    }
}
