package com.freeflux;

public class BookClass {
	// DO it HTML 5 CSS 3__고경희__이지스퍼블리싱__16800__06365234__20
	private String title = "";
	private String author = "";
	private String press = "";
	private int price = 0;
	private String img = "";
	private int discount = 0;

	public BookClass() {
	}

	public BookClass(String title, String author, String press, String price, String img, String discount) {
		this.title = title;
		this.author = author;
		this.press = press;
		this.price = this.stringCastInt(price);
		this.img = img+".jpg";
		this.discount = this.stringCastInt(discount);
	}

	/** 문자열 숫자를 숫자로 변환 메서드 **/
	private int stringCastInt(String n) {
		return Integer.parseInt(n);
	}

	/** 아래 메서드들은 private 변수의 getter 들 **/
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPress() {
		return press;
	}

	public int getPrice() {
		return price;
	}

	public String getImg() {
		return img;
	}

	public int getDiscount() {
		return discount;
	}

	public void testToString() {
		System.out.println(this.title+":"+this.author+":"+this.press+":"+this.price+":"+this.img+":"+this.discount);
	}

}
