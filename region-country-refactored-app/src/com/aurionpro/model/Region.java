package com.aurionpro.model;

import java.util.List;

public class Region {
	int id;
	String name;
	List<Countries> countries;

	public Region(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}

	public String getName() {
		return name;
	}

	public List<Countries> getCountries() {
		return countries;
	}
	
	public String getRegionNameById(int id) {
		return this.getName();
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", name=" + name + ", countries=" + countries + "]";
	}
}
