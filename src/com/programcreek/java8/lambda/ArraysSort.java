package com.programcreek.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;


public class ArraysSort {

	public static void main(String[] args) {
		Dog d1 = new Dog("Max", 2, 50);
		Dog d2 = new Dog("Rocky", 1, 30);
		Dog d3 = new Dog("Bear", 3, 40);

		Dog[] dogArray = { d1, d2, d3 };
		printDogs(dogArray);

		Arrays.sort(dogArray, new Comparator<Dog>() {
			@Override
			public int compare(Dog o1, Dog o2) {
				return o1.height - o2.height;
			}
		});
		printDogs(dogArray);

		//one line of lambda
		Arrays.sort(dogArray, (m, n) -> Integer.compare(m.getWeight(), n.getWeight()));
		printDogs(dogArray);
	}

	public static void printDogs(Dog[] dogs) {
		System.out.println("--Dog List--");

		for (Dog d : dogs)
			System.out.print(d);

		System.out.println();
	}
}