package com.aurionpro.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.aurionpro.model.Countries;
import com.aurionpro.model.Region;

public class RegionFileTest {

	public static void main(String[] args) throws FileNotFoundException {
		List<String> regions = new ArrayList<>();
		try(Stream<String> lines = Files.lines(Paths.get("./lib/regions.txt"))){
			regions = lines.collect(Collectors.toList());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<String> countries = new ArrayList<>();
		try(Stream<String> lines = Files.lines(Paths.get("./lib/countries.txt"))){
			countries = lines.collect(Collectors.toList());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<Countries> cou = new ArrayList<Countries>();
//		for(String r:regions)
//			System.out.println(r);
//		for(String c:countries)
//			System.out.println(c);
	}

}
