package com.threads;

class Mytask extends Thread{
	@Override
	public void run(){
		for(int i=0;i<4;i++){
		System.out.println("Mytask="+i);
	}
	}
	
}

class Mytask2 implements Runnable{
	@Override
	public void run(){
		for(int i=0;i<3;i++){
		System.out.println("Mytask2="+i);
	}
	}
	
}
public class ThreadUsesAndPractice {

	public static void main(String[] args) {

		System.out.println("main entry");
		Mytask task=new Mytask();//child thread
		task.start();
		for(int i=0;i<10;i++){
		System.out.println("main task="+i);
		}
		/*Runnable task2=new Mytask2();
		Thread t2=new Thread(task2);
		t2.start();*/
		new Thread(new Mytask()).start();
		System.out.println("Task completed");
	}

}
