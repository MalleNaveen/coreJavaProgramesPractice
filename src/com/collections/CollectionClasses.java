package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.LinkedBlockingDeque;

public class CollectionClasses {
	public static void main(String arg[]){
		//list
		List<String> arrList=new ArrayList<String>();
		arrList.add("test");
		arrList.add("test1");
		arrList.iterator().remove();
		/*arrList.get(0);
		arrList.remove(1);
		arrList.set(0, "arryone");*/
		//arrList.forEach(System.out::println);
		  System.out.println("list"+arrList.get(0));
		List<String> linkList=new LinkedList<String>();
		linkList.add("test");
		linkList.add("naveen");
		linkList.add("naveen2");
		System.out.println("Linkedlist"+linkList);
        List<String> stack=new Stack<String>();
        stack.add("stacktest");
        stack.add("stacktest2");
        System.out.println("stack"+stack);
        //queue
        //Queue<String> queue=new Queue<String>();
        //queue.dump("queuetest");
        //queue.dump("queuetest2");
       // System.out.println("queqe"+queue);
        //set
        Set<String> hasSet=new HashSet<String>();
        hasSet.add("setTest");
        hasSet.add("setTest2");
        System.out.println("hasSet="+hasSet);
        Set<String> soredSet=new TreeSet<String>();
        soredSet.add("treetest");
        soredSet.add("testab");
        System.out.println("soredSet="+soredSet);
        
        //map
        Map<String,String> hashmap=new HashMap<String, String>();
        hashmap.put("1", "one");
        hashmap.put("2", "Two");
        hashmap.put("0", "Three");
        System.out.println("hashmap="+hashmap.entrySet());        
        System.out.println("hashmap="+hashmap.keySet());
        
        // using iterators 
        Iterator<Map.Entry<String, String>> itr = hashmap.entrySet().iterator(); 
          
        while(itr.hasNext()) 
        { 
             Map.Entry<String, String> entry = itr.next(); 
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue()); 
        } 
        Map<String,String> hashTable=new Hashtable<String, String>();
        hashTable.put("two", "test");// it won't all null it will give null pointer exception
        hashTable.put("1", "one");
        System.out.println("hashTable="+hashTable.entrySet());
        System.out.println("hashTable="+hashTable.keySet());
        
        //linked 
        LinkedBlockingDeque<String> concur=new LinkedBlockingDeque<String>();
        concur.add("1");
        concur.add("2");// it won't allow null values
        System.out.println("concur blockingdeque"+concur);
        LinkedHashMap<String, String> linkHashMap=new LinkedHashMap<String, String>();
        linkHashMap.put("1", "two");
        linkHashMap.put(null, null);
        System.out.println("linkHashMap"+linkHashMap.entrySet());
        System.out.println("linkHashMap"+linkHashMap.keySet());
        LinkedHashSet<String> hashSet=new LinkedHashSet<String>();
        hashSet.add("1");
        hashSet.add(null);
        System.out.println("LinkedHashSet"+hashSet.getClass());
        System.out.println("LinkedHashSet="+hashSet);
        //collectionclasses
        int[] num={1,4,5,2};
        Arrays.sort(num);
        Collections.sort(arrList);
        java.util.stream.Stream<String> ll=null;
        
        
        
        
	}

}
