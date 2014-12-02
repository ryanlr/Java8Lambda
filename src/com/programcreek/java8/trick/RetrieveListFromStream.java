package com.programcreek.java8.trick;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

public class RetrieveListFromStream {
	public static void main(String[] args) {
		method2();
	}

	private static void method1() {
		String[] arr = { "ab", "bcd", "cdef", "defgh", "efhik", "fghijk",	"ghijkl" };
		Stream<String> stream = Stream.of(arr);
		
		//ArrayList<String> list = stream.filter(x -> x.length() < 5).collect(Collectors.toCollection(ArrayList::new));
		ArrayList<String> list = (ArrayList) stream.filter(x -> x.length()<5).collect(Collectors.toList());
		
		System.out.println(list);
	}
	
	private static void method2() {
String[] arr = { "ab", "bcd", "cdef", "defgh", "efhik", "fghijk",	"ghijkl" };
Stream<String> stream = Stream.of(arr).parallel();

ArrayList<String> list = new ArrayList<String>();
stream.forEachOrdered(list::add);
		
		System.out.println(list);
	}
}
