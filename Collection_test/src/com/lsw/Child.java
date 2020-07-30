package com.lsw;

import com.sun.javafx.beans.IDProperty;

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
	
//	privat 멤버에 대한 getter /setter
	
	//toString() 재정의
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Person [id=").append(id).append(", pw=")
		.append(pw).append(", name=").append(name)
		.append(", age=").append(age).append("]");
		
		return builder.toString();
	}

}
