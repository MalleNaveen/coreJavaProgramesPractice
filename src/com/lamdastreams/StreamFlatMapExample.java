package com.lamdastreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapExample {

	public static void main(String args[]) {
		
		School school=new School();
		
		StreamFlatMapExample useCases=new StreamFlatMapExample();
		System.out.println("History subject="+useCases.findStudentNameWithHistorySubject(school.createStudents()));
		
		System.out.println("all unique subjects="+useCases.findSubjects(school.createStudents()));
	}

	public List<String> findStudentNameWithHistorySubject(List<Student> students) {

		List<Student> list=students.stream().filter(student->student.getSubjects().contains("History")).collect(Collectors.toList());
		List<String> historyStudents=new ArrayList<String>();
		for(Student s:list) {
			historyStudents.add(s.getName());
		}
		return historyStudents;
	}
// flat map example with list<list<String> and strea of array
	public List<String> findSubjects(List<Student> students) {

		List<String> allSubj=students.stream().flatMap(s->Stream.of(s.getSubjects())).flatMap(Collection::stream).collect(Collectors.toList());
		
		return allSubj.stream().distinct().collect(Collectors.toList());
	}

}
