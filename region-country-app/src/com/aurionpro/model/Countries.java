package com.aurionpro.model;

public class Countries {
	private String countryCode;
	private String countryName;
	private int regionCode;

	public Countries(String countryCode, String countryName, int regionCode) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.regionCode = regionCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public int getRegionCode() {
		return regionCode;
	}

	@Override
	public String toString() {
		return "Countries [countryCode=" + countryCode + ", countryName=" + countryName + ", regionCode=" + regionCode
				+ "]";
	}



}
