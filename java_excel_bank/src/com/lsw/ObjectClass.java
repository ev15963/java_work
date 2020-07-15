package com.lsw;

public class ObjectClass {

	public String no = "";
	public String age = "";
	public String job = "";
	public String price = "";
	public String marital = "";
	public String education = "";
	public String housing = "";
	public String loan = "";
	public String contact = "";
	public String month = "";
	public String day_of_week = "";


	public ObjectClass(
			String no, String age, String job, 
			String price, String marital, String education, 
			String housing, String loan, String contact, 
			String month, String day_of_week) {
		this.no = no;
		this.age = age;
		this.job = job;
		this.price = price;
		this.marital = marital;
		this.education = education;
		this.housing = housing;
		this.loan = loan;
		this.contact = contact;
		this.month = month;
		this.day_of_week = day_of_week;
	}

	/** 문자열 숫자를 숫자로 변환 메서드 **/
	private int stringCastInt(String n) {
		return Integer.parseInt(n);
	}

//	/** 아래 메서드들은 private 변수의 getter 들 **/
//	public String getTitle() {
//		return title;
//	}
//
//	public String getAuthor() {
//		return author;
//	}
//
//	public String getPress() {
//		return press;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public String getImg() {
//		return img;
//	}
//
//	public int getDiscount() {
//		return discount;
//	}
//
//	public void testToString() {
//		System.out.println(this.title+":"+this.author+":"+this.press+":"+this.price+":"+this.img+":"+this.discount);
//	}
//


}
