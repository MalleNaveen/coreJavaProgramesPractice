package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String args[]){
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("A",1);
		map.put("B",2);
		map.put("Ab",3);
		map.put("Bc",5);
		System.out.println("entry"+map.entrySet());
		System.out.println("Keys"+map.keySet());
		System.out.println("values"+map.values());
		 // using iterators 
        Iterator<Entry<String, Integer>> itr = map.entrySet().iterator(); 
          
        while(itr.hasNext()) 
        { 
             Entry<String, Integer> entry = itr.next(); 
             System.out.println("mapKey = " + entry.getKey() +  
                                 ", mapValue = " + entry.getValue()); 
        } 
       
        
        LinkedHashMap<String, Integer> linkedmap=new LinkedHashMap<String, Integer>();
        linkedmap.put("A",1);
        linkedmap.put("B",2);
        linkedmap.put("c",3);
        linkedmap.put("Ab",3);
        linkedmap.put("Bc",5);
        //System.out.println( linkedmap.values());
        Iterator<Entry<String,Integer>> iter=linkedmap.entrySet().iterator();
        while(iter.hasNext()){
        Entry<String,Integer>	itEntry=iter.next();
       // System.out.println(itEntry.getKey());
        //System.out.println(itEntry.getValue());
        System.out.println("linkedmap  "+(itEntry));
        }
	}

}
