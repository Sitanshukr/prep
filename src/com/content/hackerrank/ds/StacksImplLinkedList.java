package com.content.hackerrank.ds;

/*Stacks contains Push and Pop Operations
 * 
 * 
 * 
 * 
 */

public class StacksImplLinkedList {

	public Node first=null;
	
  public class Node{
	  
	  int data;
	  Node next;
	  
	  public Node(int item) {
		  this.data= item;
	  }
  }
  
  
  public void push(int item) {
	  
	  Node node = new Node(item);
	  
	  if(node.next==null) {
		  first=node;
	  }else {
		  
		  first.next.data=node.data;
		  
		  
	  }
  } 
  
  public void printLinkedList(Node node) {
	  
	  while(node.next!=null) {
		  System.out.println("Element " + node.data);
		  
	  }
  }
  
}
