package com.lsw;

public class ObjectClass {

	private String name = "";
	private String location ="";
	private int year=0;
	
	public ObjectClass(String s1, String s2, int i3) {
		this.name=s1;
		this.location=s2;
		this.year=i3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
