package com.programcreek.java8.trick;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatStream {

	public static void main(String[] args) {
		method4();
	}

	private static void method1() {
		String[] arr1 = { "a", "b", "c", "d" };
		String[] arr2 = { "e", "f", "g" };
		Stream<String> stream1 = Stream.of(arr1);
		Stream<String> stream2 = Stream.of(arr2);

		Stream<String> stream3 = Stream.concat(stream1, stream2);
		String[] arr = stream3.toArray(String[]::new);
		System.out.println(Arrays.toString(arr));
	}

	private static void method3() {
		String[] arr1 = { "a", "b", "c", "d" };
		String[] arr2 = { "e", "f", "g" };
		String[] arr3 = { "h", "i", "j" };
		Stream<String> stream1 = Stream.of(arr1);
		Stream<String> stream2 = Stream.of(arr2);
		Stream<String> stream3 = Stream.of(arr3);

		Stream<String> stream = Stream.concat(Stream.concat(stream2, stream1),
				stream3);
		// Stream<String> stream = Stream.concat(stream1, Stream.concat(stream3,
		// stream2));
		String[] arr = stream.toArray(String[]::new);
		System.out.println(Arrays.toString(arr));
	}

	private static void method4() {
		String[] arr1 = { "a", "b", "c", "d" };
		String[] arr2 = { "e", "f", "g" };
		String[] arr3 = { "h", "i", "j" };
		Stream<String> stream1 = Stream.of(arr1);
		Stream<String> stream2 = Stream.of(arr2);
		Stream<String> stream3 = Stream.of(arr3);

		// use Stream.of(T... values)
		Stream<String> stream = Stream.of(stream1, stream2, stream3).flatMap(
				x -> x);

		String[] arr = stream.toArray(String[]::new);
		System.out.println(Arrays.toString(arr));
	}

	private static void method2() {
		String[] arr1 = { "abc", "bcd", "cdef", "defgh" };
		String[] arr2 = { "af", "fg", "gh" };
		Stream<String> stream1 = Stream.of(arr1);
		Stream<String> stream2 = Stream.of(arr2);

		Stream<String> stream3 = Stream.concat(
				stream1.filter(x -> x.length() < 4), stream2);
		String[] arr = stream3.toArray(String[]::new);
		System.out.println(Arrays.toString(arr));
	}

}
