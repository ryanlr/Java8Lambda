package com.programcreek.java8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;

//motivational example to use java 8 Stream
public class Java8Counter {
	public static void main(String[] args) {
		String[] arr = {"program", "creek", "program", "creek", "java", "web", "program"};
		Stream<String> stream = Stream.of(arr).parallel();
		Map<String, Long> counter = stream.collect(Collectors.groupingBy(String::toString, Collectors.counting()));
		System.out.println(counter.get("creek"));
	}
}
