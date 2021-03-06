package com.lamdastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class School {
	private List<Student> students;

	public List<Student> createStudents() {		
		students=new ArrayList<Student>();		
		Student student1=new Student("Rohit", Arrays.asList("English", "Science", "History"));
		Student student2=new Student("Rahul", Arrays.asList("English", "Science", "Mathematics"));
		students.add(student1);
		students.add(student2);
		return students;
	}
	

}
