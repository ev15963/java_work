package com.lsw;

public class TestClass { // MainClass�� ������ġ
	float f = 110.2f;
	int d = 11;
	// 0123456
	String n1 = "770405";// �ֹ� �չ�ȣ
	String n2 = "1202123";
	int age = 0; // ���� => String.substring(0,2)
					// => Integer.parseInt("12")

	public TestClass(String string1, String string2) {
		System.out.println("TestClass ������ ����");
		age(string1, string2);
		System.out.println("TestClass ������ ����");
	}

	public void age(String s, String s1) { // s : String n1
		String nfront=s.substring(0,2); //�ֹ� ���ڸ��� ��ó�� 2�ڸ�
		int temp=Integer.parseInt(nfront);
		
		String nback=s1.substring(0,1); //�ֹ� ���ڸ��� ��ó�� 1�ڸ�
		if(nback.equals("1")||nback.equals("2")) {
			age=2020-(temp+1900);
		} else {
			age=2020-(temp+2020);
		}
	}

//	public int year(int year) {
//		if (n2.equals("1") || n2.equals("2")) {
//			year = age + 1900;
//		} else {
//			year = age + 2000;
//		}
//		return year;
//	}
	
	
	
}
