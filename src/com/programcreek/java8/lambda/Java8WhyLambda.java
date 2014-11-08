package com.programcreek.java8.lambda;

import java.util.stream.Stream;

public class Java8WhyLambda {

	public static void main(String[] args) {
		// create an array of dogs
		Dog d1 = new Dog("Max", 2, 50);
		Dog d2 = new Dog("Rocky", 1, 30);
		Dog d3 = new Dog("Bear", 3, 40);
		Dog[] dogArray = { d1, d2, d3 };

		// use stream to sort
		Stream<Dog> dogStream = Stream.of(dogArray);
		Stream<Dog> sortedDogStream = dogStream.sorted((Dog m, Dog n) -> Integer.compare(m.getHeight(), n.getHeight()));

		sortedDogStream.forEach(d -> System.out.print(d));
	}
}
