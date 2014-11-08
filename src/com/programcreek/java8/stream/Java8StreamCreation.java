package com.programcreek.java8.stream;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Java8StreamCreation {

	public static void main(String[] args) {
		Stream<String> stream = null;

		// from array
		String[] arr = { "program", "creek", "program", "creek", "java", "web",
				"program" };
		stream = Stream.of(arr);

		stream = Stream.of("program", "creek", "program", "creek", "java",
				"web", "program");

		// from collection
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("php");
		list.add("python");
		stream = list.stream();

		// generate()
		stream = Stream.generate(() -> "test").limit(10);

		String[] strArr = stream.toArray(String[]::new);
		System.out.println(Arrays.toString(strArr));

		Stream<Double> integerStream = Stream.generate(Math::random).limit(10);
		// it doesn't make any sense to make an infinite stream, we normally
		// limit it to a value

		Double[] doubleArr = integerStream.toArray(Double[]::new);
		System.out.println(Arrays.toString(doubleArr));

		// how to get 20 random number range from 0 - 10?

		// iterate()
		Stream<BigInteger> bigIntStream = Stream.iterate(BigInteger.ZERO,
				n -> n.add(BigInteger.ONE)).limit(10);
		BigInteger[] bigIntArr = bigIntStream.toArray(BigInteger[]::new);
		System.out.println(Arrays.toString(bigIntArr));

		// stream method from APIs
		String sentence = "Program creek is a Java site.";
		Stream<String> wordStream = Pattern.compile("\\W").splitAsStream(
				sentence);
		String[] wordArr = wordStream.toArray(String[]::new);
		System.out.println(Arrays.toString(wordArr));

	}

}
