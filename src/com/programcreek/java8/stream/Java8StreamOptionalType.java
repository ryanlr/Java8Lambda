package com.programcreek.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Java8StreamOptionalType {

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

		Stream<Integer> lengthStream = wordStream.map(s -> s.length());
		Optional<Integer> sum = lengthStream.reduce((x, y) -> x + y);
		sum.orElse(0);

	}


}
