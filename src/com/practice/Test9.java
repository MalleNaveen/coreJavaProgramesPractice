package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test9 {

	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 *  Java 8 features:
Lambda expressions,
Method references,
Functional interfaces,
Stream API,
Default methods,
Base64 Encode Decode,
Static methods in interface,
Optional class,
Collectors class,
ForEach() method,
Parallel array sorting,
Nashorn JavaScript Engine,
Parallel Array Sorting,
Type and Repating Annotations,
IO Enhancements,
Concurrency Enhancements,
JDBC Enhancements etc.
StringJoiner
		 * 
		 */
		 String[] words = new String[10];   
	        Optional<String> checkNull =  
	                      Optional.ofNullable(words[5]);   
	        if (checkNull.isPresent()) {   
	            String word = words[5].toLowerCase();   
	            System.out.print(word);   
	        } else  {
	            System.out.println("word is null");   
	    } 
		
		// Create a character array 
        char[] ch = { 'G', 'e', 'e', 'k', 's', 
                      'f', 'o', 'r', 
                      'G', 'e', 'e', 'k', 's' }; 
  
        // Convert the character array into String 
        // using Collectors.joining() method 
        String chString = Stream.of(ch) 
                              .map(arr -> new String(arr)) 
                              .collect(Collectors.joining()); 
        List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");

    	//java | python | nodejs | ruby
    	String result = list.stream().map(x -> x).collect(Collectors.joining(" | "));
    	System.out.println(result);
        StringJoiner sj = new StringJoiner(",");
        sj.add("aaa");
        sj.add("bbb");
        sj.add("ccc");
        String result2 = sj.toString(); //aaa,bbb,ccc
        System.out.println(result2);
      //2015-10-31
    	String result1 = String.join("-", "2015", "10", "31" );
    	  System.out.println(result1);
        // Print the concatenated String 
        System.out.println(chString); 
Boolean b1=new Boolean(true);
Boolean b2=new Boolean(false);
Boolean b3=new Boolean("false");
Boolean b4=new Boolean(b1);
System.out.println(b1.equals(b4));
System.out.println(b2==b3);
System.out.println(b1==b4);

Integer l=200;
Integer l2=200;
System.out.println(l.equals(l2));
System.out.println(l==l2);

//System.out.println(Class.forName("String").getName());
	}
	
	public static String concat(String a, String b){
		
		 String[] words = new String[10];   
	        Optional<String> checkNull =  
	                      Optional.ofNullable(words[5]);   
	        if (checkNull.isPresent()) {   
	            String word = words[5].toLowerCase();   
	            System.out.print(word);   
	        } else  {
	            System.out.println("word is null");   
	    } 
		return "test";
		
	}

}
