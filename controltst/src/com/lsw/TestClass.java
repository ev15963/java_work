package com.lsw;

public class TestClass { //MainClass�� ������ġ
	float f=110.2f;
	int d=11;
	//		0123456
	String n1="770405";//�ֹ� �չ�ȣ
	String n2="1202123";
	int age=0; //���� => String.substring(0,2)
				//  => Integer.parseInt("12")
	public TestClass(String string) {
		System.out.println("TestClass ������ ����");
		age(string);
		System.out.println("TestClass ������ ����");
	}
	public void age(String s) { // s : String n1
		System.out.println("age()�� �� ����:"+s);
		String n=s.substring(0,2); // n: "77"
		System.out.println("������ ����:"+n);
		age =Integer.parseInt(n); // a: 77
		System.out.println("���ڿ��� ���ڷ�: "+n);
		System.out.println("age() ����");
	}
}
