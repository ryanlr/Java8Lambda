package com.programcreek.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Java8Filter {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("php");
		list.add("python");
		
		//filter function
		Stream<String> stream = list.stream().filter(p -> p.length() > 3);
		
		//? what is stream, copied collection behind? 
		
		//System.out.println(stream.toArray().toString());
		for(Object a: stream.toArray()){
			System.out.println(a.toString());
		}
		
		//map function
	}

}
