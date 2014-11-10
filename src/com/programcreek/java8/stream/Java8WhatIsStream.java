package com.programcreek.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class Java8WhatIsStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A sequence of elements supporting sequential and parallel aggregate
		// operations. The following example illustrates an aggregate operation
		// using Stream and IntStream:

		// int sum = widgets.stream().filter(w -> w.getColor() == RED)
		// .mapToInt(w -> w.getWeight()).sum();

		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("php");
		list.add("python");

		list.stream()
				.filter(s -> s.length() > 2)
				.map(String::toUpperCase)
				.sorted()
				.forEach(System.out::println);

	}

}
