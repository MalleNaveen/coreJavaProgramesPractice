package com.datastructures;

public class DLLPractice {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
			data=d;
			
		}
	}
	
	
	public void push(int data){
		
		Node new_Node=new Node(data);
		new_Node.next=head;
		new_Node.prev=null;
		if(head!=null){
			head.prev=new_Node;
		}
		head=new_Node;
		
		
	}

	public void printList(Node node){
		Node last=null;
		System.out.print("Forward DLL list :");
		while(node!=null){
			System.out.print(node.data +" ");
		   last=node;
		   node=node.next;
		}
		System.out.println("\n");
		System.out.print("Backward DLL list :");
		while(last!=null){
			System.out.print(last.data+" ");
		last=last.prev;
		}
	}
	
	 // Function to delete a node in a Doubly Linked List. 
    // head_ref --> pointer to head node pointer. 
    // del --> data of node to be deleted. 
    void deleteNode(Node head_ref, Node del) 
    { 
  
        // Base case 
        if (head == null || del == null) { 
            return; 
        } 
  
        // If node to be deleted is head node 
        if (head == del) { 
            head = del.next; 
        } 
  
        // Change next only if node to be deleted 
        // is NOT the last node 
        if (del.next != null) { 
            del.next.prev = del.prev; 
        } 
  
        // Change prev only if node to be deleted 
        // is NOT the first node 
        if (del.prev != null) { 
            del.prev.next = del.next; 
        } 
  
        // Finally, free the memory occupied by del 
        return; 
    }
    
	public static void main(String[] args) {
		DLLPractice dllp=new DLLPractice();
		dllp.push(8);
		dllp.push(2);
		dllp.push(4);
		dllp.push(6);
		//dllp.printList(dllp.head);
		// Deleting middle node from 8->4->2 
		dllp.deleteNode(dllp.head, dllp.head.next); 
		dllp.printList(dllp.head);
		
	}

}
