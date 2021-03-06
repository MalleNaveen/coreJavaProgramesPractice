package com.lamdastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lamdapractise {
	
	
	
	public static void main(String args[]){
		
		//lamda samples
		
		List<String> listStr=new ArrayList<String>();
		listStr.add("jpa");
		listStr.add("spring");
		//adding two numbers apply menthod
		BinaryOperator<Integer> add= (a,b)-> a*b;
        
         System.out.println(add.apply(1, 2));
		
         //Test the value Even number or not using Test method
         
         Predicate<Integer> evenNumOrNot=a->a%2==0;
         
         System.out.println(evenNumOrNot.test(5));
         
         //print the passed value using consumer accept method
         Consumer<String> printVal=a->System.out.println(a);
         printVal.accept("Naveen");
         
         //get the value from list using supplier get method
         Supplier<String> supplier=()-> listStr.get(0);
         System.out.println(supplier.get());
	}

	
	
	
	
	
}
