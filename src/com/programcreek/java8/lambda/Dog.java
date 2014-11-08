package com.programcreek.java8.lambda;

public class Dog {
	String name;
	int height;
	int weight;

	public Dog(String n, int s, int w) {
		this.name = n;
		this.height = s;
		this.weight = w;
	}

	public String toString() {
		return getName() + ": size=" + getHeight() + " weight=" + getWeight()
				+ " \n";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int size) {
		this.height = size;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
