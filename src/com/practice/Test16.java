package com.practice;

import com.datastructures.LinkedList1;

class SingleLinkedList{
	
	
	
	public void test(){
		System.out.println("single test");
	}
}

public class Test16 {

	public static void main(String args){
		LinkedList1 listr=new LinkedList1();
		listr.push(12);
		listr.push(13);
		listr.deleteNode(12);
		listr.println();
	}

}
