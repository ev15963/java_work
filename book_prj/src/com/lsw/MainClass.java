package com.lsw;

public class MainClass {
	public static void main(String[] args) {
		DataClass dc=new DataClass(); //BookClass[] books
		//dc.books[0]=new BookClass("DO it HTML 5 CSS 3", "고경희", "이지스퍼블리싱", 16800, "06365234.jpg", 20);
		
		String name="희";
		
		for(int i=0;i<dc.books.length;i++) //역순출력
			if(dc.books[i].author.endsWith(name))
				System.out.println(dc.books[i].title);


	}
}
