package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.practice.Person;

/**
 * @author malle
 *
 *this class used java8 features
 */
public class StreamAndLamda {
    
    public static Map<Long,Person> getPersonIdList(List<Person> people){
        //check with firstname equeals "Bob" then get person id
        List<Person> list= people.stream()
        .filter(p -> p != null)
        .collect(Collectors.toList());
        Stream<Person> stream=list.stream();
        List<Person> filter=stream.filter(p1->p1.firstName.equals("Bob")).collect(Collectors.toList());
        System.out.println("filter="+filter.size());
        
        return null;
        
    }
    public static List<Person>  getUpdateNames(List<Person> people){
        //check with firstname  "Bob",thomuas   return those value
    	List<Person> result=people.stream().filter(p->p!=null && (p.firstName.equals("Bob") || p.firstName.equals("Thoumas"))).collect(Collectors.toList());
    	System.out.println("result="+result.size());
        return result;
        
    }
    public static void getCleanNames(List<Person> people){
        //check with firstname update "Bob ->Bob",thomuas->roburt   update
    	
    	List<Person>  peopleList =  people.stream()
                .filter(emp -> emp!=null && emp.firstName.equalsIgnoreCase("Bob"))
                .peek(emp -> emp.firstName="Tom")
                .collect(Collectors.toList());
    	System.out.println("updated="+peopleList.size());
    	
    	peopleList=people.stream().map((emp)->{
    		if(emp!=null && emp.firstName.equals("Thoumas"))
    		{    			
    		emp.firstName="robert";
    		return emp;    		
    		}else{
			return emp;
    		}
    	}
    	).collect(Collectors.toList());
    	System.out.println("updated="+peopleList);		

}

    
    public static void getRemoveNames(List<Person> people){
        //check with firstname equeals "Bob" then remove that value
    	 Predicate<Person> condition = emp -> emp!=null && emp.firstName.equalsIgnoreCase("Jocky");  
    	 people.removeIf(condition);
    	System.out.println("removed="+people);
        
    }

    public static void main(String args[]){
        Person person=new Person(1,"Bob","Naveen");
        Person personTwo=new Person(2,"Bob","Steve");
        Person personThree=new Person(3,"Jocky","John");
        Person personFive=new Person(4,"Thoumas","vicky");
        Person personFour=null;
        List<Person> people=new ArrayList<Person>();
        people.add(person);
        people.add(personFour);
        people.add(personTwo);
        people.add(personThree);
        people.add(personFive);
        System.out.println("before clean=" +people);
        Map<Long,Person> mapList=getPersonIdList(people);
        System.out.println("maplist="+ mapList);
        List<Person> listPeople=getUpdateNames(people);
        System.out.println("after update="+listPeople);
        getCleanNames(people);
        System.out.println("remove1"+people);
        getRemoveNames(people);
    }
    

}
