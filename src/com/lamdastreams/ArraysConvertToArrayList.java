package com.lamdastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysConvertToArrayList {
	
	public static void main(String args[]){
		
		int[] arr=new int[]{1,2,3,4,6,5};
		convertArrayToArrayList(arr);
		
	}

	
	public static void convertArrayToArrayList(int[] arr){
		//Arrays.asList("Strings"); only string can convert but integer not
		List<Integer> list =Arrays.stream(arr).boxed().collect(Collectors.toList());
		list.stream().forEach(System.out::println);
		// convert array string to List
		
		String[] strArr=new String[]{"test","test2","test3"};
		List<String> listTwo=Arrays.asList(strArr);
		listTwo.forEach(System.out::println);
	}
}
 