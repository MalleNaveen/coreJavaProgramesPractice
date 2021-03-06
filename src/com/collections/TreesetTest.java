package com.collections;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetTest {
	
	public static void main(String args[]){
	
		SortedSet<Emp> test=new TreeSet<Emp>();
		Emp e=new Emp(1,"test");
		Emp e2=new Emp(2,"test2");
		test.add(e2);
		test.add(e);
		System.out.println(test.size());
	}

}
