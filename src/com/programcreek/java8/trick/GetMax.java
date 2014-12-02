package com.programcreek.java8.trick;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GetMax {

	public static void main(String[] args) {
		m4();
	}

	public static void m1() {
		IntStream stream = IntStream.of(2, 4, 6, 1, 5, 9);
		int max = stream.max().getAsInt();

		System.out.println(max);

	}

	public static void m2() {
		IntStream stream = IntStream.of(2, 4, 6, 1, 5, 9);
		int max = stream.reduce(Math::max).getAsInt();
		System.out.println(max);

	}
	
	public static void m3() {
		IntStream stream = IntStream.of(2, 4, 6, 1, 5, 9);
		int max = stream.reduce(0, Math::max);
		System.out.println(max);
	}
	
	public static void m4() {
		Stream<String> stream = Stream.of("abcd", "abcdef", "ab");
		IntStream intStream = stream.map(s -> s.length()).mapToInt(Integer::new);
		int max = intStream.reduce(0, Math::max);
		System.out.println(max);
	}
}
