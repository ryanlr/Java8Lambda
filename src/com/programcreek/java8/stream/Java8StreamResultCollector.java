package com.programcreek.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamResultCollector {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("php");
		list.add("python");
		Stream<String> wordStream = list.stream();

		//Stream<Integer> lengthStream = wordStream.map(s -> s.length());

		// to array
		//Integer[] lenArr = lengthStream.toArray(Integer[]::new);
		//System.out.println(Arrays.toString(lenArr));
		
		// to set
		//List<Integer> intList= lengthStream.collect(Collectors.toList());
		//System.out.println(intList);
		
		// to list
		
		//TreeSet<Integer> intSet= lengthStream.collect(Collectors.toCollection(TreeSet::new));
		//System.out.println(intSet);
		
		// to map
		Map<String, Integer> map = wordStream.collect(Collectors.toMap(Function.identity(), s->s.length()));
		System.out.println(map);
	}
}
