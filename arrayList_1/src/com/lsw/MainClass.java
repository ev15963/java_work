package com.lsw;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		/**ArrayList.class**/
		ArrayList<Integer> a= new ArrayList<Integer>();
		System.out.println("크기:"+a.size());
		a.add(1);		//index:0
		a.add("문자열");	 //index:1
		a.add(true); 	//index:2
		a.add('A');		//index:3
		boolean b=a.add(10.455);	//index:4
		System.out.println("크기:"+a.size());
		System.out.println(a.get(1));
		a.set(1,"새로운 문자열");
		System.out.println(a.get(1));
		boolean b1 = (boolean) a.remove(1); //1
		System.out.println(a.get(2));
		System.out.println(a.size());
		int n= a.size();
	}

}
