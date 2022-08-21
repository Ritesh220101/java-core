package com.aurionpro.model;

import java.util.List;

public class Region {
	private int regionCode;
	private String regionName;
	List<Countries> countries;
	public Region(int regionCode, String regionName) {
		super();
		this.regionCode = regionCode;
		this.regionName = regionName;
	}
	
	public int getRegionCode() {
		return regionCode;
	}

	public String getRegions() {
		return regionName;
	}

	public List<Countries> getCountries() {
		return countries;
	}

	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		return "Region [regionCode=" + regionCode + ", regionName=" + regionName + ", countries=" + countries + "]";
	}
	
	

}
