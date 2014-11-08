package com.programcreek.java8.lambda;

import java.util.Arrays;
import java.util.stream.Stream;

public class Java8LambdaSyntax {

	public static void main(String[] args) {
		String[] arr = { "program", "creek", "is", "a", "java", "site" };
		Arrays.sort(arr, (m, n) -> Integer.compare(m.length(), n.length()));
		System.out.println(Arrays.toString(arr));

		Stream<String> stream = Stream.of(arr);
		stream.forEach(System.out::println);

	}

}
