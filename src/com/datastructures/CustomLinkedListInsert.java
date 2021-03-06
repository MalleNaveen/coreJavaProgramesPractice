package com.datastructures;



import java.io.*; 

//Java program to implement 
//a Singly Linked List 
public class CustomLinkedListInsert { 

	Node head; // head of list 

	// Linked list Node. 
	// This inner class is made static 
	// so that main() can access it 
	static class Node { 

		int data; 
		Node next; 

		// Constructor 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	// Method to insert a new node 
	public static CustomLinkedListInsert insert(CustomLinkedListInsert list, int data) 
	{ 
		// Create a new node with given data 
		Node new_node = new Node(data); 
		new_node.next = null; 

		// If the Linked List is empty, 
		// then make the new node as head 
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			// Else traverse till the last node 
			// and insert the new_node there 
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			// Insert the new_node at last node 
			last.next = new_node; 
		} 

		// Return the list by head 
		return list; 
	} 

	// Method to print the CustomLinkedListinsert. 
	public static void printList(CustomLinkedListInsert list) 
	{ 
		Node currNode = list.head; 

		System.out.print("CustomLinkedListinsert: "); 

		// Traverse through the CustomLinkedListinsert 
		while (currNode != null) { 
			// Print the data at current node 
			System.out.print(currNode.data + " "); 

			// Go to next node 
			currNode = currNode.next; 
		} 
	} 
	/* Given a reference (pointer to pointer) to the head of a list 
    and a position, deletes the node at the given position */
 void deleteNode(int position) 
 { 
     // If linked list is empty 
     if (head == null) 
         return; 

     // Store head node 
     Node temp = head; 

     // If head needs to be removed 
     if (position == 0) 
     { 
         head = temp.next;   // Change head 
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
	// Driver code 
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		CustomLinkedListInsert list = new CustomLinkedListInsert(); 

		// 
		// ******INSERTION****** 
		// 

		// Insert the values 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
		list = insert(list, 6); 
		list = insert(list, 7); 
		list = insert(list, 8); 

		// Print the CustomLinkedListinsert 
		printList(list); 
	} 
} 

