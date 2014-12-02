package com.programcreek.java8.trick;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertStreamToArray {

	/*
	 * There is a overloaded version of toArray() method for Stream objects.
	 * toArray(IntFunction<A[]> generator) Returns an array containing the
	 * elements of this stream, using the provided generator function to
	 * allocate the returned array, as well as any additional arrays that might
	 * be required for a partitioned execution or for resizing.
	 */
	public static void main(String[] args) {
		way2();

	}

	public static void way1() {
		String[] stringArr = { "a", "b", "c", "d" };
		Stream<String> stream = Stream.of(stringArr);
		String[] arr = stream.toArray(size -> new String[size]);
		System.out.println(Arrays.toString(arr));
	}

	public static void way2() {
		String[] stringArr = { "a", "b", "c", "d" };
		Stream<String> stream = Stream.of(stringArr);
		String[] arr = stream.toArray(String[]::new);
		System.out.println(Arrays.toString(arr));
	}
}
