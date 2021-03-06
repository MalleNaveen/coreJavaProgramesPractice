package com.datastructures;



public class SingleLinkedListPra1 {
	Node head;
	
	static class Node{
		int data;
		Node next;	
	 Node(int d){
			data=d;
			next=null;
		}
		
	}
	
	public static void main(String args[]){
	
		SingleLinkedListPra1 sLinkist=new SingleLinkedListPra1();
		sLinkist.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		sLinkist.head.next=second;
		second.next=third;
	//	System.out.println(sLinkist);
		sLinkist.deleteNode(2);
		sLinkist.push(12);
		sLinkist.println();
	}
	
	/* Given a key, deletes the first occurrence of key in linked list */
    void deleteNode(int key) 
    { 
        // Store head node 
        Node temp = head, prev = null; 
  
        // If head node itself holds the key to be deleted 
        if (temp != null && temp.data == key) 
        { 
            head = temp.next; // Changed head 
            return; 
        } 
  
        // Search for the key to be deleted, keep track of the 
        // previous node as we need to change temp.next 
        while (temp != null && temp.data != key) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
  
        // If key was not present in linked list 
        if (temp == null) return; 
  
        // Unlink the node from linked list 
        prev.next = temp.next; 
    } 
	
	/* Inserts a new Node at front of the list. */
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    }
	public void println(){
		Node n=head;
		while(n !=null){
			System.out.println(n.data +"");
			n = n.next;
		}
		
		
	}
}
