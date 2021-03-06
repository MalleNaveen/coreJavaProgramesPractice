package com.threads;


//Java program to illustrate 
//ThreadPool 
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors; 

//TaskOne class to be executed (Step 1) 
class TaskOne implements Runnable 
{ 
	private String name; 
	
	public TaskOne(String s) 
	{ 
		name = s; 
	} 
	
	// Prints TaskOne name and sleeps for 1s 
	// This Whole process is repeated 5 times 
	public void run() 
	{ 
		try
		{ 
			for (int i = 0; i<=5; i++) 
			{ 
				if (i==0) 
				{ 
					Date d = new Date(); 
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); 
					System.out.println("Initialization Time for"
							+ " TaskOne name - "+ name +" = " +ft.format(d)); 
					//prints the initialization time for every TaskOne 
				} 
				else
				{ 
					Date d = new Date(); 
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss"); 
					System.out.println("Executing Time for TaskOne name - "+ 
							name +" = " +ft.format(d)); 
					// prints the execution time for every TaskOne 
				} 
				Thread.sleep(1000); 
			} 
			System.out.println(name+" complete"); 
		} 
		
		catch(InterruptedException e) 
		{ 
			e.printStackTrace(); 
		} 
	} 
} 
public class ThreadPoolExample 
{ 
	/*
	 * 1. Create a TaskOne(Runnable Object) to execute
2. Create Executor Pool using Executors
3. Pass TaskOnes to Executor Pool
4. Shutdown the Executor Pool
	 */
	// Maximum number of threads in thread pool 
	static final int MAX_T = 3;			 

	public static void main(String[] args) 
	{ 
		// creates five TaskOnes 
		Runnable r1 = new TaskOne("TaskOne 1"); 
		Runnable r2 = new TaskOne("TaskOne 2"); 
		Runnable r3 = new TaskOne("TaskOne 3"); 
		Runnable r4 = new TaskOne("TaskOne 4"); 
		Runnable r5 = new TaskOne("TaskOne 5");	 
		
		// creates a thread pool with MAX_T no. of 
		// threads as the fixed pool size(Step 2) 
		ExecutorService pool = Executors.newFixedThreadPool(MAX_T); 
		
		// passes the TaskOne objects to the pool to execute (Step 3) 
		pool.execute(r1); 
		pool.execute(r2); 
		pool.execute(r3); 
		pool.execute(r4); 
		pool.execute(r5); 
		
		// pool shutdown ( Step 4) 
		pool.shutdown();	 
	} 
} 
