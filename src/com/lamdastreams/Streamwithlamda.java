package com.lamdastreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.practice.Person;

public class Streamwithlamda {
	


	public static void main(String args[]){		
	        List<Person> people=Arrays.asList(
	        		new Person(1,"Bob","Naveen"),new Person(2,"Bob","Steve"),new Person(3,"Jocky","John"),
	        		new Person(4,"Thoumas","vicky")
	        		);
	        
	    	//check with first name equals "Bob" then remove that value
	        
	       people.stream().filter(p->!p.firstName.equals("Bob")).forEach(System.out::println);
	        
	       System.out.println();
	       
	       
//check with firstname  "Bob",thoumas   return those value
	       
	       System.out.println("check bob and thomas names ==========");
	       people.stream().filter(p->p.firstName.equals("Bob") || p.firstName.equals("Thoumas") ).forEach(System.out::println);

	    	//check with firstname equeals "Bob" then get person id
	       System.out.println();
	       System.out.println("check bob then get personal ID ==========");
	       
	       people.stream().filter(p->p.firstName.equals("Bob") ).forEach(p->System.out.println(p.personId));
   
	    	//check with firstname update "Bob ->Bob",thomuas->roburt   update
	       System.out.println();
	       System.out.println("check bob and thomas then update values ==========");
	       people.stream().map( emp->{
	    		if(emp.firstName.equals("Thoumas"))
	    		{    			
	    		emp.firstName="robert";	    		   		
	    		}
	    		else if(emp.firstName.equals("Bob")){
	    		emp.firstName="Tom";
		    	
	    		}
	    		return emp;
	       }).forEach(System.out::println);
	       
	       
	    	
	}
}
