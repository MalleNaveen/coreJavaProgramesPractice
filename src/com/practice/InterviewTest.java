package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import com.sun.org.apache.xpath.internal.operations.UnaryOperation;

public class InterviewTest {

	private static final int Optional = 0;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String s="Hello";
		String s1=new String(s);
		String s3="Hello";
		//System.out.println(s1.equals(s));
		
		Set<Foo> t=new HashSet<Foo>();
		t.add(new Foo(1));
		t.add(new Foo(2));
		t.add(new Foo(6));
		System.out.println(t.size());
		
		/*try(FileReader ii=new FileReader(new File("test"))){
			
		}*/
		Comparator<String> comap=(country1,country2)->country1.compareTo(country2);
		String[] brics={"Brazil","Russia","India","China"};
		Arrays.sort(brics);
		//Arrays.stream(brics).forEach(a->System.out.println(a+""));
		
		IntFunction<UnaryOperator<Integer>> func=i->j->i*j;
		Integer apply=func.apply(10).apply(20);
		//Integer apply=func.apply(10,20);
		//System.out.println(apply);
		
		boolean result=Stream.of("re","rt","mi","do").filter(a->a.length()>5)
				.peek(System.out::println)
				.allMatch(str->str.length()>5);
		System.out.println(result);		
		
		List<String> arr=Arrays.asList("foo;bar;baz","","quas:noau");
		arr.stream().flatMap(a->Arrays.stream(a.split(";"))).forEach(str->System.out.print(str+":"));
	}
	
}
	class Foo{
		
		Integer i;
		Foo(Integer c){
			i=c;
			
		}
		
		public boolean equals(Integer c){
			return false;
			
		}
		
		public boolean equals(Object c){
			return true;
		}
			public int hashCode(){
				
				return 17;
			}
		}
	

