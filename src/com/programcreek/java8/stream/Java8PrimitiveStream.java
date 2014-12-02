package com.programcreek.java8.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8PrimitiveStream {
	public static void main(String[] args) {
		IntStream stream = IntStream.of(2, 4, 6, 1, 5, 9);
		IntSummaryStatistics iss = stream.summaryStatistics();
		double average = iss.getAverage();
		long count = iss.getCount();
		int max = iss.getMax();
		int min = iss.getMin();
		long sum = iss.getSum();
	}

	public static void basicMethod() {
		IntStream stream = IntStream.of(2, 4, 6, 1, 5, 9);
		int max1 = stream.max().getAsInt();
		int min1 = stream.min().getAsInt();
		double average = stream.average().getAsDouble();
		IntStream distinctStream = stream.distinct();
	}

	public static void createFromStream() {
		Stream<String> stream = Stream.of("abcd", "abcdef", "ab");
		IntStream intStream = stream.map(s -> s.length())
				.mapToInt(Integer::new);

		int max2 = intStream.reduce(0, Math::max);
		System.out.println(max2);

	}
}
