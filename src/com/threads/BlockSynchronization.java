package com.threads;



import java.io.*; 
import java.util.*; 

/*
 * When a thread enters into synchronized method or block, it acquires lock and once it completes its task and exits from the synchronized method, it releases the lock.
When thread enters into synchronized instance method or block, it acquires Object level lock and when it enters into synchronized static method or block it acquires class level lock.
Java synchronization will throw null pointer exception if Object used in synchronized block is null. For example, If in synchronized(instance) , instance is null then it will throw null pointer exception.
In Java, wait(), notify() and notifyAll() are the important methods that are used in synchronization.
You can not apply java synchronized keyword with the variables.
Don’t synchronize on the non-final field on synchronized block because the reference to the non-final field may change anytime and then different threads might synchronize on different objects i.e. no synchronization at all.
 */
 class Geek 
{ 
	String name = ""; 
	public int count = 0; 

	public void geekName(String geek, List<String> list) 
	{ 
		// Only one thread is permitted 
		// to change geek's name at a time. 
		synchronized(this) 
		{ 
			name = geek; 
			count++; // how many threads change geek's name. 
		} 

		// All other threads are permitted 
		// to add geek name into list. 
		list.add(geek); 
	} 
} 

public class BlockSynchronization 
{ 
	public static void main (String[] args) 
	{ 
		Geek gk = new Geek(); 
		List<String> list = new ArrayList<String>(); 
		gk.geekName("mohit", list); 
		gk.geekName("naveen", list);
		System.out.println(gk.name); 

	} 
} 
