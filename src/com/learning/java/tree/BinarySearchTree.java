package com.learning.java.tree;

public class BinarySearchTree {

    public int[] getSortArray() {
        BinaryNode bs = this.root;
        getScores(bs);
        return this.sortArray;
    }

    public void setSortArray(int[] sortArray) {

        for (int i = 0; i < sortArray.length; i++) {
            insert(sortArray[i]);
        }
        this.sortArray = sortArray;
    }

    int loop = 0;
    int[] sortArray;
    private BinaryNode root;

    public BinaryNode getBinaryNode() {

        return this.root;
    }

    public void insert(int data) {

        if (this.root == null) {
            this.root = new BinaryNode(data, null, null);
            return;
        } else {
            this.root = traverseNode(this.root, data);


        }
    }

    public BinaryNode traverseNode(BinaryNode node, int data) {
        BinaryNode bNode = node;
        int compareValue = bNode.getData() - data;

        if (compareValue > 0) {
            if (node.getLeft() == null) {
                node.setLeft(new BinaryNode(data, null, null));
            } else {
                traverseNode(bNode.getLeft(), data);
            }
        }
        if (compareValue < 0) {
            if (node.getRight() == null) {
                node.setRight(new BinaryNode(data, null, null));
            } else {
                traverseNode(bNode.getRight(), data);
            }
        }
        return bNode;
    }

    public void getScores(BinaryNode bNode) {

        if (bNode == null)
            return;
        else {
            getScores(bNode.left);
            this.sortArray[loop] = bNode.getData();
            loop++;
            getScores(bNode.right);
        }

    }

    public void printNodes(BinaryNode bNode) {

        if (bNode == null)
            return;
        else {
            printNodes(bNode.left);
            System.out.print(bNode.getData() + " ");
            printNodes(bNode.right);
        }

    }

    public int getMin(BinaryNode bNode) {
        int data = 0;
        if (bNode == null)
            return data;
        if (bNode.left == null)
            return bNode.getData();
        return getMin(bNode.left);


    }

    public int getMax(BinaryNode bNode) {
        int data = 0;
        if (bNode == null)
            return data;

        if (bNode.right == null)
            return data = bNode.getData();

        return getMax(bNode.right);


    }


    public void deleteNode(BinaryNode deleteNode, int data) {

        if (deleteNode == null)
            return;
        int compareValue = deleteNode.getData() - data;

        if (compareValue > 0) {
            deleteNode(deleteNode.left, data);
        } else if (compareValue < 0) {
            deleteNode(deleteNode.right, data);
        } else if (deleteNode.left != null && deleteNode.right != null) {
            deleteNode.setData(getMin(deleteNode.right));
            deleteNode(deleteNode.right, deleteNode.getData());
        } else {

            if (deleteNode.left != null)
                deleteNode.left= null;
            else
                deleteNode.right = null;
        }

    }

    public void printTree(BinaryNode bn){
        if(bn==null ){
            System.out.println("Printing is completer");
        }
          System.out.println(bn.getData());
        if(bn.getLeft()!=null||bn.getRight()!=null){
            if(bn.getLeft()!=null) {
                System.out.println(" /");
                System.out.println("/");
                printTree(bn.getLeft());
            }
            if(bn.getRight()!=null) {
                System.out.println("|");
                System.out.println(" |");
                printTree(bn.getRight());
            }

        }

    }
}
