package com.collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciStream {

	public static void main(String[] args) {
		 /*List<Integer> fibonacci = getFibonacci(10);
	        fibonacci.forEach(x -> System.out.println(x));*/
	        
	        Stream.iterate(new long[]{ 1, 1 }, p->new long[]{ p[1], p[0]+p[1] })
	        .limit(10).forEach(p->System.out.println(p[0]));
	}
	
	 public static List<Integer> getFibonacci(int series) {
		 
		 
		 
		 
	        return Stream.iterate(new int[]{0, 1}, t -> new int[]{ t[1], t[0] + t[1] })
	                .limit(series)
	                .map(n -> n[0])
	                .collect(Collectors.toList());
	    }

	   

}
