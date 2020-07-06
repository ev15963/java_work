package com.lsw;

public class ProfesserClass_2 {
	// ("1292001", "900424-1825409", "±è±¤½Ä", 3, "¼­¿ï', 92);
	public String number, jumin, name, living;
	public int gkrsus = 0;
	public int point = 0;
	public int age = 0;
	public String dd = "";

	public ProfesserClass_2(String n, String j, String nm, int g, String l, int p) {
		this.number = n;
		this.jumin = j;
		this.name = nm;
		this.gkrsus = g;
		this.living = l;
		this.point = p;

		this.ageMethod(this.jumin);
		this.gkrwja(this.point);
	}

	public void ageMethod(String temp) {
		String[] sksna = temp.split("-");

		String front = sksna[0].substring(0, 2);
		String back = sksna[1].substring(0, 1);
		int birth = 0;
		int f = Integer.parseInt(front);
		int b = Integer.parseInt(back);
		if (b == 1 || b == 2) {
			birth = 1900;
		} else {
			birth = 2000;
		}

		this.age = 2020 - (f + birth) + 1;// Çò°¥¸²
		// System.out.println(age);
	}

	public void gkrwja(int temp) {
		if (temp >= 90) {
			this.dd = "A";
		} else if (temp >= 80) {
			this.dd = "B";
		} else if (temp >= 70) {
			this.dd = "C";
		} else if (temp >= 60) {
			this.dd = "D";
		} else {
			this.dd = "F";
		}
	}
}
