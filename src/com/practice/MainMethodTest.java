package com.practice;

public class MainMethodTest {

	/*different main method signatures 
	 * 1. main(String[] args)
	 * 2. main (String arfs[])
	 * 3.main(String  ...args)
	 * 4.main(String...  args)
	 * 
	 * */
	public  static void main(String... args) {
System.out.println("Main Test");
//only final alowed not static 
 boolean[] b1=new boolean[5];
System.out.println(b1[1]);
	}

}
