package com.aurionpro.test;

import com.aurionpro.model.*;

public class PersonTest {

	public static void main(String[] args) {
		Person person1 = new Person("Ritesh", 21, 180, 81, GenderOption.MALE);
		System.out.println(person1);
		Bmi bmi = new Bmi(person1);
		System.out.println(bmi.getBMI());
		System.out.println(bmi.getBodyType());

	}

}
