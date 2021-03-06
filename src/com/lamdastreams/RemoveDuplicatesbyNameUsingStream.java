package com.lamdastreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RemoveDuplicatesbyNameUsingStream {
	static List<Person> persons = Arrays.asList(
            new Person("A", 30),
            new Person("A", 40),
            new Person("A", 10),
            new Person("B", 20),
            new Person("E", 50));
	
	public static void main(String[] args){
		Set<String> set = new HashSet<>();
		System.out.println("using hash set=");
		persons.stream().filter(p -> set.add(p.getName())).collect(Collectors.toList()).forEach(System.out::println);;
	System.out.println("Using tree set=");
		persons.stream().collect(Collectors.toCollection(()->new TreeSet<>(Comparator.comparing(Person::getName)))).stream().collect(Collectors.toList()).forEach(System.out::println);;
		
		
		//Get distinct objects by key
		System.out.println("using distinctByKey=");
         persons.stream()
                    .filter( distinctByKey(p -> p.getName()) )
                    .collect( Collectors.toList() ).forEach(System.out::println);
 
        // Let's verify distinct elements
        //System.out.println( distinctElements );
	}
	public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) 
	{
	    Map<Object, Boolean> map = new ConcurrentHashMap<>();
	    return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
	}
}
