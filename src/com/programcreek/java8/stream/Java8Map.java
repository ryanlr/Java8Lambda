package com.programcreek.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Java8Map {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("php");
		list.add("python");
		
		//map function
		Stream<Integer> stream = list.stream().map(p -> p.length());
		
		Integer[] lengthArr = stream.toArray(Integer[]:: new);
		
		for(int a: lengthArr){
			System.out.println(a);
		}
	}
}
