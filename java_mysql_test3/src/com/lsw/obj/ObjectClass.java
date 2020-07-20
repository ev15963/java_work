package com.lsw.obj;

public class ObjectClass {
	
	private String name ="";
	private int age=0;
	private int pay=0;
	private String area="";
	private int year=0;
	private String employee="";
	
	public ObjectClass(String s1, int i2, int i3, String s4, int i5, String s6) {
		this.setName(s1);
		this.age=i2;
		this.setPay(i3);
		this.area=s4;
		this.year=i5;
		this.employee=s6;
	}

	public int getAge() {
		return age;
	}

	public String getArea() {
		return area;
	}

	public int getYear() {
		return year;
	}

	public String getEmployee() {
		return employee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

}
