package com.collections;





public class CustomLinkedList<E> {
		private int size = 0;
		private Node node; // root node
		private Node lastNode;
		
		/**
		 * Add element at last.
		 * 
		 * @param data
		 */
		public void add(int data) {
			if (data == 0) {
				return;
			}
			Node newNode = new Node(data);
			if (node == null) {
				node = newNode;
			} else {
				lastNode.setNode(newNode);
			}
			lastNode=newNode;
			size++;
		}
		
		private Node next(Node node) {
			if (node.getNode() != null) {
				return node.getNode();
			} else {
				return null;
			}
		}
		
		public int size() {
			return this.size;
		}
		
		@Override
		public String toString() {
			String represent = "[";
			Node nextNode = this.node;
			while (nextNode != null) {
				represent = represent + nextNode.toString();
				nextNode = next(nextNode);
				if (nextNode != null) {
					represent = represent + ",";
				}
			}
			represent = represent + "]";
			return represent;
		}
		
		
		class Node{
			private int data;
			private Node next;
			private Node node;
			private E data2;
			public Node(int data) {
				this.data = data;
			}
			public Node(int data, Node next) {
				this.data = data;
				this.next = next;
			}
			public int getData() {
				return data;
			}
			public void setData(int data) {
				this.data = data;
			}
			public Node getNext() {
				return next;
			}
			public void setNext(Node next) {
				this.next = next;
			}
			public Node getNode() {
				return node;
			}
			public void setNode(Node node) {
				this.node = node;
			}
			
			
		}
	}
