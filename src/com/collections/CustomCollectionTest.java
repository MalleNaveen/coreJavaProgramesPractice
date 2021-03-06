package com.collections;

public class CustomCollectionTest {

	public static void main(String arg[]){
		
		//Custom Arraylist
		CustomeArrayList<Integer> cArr=new CustomeArrayList<Integer>();
		cArr.add(2);
		cArr.add(3);
		cArr.add(4);
		cArr.remove(1);
		cArr.set(0, 5);
		System.out.println(cArr.get(0));
		System.out.println(cArr.get(1));
		
		//Custom Linked list
		
		CustomLinkedList<Integer> cusLink=new CustomLinkedList<Integer>();
		cusLink.add(1);
		cusLink.add(2);
		System.out.println("cusomlink"+cusLink);
		
		//custom hash set
		CustomHashSet<Integer> customHashSet=new CustomHashSet<Integer>();
		customHashSet.add(1);
		customHashSet.add(2);
		customHashSet.display();
		System.out.println("customhashset="+customHashSet.contains(1));
		
		//custom hash map
		
		CustomHashMap<Integer,String> customHashMap=new CustomHashMap<Integer,String>();
		customHashMap.put(1, "one");
		customHashMap.put(2, "two");
		customHashMap.display();
		System.out.println("Custom hash map="+customHashMap.get(2));
	}
}
