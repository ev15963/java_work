package com.lsw;
/*한가지 책정보를 담는 클래스*/
public class BookClass {
	public String title="";
	public String author="";
	public String press="";
	public int price = 0;
	public String image="";
	public int dc=0;
	
	public int rPrice=0;
	
	public boolean cart=false;
	
	//("DO it HTML 5 CSS 3", "고경희", "이지스퍼블리싱", 16800, "06365234.jpg", 20);
	public BookClass(String t, String a, String p, int pr, String i, int d) { //생성자는 반환타입을 못가진다. 기본생성자
		this.title=t;
		this.author=a;
		this.press=p;
		this.price=pr;
		this.image=i;
		this.dc=d;
		
		this.dcPrice();
	}
	public void dcPrice() {
		double dcPrice=this.price*(this.dc*0.01);
		this.rPrice=(int) (this.price-dcPrice);
		
	}

	
}
