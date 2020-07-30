package com.lsw;

public class Child {

	// �÷����� ��Ҵ� ��ü�̴�.

	// ���̵�, ��й�ȣ, �̸�, ���̸� �޴� Child Ŭ����

	// Child Ŭ������ ���
	private String id, pw, name;
	private int age;

	// Child Ŭ������ �⺻ ������ Overloading

	public Child(String id, String pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	// toString() ������
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("Person [id=").append(id).append(", pw=").append(pw).append(", name= ").append(name)
				.append(", age= ").append(age).append("]");

		return builder.toString();
	}

	// private ����� ���� getter /setter

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