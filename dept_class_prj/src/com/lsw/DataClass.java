package com.lsw;

public class DataClass {
	public static Book[] book = new Book[18];

	public DataClass() {

	}

	public void initBook() {
		book[0] = new Book(11968, "2020 07 08 클래스연습데이터7 (student, takes)", "김광식", 25);
		book[1] = new Book(11967, "2020 07 08 클래스연습데이터5 (학과/학생)", "김정현", 62);
		book[2] = new Book(11965, "2020 07 07 클래스 연습 데이터 4 (부서/사원)", "김현정", 60);
		book[3] = new Book(11966, "2020 07 07 클래스 연습 데이터 4 ", "김우주", 34);
		book[4] = new Book(11964, "2020 07 07 클래스 연습 데이터 3 (도서) ", "김우주", 65);
		book[5] = new Book(11963, "2020 07 06 클래스 연습 데이터 2 (학생) ", "김현정", 44);
		book[6] = new Book(11962, "2020 07 06 클래스 연습 데이터 (교수) ", "백태성", 48);
		book[7] = new Book(11961, "2020 07 03 3가지 문제를 메서드 처리 ", "김광식", 58);
		book[8] = new Book(11960, "2020 07 03 split() 와 클래스 연습 데이터", "김정현", 54);
		book[9] = new Book(11959, "2020 07 02 마지막 3가지 문제 ", "박광수", 92);
		book[10] = new Book(11958, "2020 07 02 split test ", "김현정", 53);
		book[11] = new Book(11957, "2020 07 02 제어문 연습데이터 ", "김정현", 64);
		book[12] = new Book(11956, "코드를 엉망으로 작성하는 법 ", "박광수", 43);
		book[13] = new Book(11955, "유지 보수 어렵게 코딩하는 방법 ", "김광식", 59);
		book[14] = new Book(11954, "2020 07 01 Java Platform Standard Edition 8 Documentation ",
				"Amor vincit omnia", 29);
		book[15] = new Book(11640, "2019 01 30 변수, 배열, 객체, 클래스 (기초 문법 간단 요약) ", "박광수", 91);
		book[16] = new Book(11640, "2019 01 30 변수, 배열, 객체, 클래스 (기초 문법 간단 요약) ", "김우주", 95);
		book[17] = new Book(11639, "2019 01 30 기본 지식 정리 ", "김우주", 70);
	}
}
