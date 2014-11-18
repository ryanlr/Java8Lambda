package com.programcreek.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Java8StreamReduction {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("php");
		list.add("python");
		list.add("perl");
		list.add("c");
		list.add("lisp");
		list.add("c#");
		Stream<String> wordStream = list.stream();

		/*int s = wordStream.reduce(0, (x, y) -> x + y.length(), (x, y) -> x + y);
		System.out.println(s);*/
		
	
  Stream<Integer> lengthStream = wordStream.map(s -> s.length());
  int sum = lengthStream.reduce(0, (x, y) -> x + y);
  System.out.println(sum);
		 

		// double d =
		// lengthStream.mapToInt(Integer::new).average().getAsDouble();
		// System.out.println(d);
	}

}
