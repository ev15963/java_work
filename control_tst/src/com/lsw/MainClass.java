package com.lsw;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 =10;
		int n2=20;
		int condition=9;
		int age=20;
		String result;
		
		if(age>=condition) {
			result="발급가능";
			System.out.println(result);
		} else {
			result="발급가능";
			System.out.println("발급불가능");
		}
		
		if(age>condition) {
			System.out.println("발급가능");
		} else {
			System.out.println("발급불가능");
		}
	}

}
