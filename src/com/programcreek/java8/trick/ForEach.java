package com.programcreek.java8.trick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		


List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f");
//no difference
list.parallelStream().forEach(s -> System.out.println(s));

System.out.println("----");

for(String s: list){
	System.out.println(s);
}
	}

}
