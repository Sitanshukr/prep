package com.content.java.core.collection;

import com.content.java.core.oops.Student;

import java.util.HashMap;

public class Node {
     int data;
     Node next;


     private static Node add(int data, Node head){
         Node valueNode = new Node();
         valueNode.data=data;
         Node currentNode = head;
         if(head.next==null){
             head.next = valueNode;
             currentNode = valueNode;
         }else{
            while(currentNode.next!=null){
                  currentNode=currentNode.next;
            }
            currentNode.next=valueNode;
         }
         return head;
     }

    private static String remove(int data, Node head){
            if(head==null){
                return "List is Empty";
            }else{
                Node currentNode = head;
                while(currentNode.next.data != data){
                    currentNode= currentNode.next;
                }

                currentNode.next=currentNode.next.next;
            }
        return  "Node removed";
    }

    private static void display(Node head){
            if(head==null) {
                System.out.println("Linked list is Empty");
            }else{
                Node currentNode = head;
                while (currentNode!=null){
                    System.out.print(currentNode.data+" --> ");
                    currentNode=currentNode.next;
                }
            }
    }

    public static void main(String[] args) {
            Node head = new Node();
            for (int i =0; i<10; i++){
                head= Node.add(i,head);
        }
            add(56,head);
             add(06,head);
             add(34,head);
             add(90,head);
             add(4000,head);
        add(4000,head);

        System.out.println("List Before");
        display(head);
        remove(56,head);
        System.out.println("After Node deletion");
        display(head);
        remove(5,head);
        System.out.println("/n");
        display(head);
    }
}

