package com.aurionpro.model;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	private GenderOption gender;

	public Person(String name, int age, double height, double weight, GenderOption gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public GenderOption getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", gender="
				+ gender + "]";
	}

}
