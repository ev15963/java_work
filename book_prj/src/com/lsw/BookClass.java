package com.lsw;
/*�Ѱ��� å������ ��� Ŭ����*/
public class BookClass {
	public String title="";
	public String author="";
	public String press="";
	public int price = 0;
	public String image="";
	public int dc=0;
	
	//("DO it HTML 5 CSS 3", "�����", "�������ۺ���", 16800, "06365234.jpg", 20);
	public BookClass(String t, String a, String p, int pr, String i, int d) { //�����ڴ� ��ȯŸ���� ��������. �⺻������
		this.title=t;
		this.author=a;
		this.press=p;
		this.price=pr;
		this.image=i;
		this.dc=d;
	}
}
