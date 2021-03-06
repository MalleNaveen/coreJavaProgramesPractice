package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashCodeOne {
	
	public static void main(String args[]){
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "one");
		map.put(1, "onetwo");
		map.put(1, "onetwo1");
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		ConcurrentHashMap<Integer, String> ch=new ConcurrentHashMap<Integer, String>();
		
	}

}
