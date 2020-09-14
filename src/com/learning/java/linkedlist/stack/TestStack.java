package com.learning.java.linkedlist.stack;

public class TestStack {
    public static void main(String[] args){

        Stack st =new Stack();
        st.push("A");
        st.push("B");
        st.push("C");
        //st.pop();
        st.push("D");
        st.push("E");
        StackNode sNode;
        while((sNode=st.pop())!=null){
            System.out.print(sNode.getData()+"-->");
        }
    }

}
