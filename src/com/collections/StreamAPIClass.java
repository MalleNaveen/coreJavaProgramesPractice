package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIClass {
	public static void main(String[] args) {
		
		List<String> arr=new ArrayList<String>();
		arr.add("test");
		arr.add("naveen");
		arr.add("test2");

		Map<String,String> map=new HashMap<String,String>(); 
		map.put("test8899999", "test2");
		map.put("test3", "test4");
		StreamAPIClass streamAPIClass=new StreamAPIClass();
		streamAPIClass.practiceStreamApi(arr);
	}
	
	public void practiceStreamApi(List<String> arr){
		
		Stream<String> strApi=arr.stream();
		strApi.filter(str->str.equals("test")&& str.length() < 8).filter(str->str.equals("test")&& str.length() < 8).forEach(System.out::println);
				//.collect(Collectors.toList());
		///System.out.println(strArr);
	}

	
}
