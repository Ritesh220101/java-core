package com.aurionpro.model;

public class Bmi {
	private Person person;
	private double bmi;

	public Bmi(Person person) {
		this.person = person;
		this.bmi = calculateBMI();
	}

	private double calculateBMI() {
		double heightInMeters = person.getHeight() / 100;
		bmi = person.getWeight() / (heightInMeters * heightInMeters);
		return bmi;
	}

	public double getBMI() {
		return bmi;
	}

	public String getBodyType() {
		if (bmi <= 18.5)
			return "Under Weight";
		if (bmi > 18.5 && bmi <= 24.99)
			return "Normal";
		return "Obese";
	}

}
