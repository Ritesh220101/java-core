package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class StreamTasks {

	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("./lib/test.txt");
			
			Scanner sc = new Scanner(f);
			
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedReader br;
		try {
			br = Files.newBufferedReader(Paths.get("./lib/test.txt"));
			Stream<String> file = br.lines();
			file.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

	

}
