package com.aurionpro.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyExample {
	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("./lib/input.txt");
			Properties p = new Properties();
			try {
				p.load(f);
				System.out.println("Username: "+p.getProperty("username"));
				System.out.println("Password: "+p.getProperty("password"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
