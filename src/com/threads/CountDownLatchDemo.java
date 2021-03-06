package com.threads;

//Java Program to demonstrate how 
//to use CountDownLatch, Its used 
//when a thread needs to wait for other 
//threads before starting its work. 
import java.util.concurrent.CountDownLatch; 

public class CountDownLatchDemo 
{ 
	public static void main(String args[]) 
				throws InterruptedException 
	{ 
		// Let us create task that is going to 
		// wait for four threads before it starts 
		CountDownLatch latch = new CountDownLatch(4); 

		// Let us create four WorkerTwo 
		// threads and start them. 
		WorkerTwo first = new WorkerTwo(1000, latch, 
								"WorkerTwo-1"); 
		WorkerTwo second = new WorkerTwo(2000, latch, 
								"WorkerTwo-2"); 
		WorkerTwo third = new WorkerTwo(3000, latch, 
								"WorkerTwo-3"); 
		WorkerTwo fourth = new WorkerTwo(4000, latch, 
								"WorkerTwo-4"); 
		first.start(); 
		second.start(); 
		third.start(); 
		fourth.start(); 

		// The main task waits for four threads 
		latch.await(); 

		// Main thread has started 
		System.out.println(Thread.currentThread().getName() + 
						" has finished"); 
	} 
} 

//A class to represent threads for which 
//the main thread waits. 
class WorkerTwo extends Thread 
{ 
	private int delay; 
	private CountDownLatch latch; 

	public WorkerTwo(int delay, CountDownLatch latch, 
									String name) 
	{ 
		super(name); 
		this.delay = delay; 
		this.latch = latch; 
	} 

	@Override
	public void run() 
	{ 
		try
		{ 
			Thread.sleep(delay); 
			latch.countDown(); 
			System.out.println(Thread.currentThread().getName() 
							+ " finished"); 
		} 
		catch (InterruptedException e) 
		{ 
			e.printStackTrace(); 
		} 
	} 
} 

