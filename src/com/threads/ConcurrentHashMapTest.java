package com.threads;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author malle
 *
 */
public class ConcurrentHashMapTest {
	public static void main(String args[]){
		ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<Integer,String>();
		map.put(1,"one");
		int n = Runtime.getRuntime().availableProcessors();
		System.out.println("availble processor="+n);
	}

}
