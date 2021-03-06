package com.threads;

import java.util.Queue;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public   class ConcorrentCollectons {
	public static void main(String args[]){
		
		Vector<String> v=new Vector<String>();
		v.add("test");
		CopyOnWriteArrayList<String> copyList=new CopyOnWriteArrayList<String>();
		copyList.add("test");
		
		CopyOnWriteArraySet<String> cpww=new CopyOnWriteArraySet<String>();
		cpww.add("test");
		
		ConcurrentSkipListSet<String> scon=new ConcurrentSkipListSet<String>();
		scon.add("test");
		
		ConcurrentHashMap<String, Long> cm=new ConcurrentHashMap<String, Long>();
		cm.put("test", 2l);
		
		ConcurrentLinkedDeque<String> cl=new ConcurrentLinkedDeque<String>();
		cl.push("test");
		
		ConcurrentLinkedQueue<String> conld=new ConcurrentLinkedQueue<String>();
		conld.add("test");
		
		ConcurrentSkipListMap<String, Long> cmp=new ConcurrentSkipListMap<String, Long>();
		cmp.put("test", 2l);
		
		Queue<String> queue = new ConcurrentLinkedQueue<String>();
		
	}

}
