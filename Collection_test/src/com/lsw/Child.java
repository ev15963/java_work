package com.lsw;

public class Child {

	private String id, pw, name;
	private int age;
	
//	Child 클래스의 기본 생성자 Overloading
	
	public Child(String id, String pw, String name, int age) {
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.age=age;
	}
	

//	public
	
	//toString() 재정의
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Person [id=").append(id).append(", pw=")
		.append(pw).append(", name=").append(name)
		.append(", age=").append(age).append("]");
		
		return builder.toString();
	}
	
//	private 멤버에 대한 getter /setter
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
