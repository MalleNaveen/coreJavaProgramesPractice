package com.datastructures;

public class LinkedList1 {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
		public void push(int new_data) {
			Node new_node = new Node(new_data);
			new_node.next = head;
			head = new_node;
		}

		public void deleteNode(int key) {
			Node temp = head, prev = null;
			if (temp != null && temp.data == key) {
				head = temp.next;
				return;
			}
			if (temp != null && temp.data != key) {
				prev = temp;
				temp = temp.next;
			}
			if (temp == null) {
				return;
			}
			prev.next = temp.next;

		}

		public void println() {
			Node n = head;
			while (n != null) {
				System.out.println(n.data);
				n = n.next;
			}

		}
		
		
	}



