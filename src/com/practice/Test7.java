package com.practice;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test7  implements Serializable{
	
	public static void main(String args[]){
		
		//how to itentify duplicate values
		//why singleton is default scope in spring --> stateless and threadsafe
		//activator uses in spring boot --> health check logs 9Spring Boot provides actuator to monitor and manage our application
		//how to change port number in srping boot  --application.properties //src/main/resources
		//how to resolve transient dependency in jboss
		//You need to run mvn install for B, to install the package into  .m2 which can be picked up by A locally.

		//Then running mvn dependency:tree -Dverbose in A won't cause problem
		//how to add/remove already exisiting jar in maven
		//n+1 problem in hibernate  --> one to many relation ship 
		//excutor vs thread conecept difference - larger application u can use excutor
		//how to create custom marker interface
		 Integer[] numbers = new Integer[] { 1, 2, 1, 2, 1, 3 };
		    List<Integer> listInteger = Arrays.asList(numbers);
		    for (int i :listInteger){
		    	System.out.println(Collections.frequency(listInteger, i));
		    }
		    
		    listInteger.stream().filter(i -> Collections.frequency(listInteger, i) >1).collect(Collectors.toSet()).forEach(System.out::println);
		
	}

}
