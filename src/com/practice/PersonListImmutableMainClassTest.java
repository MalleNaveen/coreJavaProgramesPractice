package com.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonListImmutableMainClassTest {
	public static void main(String args[]) {
		CreatingImmutablePerson p1=new CreatingImmutablePerson(1, "malle");
		CreatingImmutablePerson p2=new CreatingImmutablePerson(2, "naveen");
		List<CreatingImmutablePerson> plist=new ArrayList<CreatingImmutablePerson>();
		plist.add(p1);
		plist.add(p2);
		PersonListImmutableMainClassTest m=new PersonListImmutableMainClassTest();
		                     
		List<CreatingImmutablePerson> evenList=m.getPersonList(plist);
		
		
		
		
	}

	
	public  List<CreatingImmutablePerson> getPersonList(List<CreatingImmutablePerson> plist){			
		return  new ImuttablePersonList(plist).getPersons();
	
	}

}
