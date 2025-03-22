package com.content.java.core.collection;

public class DoubleLinkedList {

     static class Node{
        int data;
        Node next;
        Node prev;

        static Node head = null;

        public Node(int data){
            this.data= data;
            this.next=null;
            this.prev=null;
        }

        public Node() {
        }

         public  void traverseForward(){
             Node currentNode = head;
             while (currentNode!=null){
                 System.out.print(currentNode.data + "->");
                 currentNode=currentNode.next;
             }
         }
         public  void traverseBackword(){
             Node currentNode = head;
             while (currentNode.next!=null){
                 currentNode=currentNode.next;
             }
             while(currentNode!=null){
                 System.out.print(currentNode.data + "->");
                 currentNode=currentNode.prev;
             }
         }

         public  void insertNode(int data) {
             Node newNode = new Node(data);
             Node currentNode = head;
             if (head==null) {
                 head= currentNode=newNode;
             } else {
                 while (currentNode.next != null) {
                     currentNode = currentNode.next;
                 }
                 currentNode.next = newNode;
                 newNode.prev = currentNode;

             }
         }
    }



    public static void main(String[] args) {

    DoubleLinkedList.Node node = new DoubleLinkedList.Node();
    node.insertNode(34);
    node.insertNode(45);
    node.insertNode(35);
    node.insertNode(56);
    node.insertNode(5);
    node.insertNode(67);

    node.traverseForward();
    System.out.println();
    node.traverseBackword();

    }
}

