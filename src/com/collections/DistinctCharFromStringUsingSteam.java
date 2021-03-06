package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctCharFromStringUsingSteam {
	
	public static void main(String args[]){
		
		List<String> test=Arrays.asList("Test","oneon","foo");
		
	
	List<String> te1=test.stream()
    .map(c -> c.split(""))
    .flatMap(Arrays::stream)
    .distinct()
    .collect(Collectors.toList());
	System.out.println(te1);
	
	
	}


}
