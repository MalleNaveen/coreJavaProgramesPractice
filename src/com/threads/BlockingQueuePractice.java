package com.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BlockingQueuePractice {

	public static void main(String[] args) throws InterruptedException {
//blocking Queue is used for producer and consumer problems an it doesn't accept null values.
		/*
		 * The SynchronousQueue is a queue that can only contain a single element internally. A thread inseting an element into the queue is blocked until 
		 * another thread takes that element from the queue. Likewise, 
		 * if a thread tries to take an element and no element is currently present, that thread is blocked until a thread insert an element into the queue.
		 */
		ArrayBlockingQueue<String> abq=new ArrayBlockingQueue<String>(1);
		abq.add(null);
		BlockingQueue queue6   = new PriorityBlockingQueue();

	    //String implements java.lang.Comparable
	    queue6.put("Value");

	    String value = (String) queue6.take();
		System.out.println(abq.poll());
		LinkedBlockingDeque<Integer> lbq=new LinkedBlockingDeque<Integer>();
		lbq.add(12);

	        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

	        new Thread(new ProducerTwo(queue)).start();
	        new Thread(new ConsumerTwo(queue)).start();
	}

}
