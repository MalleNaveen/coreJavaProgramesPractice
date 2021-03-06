package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test15 {

	private int i=10;
	public static void main(String[] args) {
		Test15 Test15=new Test15();
		Test15.addTest();
		
		 int i = 1, n = 10, t1 = 0, t2 = 1;
	        System.out.print("First " + n + " terms: ");
	        while (i <= n)
	        {
	            System.out.print(t1 + " + ");
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	            i++;
	        }
	}
	public void addTest(){
		int i=40;
		
		System.out.println("instance variable="+this.i);
		System.out.println("local variable="+i);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(7);
		list.add(8);
		Integer a=(int) list.stream().count();
		System.out.println(a);
		
		 List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	        int sum = integers.stream().reduce(0, (val1,valu2)->val1%valu2);
	        System.out.println("Total1 : " + sum);
	        
	      

	        Stream<Integer> integers2 = Stream.iterate(1, n -> n + 1).limit(10);
	        IntStream intStream = integers2.mapToInt(x -> x);
	        int sum1 = intStream.sum();
	        System.out.println("Total : " + sum1);
	}

}
