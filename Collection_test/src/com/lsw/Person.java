package com.lsw;

public class Person {

	// 컬렉션의 요소는 객체이다.

	// 아이디, 비밀번호, 이름, 나이를 받는 Child 클래스

	// Person 클래스 멤버변수
	private String id, pw, name;

	// Person 클래스 생성자
	public Person(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

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

	// toString() 재정의
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("Person [id=").append(id).append(", pw=").append(pw).append(", name= ").append(name)
				.append(", age= ").append("age").append("]");

		return builder.toString();
	}

}
