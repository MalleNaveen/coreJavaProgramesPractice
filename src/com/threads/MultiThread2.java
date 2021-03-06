package com.threads;



/**
* Example of producer and consumer - all in the same class for convienence purpose only.
**/
public class MultiThread2 {
	
  /** This is the shared counter object that will be used between producer and consumer **/
	private static class Counter {
		private int count = 0;

		public int getCount() {
			return count;
		}

		public void incrementCount() {
			this.count++;
		}
		
		
	}
  
	private static Counter counter = new Counter();
	
  /** Producer that implements Runnable which updates the counter **/
	private static class Producer implements Runnable {
		@Override
		public void run() {
			
			while(true) {
				synchronized(counter) {
					counter.incrementCount();
					if(counter.getCount()==4){
						break;
					}
					System.out.println(" Incrementing count "+ counter.getCount());
					counter.notifyAll();
					try {
						counter.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		
	}
  /** Consumer that waits to get the latest value of the counter **/
	private static class Consumer implements Runnable {

		@Override
		public void run() {
			while(true) {
				synchronized(counter) {
					System.out.println(" Reading count " + counter.getCount());
					if(counter.getCount()==4){
						break;
					}
					counter.notifyAll();
					try {
						counter.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		Thread producerThread = new Thread(new Producer());
		Thread consumerThread = new Thread(new Consumer());
		Thread producerThread2 = new Thread(new Producer());
		Thread consumerThread2 = new Thread(new Consumer());
		
		try {
			producerThread.start();
			consumerThread.start();
			producerThread2.start();
			consumerThread2.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}