package com.aurionpro.test;

import com.aurionpro.model.Professor;
import com.aurionpro.model.Student;

public class EngineeringTest {

	public static void main(String[] args) {
		Student student = new Student(1, "Mumbai", "220101");
		System.out.println(student);
		System.out.println("Student Branch: "+student.getBranch());

		Professor prof = new Professor(2, "Navi Mumbai", "121076");
		System.out.println(prof);
		System.out.println("Salary of Professor: "+prof.calculateSalary());

	}

}
