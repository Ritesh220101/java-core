package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.aurionpro.model.Employee;

public class DeserializationTest {

	public static void main(String[] args) {
		Employee employee = null;
		try {
			
			// Creating objects FileInputStream and ObjectInputStream
			FileInputStream file = new FileInputStream("./lib/text.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			
			// Method for deserialization
			employee = (Employee) in.readObject();
			
			in.close();
			file.close();
			System.out.println("Employee object deserialized");
			System.out.println(employee);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
