package com.lamdastreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {

	public static void main(String[] args) {
		//map
		String[] arrayOfWords = {"naveen", "malle"};
		Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
		List<Stream<String>> strArr=streamOfWords.map(s->s.split("")) //Converting word in to array of letters
		    .map(Arrays::stream).distinct() //Make array in to separate stream
		    .collect(Collectors.toList());
		strArr.forEach(System.out::println);
		
		//flatmap
		//:: this is method ref
		String[] arrayOfWord = {"naveen", "malle"};
		Stream<String> streamOfWord = Arrays.stream(arrayOfWord);
		streamOfWord.map(s->s.split("")) //Converting word in to array of letters
		    .flatMap(Arrays::stream).distinct() //flattens each generated stream in to a single stream
		    .collect(Collectors.toList()).forEach(System.out::println);
	}

}
