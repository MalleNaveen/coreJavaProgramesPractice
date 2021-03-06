package com.datastructures;


//Java Program to find the largest 
//nodes in doubly linked list 
class MaxvalueDoubleLinkList { 

	// Create node of the doubly linked list 
	static class Node { 
		int data; 
		Node next; 
		Node prev; 
	}; 

	// UTILITY FUNCTIONS 
	// Function to insert a node at the 
	// beginging of the Doubly Linked List 
	static Node push(Node head_ref, int new_data) 
	{ 
		// allocate node 
		Node new_node = new Node(); 

		// put in the data 
		new_node.data = new_data; 

		// since we are adding at the 
		// beginning, prev is always null 
		new_node.prev = null; 

		// link the old list off the new node 
		new_node.next = (head_ref); 

		// change prev of head node to new node 
		if ((head_ref) != null) 
			(head_ref).prev = new_node; 

		// move the head to point to the new node 
		(head_ref) = new_node; 
		return head_ref; 
	} 

	// Function to find the largest 
	// nodes in Doubly Linked List 
	static int LargestInDLL(Node head_ref) 
	{ 
		Node max, temp; 

		// initialize two pointer temp 
		// and max on the head node 
		temp = max = head_ref; 

		// traverse the whole doubly linked list 
		while (temp != null) { 

			// if temp's data is greater than 
			// max's data, then put max = temp 
			// and return max.data 
			if (temp.data > max.data) 
				max = temp; 

			temp = temp.next; 
		} 
		return max.data; 
	} 

	public static void main(String args[]) 
	{ 
		// Start with the empty list 
		Node head = null; 

		// Let us create a linked list 
		head = push(head, 20); 
		head = push(head, 14); 
		head = push(head, 181); 
		head = push(head, 100); 

		System.out.printf("%d", LargestInDLL(head)); 
	} 
} 

//This code is contributed by Arnab Kundu 

