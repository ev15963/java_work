package com.freeflux;

public class BookClass {
	// DO it HTML 5 CSS 3__�����__�������ۺ���__16800__06365234__20
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

	/** ���ڿ� ���ڸ� ���ڷ� ��ȯ �޼��� **/
	private int stringCastInt(String n) {
		return Integer.parseInt(n);
	}

	/** �Ʒ� �޼������ private ������ getter �� **/
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
