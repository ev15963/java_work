package com.lsw;

public class ProfessorClass {
	//("92001", "590327-1839240", "이태규", 920, "교수", "1997")
	//이 영역에 선언되는 변수는 클래스으 인스턴스 변수
	//인스턴스는 클래스가 객체로 생성되는 과정
	//생성된 객체는 하나의 인스턴스 결과..
	public String n, jumin, name, rank, year;
	public int pay;
	
	public ProfessorClass(String no, String j, String n, int p, String r, String y) {
		
		this.n=no; // 검색속도 빠름 바로 public String가서 찾음
		this.jumin=j;
		this.name=n;
		this.rank=r;
		this.pay=p;
		this.year=y;
	} // 생성자 END
} // 클래스 END
