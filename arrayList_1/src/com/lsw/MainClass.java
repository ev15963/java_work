package com.lsw;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		/** ArrayList.class **/
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println("ũ��:" + a.size());
		// a.add(1); //index:0
		// a.add("���ڿ�"); //index:1
		// a.add(true); //index:2
		// a.add('A'); //index:3
		// boolean b=a.add(10.455); //index:4
		// System.out.println("ũ��:"+a.size());
		// System.out.println(a.get(1));
		// a.set(1,"���ο� ���ڿ�");
		// System.out.println(a.get(1));
		// boolean b1 = (boolean) a.remove(1); //1
		// System.out.println(a.get(2));
		// System.out.println(a.size());
		// int n= a.size();
		a.add(1); // index 0
		// get(index

		System.out.println("ũ�� : " + a.size());
		for (int n = 1; n < 11; n++) {
			a.add(n);
			// }
			// for(int n = 1;n<10;n++) {
			// System.out.println(a.remove(n));
			// }
			// for(int n = 0;n<10;n++) {
			// System.out.println(a.remove(0));
			// }
		}
			a.clear();
			System.out.println(a.size());

	}
}
