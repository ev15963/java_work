package com.lsw;



public class NewsClass {

	private String title="";
	private String author="";
	private String publish="";
	private String price="";
	private String imgName="";
	private String discount="";
	
	public NewsClass() {
		
	}
	
	public NewsClass(String s1, String s2, String s3, String s4, String s5, String s6) {
		this.setTitle(s1);
		this.setAuthor(s2);
		this.setPublish(s3);
		this.setPrice(s4);
		this.setImgName(s5);
		this.setDiscount(s6);
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
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName=imgName;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount=discount;
	}


}
