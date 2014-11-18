package com.programcreek.java8.stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Java8FlatMap {

public static void main(String[] args) {
	
	
	
	ArrayList<Order> orders = new ArrayList<Order>();
	Stream<Item> itemStream = orders.stream().flatMap(order -> order.getItems().stream());
	
}
	
	public static Stream<Character> convertToCharStream(String s){
		ArrayList<Character> list = new ArrayList<Character>();
		for(char c: s.toCharArray()){
			list.add(c);
		}
		return list.stream();
	}
	
	public static void test() throws IOException{
		Path path = Paths.get(null);
		Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8);
	    Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));
	}
}

class Order{
	String orderId;
	ArrayList<Item> items = new ArrayList<Item>();
	
	public Order(String orderId, ArrayList<Item> orderItems) {
		super();
		this.orderId = orderId;
		this.items = orderItems;
	} 
	
	public String getOrderId() {
		return orderId;
	}
	
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	
	public void setItems(ArrayList<Item> orderItems) {
		this.items = orderItems;
	}
}

class Item{
	String itemId;
	String itemName;
	
	public Item(String itemId, String itemName) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
	}
	
	public String getItemId() {
		return itemId;
	}
	
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
}
