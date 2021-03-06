package com.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapTesting {
	
	public static void main(String args[]) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("India", "Delthi");
		map.put("USA", "NewYork");
		map.put("UK", "London");
		map.put("France", "Paris");
		
		for(String cap:map.values()) {
			System.out.println(cap);
		}
		
	}

	/*1 2 3 * * * 
    *
  *
*
3
2
1 2 3 * * * N*/

}
