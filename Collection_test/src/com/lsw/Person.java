package com.lsw;

public class Person {

	// �÷����� ��Ҵ� ��ü�̴�.

	// ���̵�, ��й�ȣ, �̸�, ���̸� �޴� Child Ŭ����

//	Person Ŭ���� �������
	private String id, pw, name;
	
//	Person Ŭ���� ������
	public Person(String id, String pw, String name) {
	    super();
	    this.id = id;
	    this.pw = pw;
	    this.name = name;
	}
	
	

	// toString() ������
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("Person [id=").append(id).append(", pw=").append(pw).append(", name= ").append(name)
				.append(", age= ").append("age").append("]");

		return builder.toString();
	}

}
