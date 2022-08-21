package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Employee;

public class SerializeTest {

	public static void main(String[] args) {
		try {

			Employee employee = new Employee(101, "ritesh", 50000);

			// Creating objects FileOutputStream and ObjectOutputStream
			FileOutputStream file = new FileOutputStream("./lib/text.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization
			out.writeObject(employee);
			
			out.close();
			file.close();
			System.out.println("Employee object serialized");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
