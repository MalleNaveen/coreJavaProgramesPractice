package com.lamdastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.practice.CreatingImmutablePerson;
import com.practice.PersonListImmutableMainClassTest;

public class PrintEvenNumberObjectUsingLamda {
	
	public static void  main(String args[]){
		CreatingImmutablePerson p1=new CreatingImmutablePerson(1, "malle");
		CreatingImmutablePerson p2=new CreatingImmutablePerson(2, "naveen");
		List<CreatingImmutablePerson> plist=new ArrayList<CreatingImmutablePerson>();
		plist.add(p1);
		plist.add(p2);
		PersonListImmutableMainClassTest printEvenList=new PersonListImmutableMainClassTest();
		List<CreatingImmutablePerson> pList =printEvenList.getPersonList(plist);
		
		
		//using streams printing even number matched persons
		pList.stream().filter(p->p.getpId()/2==0).collect(Collectors.toList()).forEach(p-> System.out.print(p.getPname()));
		
	}

}
