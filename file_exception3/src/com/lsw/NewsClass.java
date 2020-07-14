package com.lsw;



public class NewsClass {

	private String title="";
	private String author="";
	private String publish="";
	private int price=0;
	private String imgName="";
	private int discount=0;
	
	public NewsClass() {
		
	}
	
	public NewsClass(String s1, String s2, String s3, int i4, String s5, int i6) {
		this.setTitle(s1);
		this.setAuthor(s2);
		this.setPublish(s3);
		this.setPrice(i4);
		this.setImgName(s5);
		this.setDiscount(i6);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish() {
		return publish;
	}
	
	public void setPublish(String publish) {
		this.publish=publish;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName=imgName;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount=discount;
	}


}
