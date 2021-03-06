package com.datastructures;


public class SLLPractice{
  Node head;
  static class Node{
	  int data;
	  Node next;
	  Node(int d){
		  data=d;
		  next=null;
		  
	  }
	  
	  public static SLLPractice insert(SLLPractice list,int data){
		  Node new_node=new Node(data);
		 // new_node.next=null;
		  if(list.head==null){
			  list.head=new_node;			  
		  }else{
			  Node last=list.head;
			  while(last.next!=null){
				  last=last.next;
			  }
			  last.next=new_node;
		  }
		  
	  return list;
	  }
	  
	  public static void print(SLLPractice list){
		  Node currNode=list.head;
		  System.out.print("practise = ");
		  while(currNode!=null){
			  System.out.print( " "+currNode.data);
		  currNode=currNode.next;
		  }
		  
		 
	  }
		public static void Find(SLLPractice list,int d) 
		{ 
			Node currNode = list.head; 

			int i=1;
			while (currNode != null) { 
				if(currNode.data==d){
				System.out.print("found="+currNode.data); 
				break;
				}
				System.out.println(i++);
				// Go to next node 
				currNode = currNode.next; 
			} 
			System.out.println(" Done");
		} 
		public static void deleteNode(Node Node_ptr) 
	       { 
	            Node temp = Node_ptr.next; 
	            Node_ptr.data = temp.data; 
	            Node_ptr.next = temp.next; 
	            temp = null; 
	      }
		
		/* Given a reference (pointer to pointer) to the head of a list 
	       and a position, deletes the node at the given position */
	     static void deleteNode(SLLPractice list ,int position) 
	    { 
	        // If linked list is empty 
	        if (list.head == null) 
	            return; 
	  
	        // Store head node 
	        Node temp = list.head; 
	  
	        // If head needs to be removed 
	        if (position == 0) 
	        { 
	        	list.head = temp.next;   // Change head 
	            return; 
	        } 
	  
	        // Find previous node of the node to be deleted 
	        for (int i=0; temp!=null && i<position-1; i++) 
	            temp = temp.next; 
	  
	        // If position is more than number of ndoes 
	        if (temp == null || temp.next == null) 
	            return; 
	  
	        // Node temp->next is the node to be deleted 
	        // Store pointer to the next of node to be deleted 
	        Node next = temp.next.next; 
	  
	        temp.next = next;  // Unlink the deleted node from list 
	    } 
	  public static void main(String args[]){
		  SLLPractice list=new SLLPractice();
		  list=insert(list, 1);
		  list=insert(list, 2);
		  list=insert(list, 3);
		 // print(list);
		  //Find(list,2);
		  //head node delete
		 //deleteNode(list.head);
		  list=insert(list, 4);
		
		  deleteNode(list,2);
		  print(list);
	  }
  }
	
}