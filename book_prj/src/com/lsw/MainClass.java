package com.lsw;

public class MainClass {
	public static void main(String[] args) {
		DataClass dc=new DataClass(); //BookClass[] books
		//dc.books[0]=new BookClass("DO it HTML 5 CSS 3", "�����", "�������ۺ���", 16800, "06365234.jpg", 20);
		
		dc.books[0].cart=true;
		
		String name="�����";
		//����� å�� ������ ���, å����� ���� ���� ���ݰ� �� ���� ����
		for(int i=0;i<dc.books.length;i++) {
			if(dc.books[i].author.contains(name)) {
				dc.books[i].cart=true;
//				System.out.println(dc.books[i].title);
	//			for(int i=0;i<books.length;i++)
	//			System.out.println(dc.books[0].dc);
			}
		}
		int sum=0;
		
		System.out.println("���ŵ�����");
		System.out.println("-----------------------");
		for(int i =0;i<dc.books.length;i++) {
			if(dc.books[i].cart==true) {
				System.out.println(dc.books[i].title);
				sum += dc.books[i].rPrice;
			}
		}
		System.out.println("-----------------------");
		System.out.println("�� ���Ű��� : "+sum+" ��");
		
		
		
	/*	
		String title=""; //��ٱ��Ͽ� ��� ���� å ����� ���庯��
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
//		for(int i=0;i<dc.books.length;i++) //�������
//			if(dc.books[i].author.endsWith(name))
//				System.out.println(dc.books[i].title);
//
//		String test="   ddd  dddd   ";
//		System.out.println("_"+test.trim()+"__");
//
//		
//		for(int i=0;i<dc.books.length;i++)
//			System.out.println("���������� "+dc.books[0].price+", ���ΰ����� "+dc.books[0].rPrice);
	}
}
