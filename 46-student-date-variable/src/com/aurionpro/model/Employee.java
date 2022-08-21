package com.aurionpro.model;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String dateInString;
	private Date date;
	public Employee(int id, String name, double salary, String dateInString) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dateInString = dateInString;
		this.date = formatting(dateInString);
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public Date getDate() {
		return date;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", date=" + date + "]";
	}
	
	private Date formatting(String dateInString) {
		Date date = null;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(dateInString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
