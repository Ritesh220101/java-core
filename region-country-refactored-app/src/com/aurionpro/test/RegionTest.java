package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.aurionpro.model.Countries;
import com.aurionpro.model.Region;

public class RegionTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Countries> countries = countryList();
		List<Region> regions = getRegionList();
		
		for(Region x:regions) {
			int regionId=x.getId();
			List<Countries> regionCountries = getCountriesByRegion(countries,regionId);
			regions.get(regionId-1).setCountries(regionCountries);
			System.out.println(x);
		}
		
		
		System.out.println("Enter country code to get country name");
		String countryCode=sc.nextLine();
		String countryDetailsByCode = getCountryDetailsByCode(regions, countryCode);
		
		if(countryDetailsByCode!=null) {
			System.out.println(countryDetailsByCode);
		}
		else {
			System.out.println("Invlaid country code!!");
		}
	}
	
	private static List<Region> getRegionList() {
		List<Region> regions=Arrays.asList(
				new Region(1, "Europe"),
				new Region(2, "Americas"),
				new Region(3, "Asia"),
				new Region(4, "Middle East and Africa")
				);
		return regions;
	}

	private static List<Countries> countryList() {
		List<Countries> countries=Arrays.asList(
				new Countries("IT", "Italy", 1),
				new Countries("JP", "Japan", 3),
				new Countries("US", "United States of America", 2),
				new Countries("CA", "Canada", 2),
				new Countries("CN", "China", 3),
				new Countries("IN", "India", 3),
				new Countries("AU", "Australia", 3),
				new Countries("ZW", "Zimbabwe",4),
				new Countries("SG", "Singapore", 3),
				new Countries("UK", "United Kingdom", 1),
				new Countries("FR", "France", 1),
				new Countries("DE", "Germany", 1),
				new Countries("ZM", "Zambia", 4),
				new Countries("EG", "Egypt", 4),
				new Countries("BR", "Brazil", 2),
				new Countries("CH", "Switzerland", 1),
				new Countries("NL", "Netherlands", 1),
				new Countries("MX", "Mexico", 2),
				new Countries("KW", "Kuwait", 4),
				new Countries("IL", "Israel", 4),
				new Countries("DK", "Denmark", 1),
				new Countries("HK", "HongKong", 3),
				new Countries("NG", "Nigeria", 4),
				new Countries("AR", "Argentina", 2),
				new Countries("BE", "Belgium", 1)
				);
		return countries;
	}

	private static String getCountryDetailsByCode(List<Region> regions, String countryCode) {
		for(Region x:regions) {
			List<Countries> regionCountries=x.getCountries();
			List<Countries> collect = 
					regionCountries.stream()
					.filter(country->country.getCode().equalsIgnoreCase(countryCode))
					.collect(Collectors.toList());
			if(collect.size()!=0) {
				String regionNameByCountry = x.getName();
				return "Country Name :"+collect.get(0).getName() 
						+ "\nRegion Name :"+ regionNameByCountry;
			}
		}
		return null;
	}

	private static List<Countries> getCountriesByRegion(List<Countries> countries,int id) {
		return countries.stream()
				.filter((country)->country.getRegionId()==id)
				.collect(Collectors.toList());
	}
}
