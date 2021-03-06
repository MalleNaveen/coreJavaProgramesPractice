package com.lamdastreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortObjectsUsingStreams {

	static List<User> users = Arrays.asList(
            new User("C", 30),
            new User("D", 40),
            new User("A", 10),
            new User("B", 20),
            new User("E", 50));
	public static void main(String args[]){
		getStringArrayListSort();
		getUserObjectArrayListSort();
	}
	
	public static void getStringArrayListSort(){
		List<String> list = Arrays.asList("3","6","1","4");
		//asending order is default
		 System.out.println("Asecnding order");
List<String> sortedList = list.stream().sorted().collect(Collectors.toList());        
        sortedList.forEach(System.out::println);
        
        System.out.println("decending order");
        //displaying desencding order
        List<String> sortedListDesc = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());        
        sortedListDesc.forEach(System.out::println);
	}
	public static void getUserObjectArrayListSort(){
		
		//asending order is default
		System.out.println("asending order is default");
		List<User> sortedList = users.stream()
	            .sorted(Comparator.comparingInt(User::getAge))
	            .collect(Collectors.toList());
	 
	        sortedList.forEach(System.out::println);
	        
	        //Decending order
	        System.out.println("Decending order is ");
	        List<User> sortedListDesc = users.stream()
	                .sorted(Comparator.comparingInt(User::getAge)
	                .reversed())
	                .collect(Collectors.toList());

	        sortedListDesc.forEach(System.out::println);
	        
	        //by name
	        
	        List<User> sortedListnName = users.stream()
	                .sorted(Comparator.comparing(User::getName))
	                .collect(Collectors.toList());
	        sortedListnName.forEach(System.out::println);
	        
	        //by name desc
	        
	        List<User> sortedListnNameDesc = users.stream()
	                .sorted(Comparator.comparing(User::getName).reversed())
	                .collect(Collectors.toList());
	        sortedListnNameDesc.forEach(System.out::println);
	}
}
