package com.threads;



public class MultiThread implements Runnable{
	
	
	
	public static void main(String args[]) throws InterruptedException{
		MultiThread mtd=new MultiThread();
		Thread thread=new Thread(mtd);
		Thread thread2=new Thread(mtd);
		Thread thread3=new Thread(mtd);
		thread.start();
		thread2.join();
		thread3.start();
		//thread.start();
		System.out.println(thread.getState());
	}
	
	public void add(){
		//System.out.println("test");
		for(int i=0;i<4;i++){
		System.out.println(i);
		}
	}
	
	public void sub(){
		System.out.println(1+8);
	}

	@Override
	public void run() {
		add();
		sub();
	}
}