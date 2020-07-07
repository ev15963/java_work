package com.lsw;

public class MainClass {
	public static void main(String[] args) {
		DataClass dc=new DataClass(); //BookClass[] books
		//dc.books[0]=new BookClass("DO it HTML 5 CSS 3", "고경희", "이지스퍼블리싱", 16800, "06365234.jpg", 20);
		
		dc.books[0].cart=true;
		
		String name="고경희";
		//고경희 책만 구매할 경우, 책제목과 최종 결제 가격과 총 할인 가격
		for(int i=0;i<dc.books.length;i++) {
			if(dc.books[i].author.contains(name)) {
				dc.books[i].cart=true;
//				System.out.println(dc.books[i].title);
	//			for(int i=0;i<books.length;i++)
	//			System.out.println(dc.books[0].dc);
			}
		}
		int sum=0;
		
		System.out.println("구매도서명");
		System.out.println("-----------------------");
		for(int i =0;i<dc.books.length;i++) {
			if(dc.books[i].cart==true) {
				System.out.println(dc.books[i].title);
				sum += dc.books[i].rPrice;
			}
		}
		System.out.println("-----------------------");
		System.out.println("총 구매가격 : "+sum+" 원");
		
		
		
	/*	
		String title=""; //장바구니에 담긴 저자 책 제목들 저장변수
		int sumPrice=0;
		for(int i=0; i<dc.books.length; i++) {
			if(dc.books[i].cart==true) {
				titles=titles+dc.books[i].title+",";
				sumPrice=sumPrice+dc.books[i].rPrice;
			}
		}
		
		String[] titleArray = title.split(",");
		System.out.println();
		
		*/
//		for(int i=0;i<dc.books.length;i++) //역순출력
//			if(dc.books[i].author.endsWith(name))
//				System.out.println(dc.books[i].title);
//
//		String test="   ddd  dddd   ";
//		System.out.println("_"+test.trim()+"__");
//
//		
//		for(int i=0;i<dc.books.length;i++)
//			System.out.println("도서원가는 "+dc.books[0].price+", 할인가격은 "+dc.books[0].rPrice);
	}
}
