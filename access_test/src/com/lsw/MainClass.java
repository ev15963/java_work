package com.lsw;

import java.util.ArrayList;

import com.lsw.other.PublicClass;

public class MainClass {

	public static void main(String[] args) {
		PublicClass p1 = new PublicClass();
		
		ArrayList<PublicClass> a = new ArrayList<PublicClass>();
		a.add(p1);
//		PublicClass n=(PublicClass) a.get(0);
		int n = a.get(0).b;
		System.out.println(a.get(0));  //com.lsw.other.PublicClass@7852e922
		System.out.println(a.get(0).getP());
		a.get(0).setP(11000);
		System.out.println(a.get(0).getP());
	}
}
