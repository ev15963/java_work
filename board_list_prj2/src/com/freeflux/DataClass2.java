package com.freeflux;

import java.util.ArrayList;

/** 전체 게시글 정보를 담는 클래스 
 * @param boardList : 전체 게시글 정보를 담는 배열
 * **/
public class DataClass2 {

	//BoardClass[] boardList = new BoardClass[18];
	ArrayList<BoardClass> boardList=new ArrayList<BoardClass>();

	public DataClass2() { // 기본생성자
	} // 생성자 END

	/** 초기데이터를 멤버배열에 대입하는 메서드 **/
	public void initBoards() {
		boardList.add(new BoardClass(11968, "2020 07 08 클래스연습데이터7 (student, takes)", "김광식", 25));
		boardList.add(new BoardClass(11967, "2020 07 08 클래스연습데이터5 (학과/학생)", "김정현", 62));
		boardList.add(new BoardClass(11965, "2020 07 07 클래스 연습 데이터 4 (부서/사원)", "김현정", 60));
		boardList.add(new BoardClass(11966, "2020 07 07 클래스 연습 데이터 4 ", "김우주", 34));
		boardList.add(new BoardClass(11964, "2020 07 07 클래스 연습 데이터 3 (도서) ", "김우주", 65));
		boardList.add(new BoardClass(11963, "2020 07 06 클래스 연습 데이터 2 (학생) ", "김현정", 44));
		boardList.add(new BoardClass(11962, "2020 07 06 클래스 연습 데이터 (교수) ", "백태성", 48));
		boardList.add(new BoardClass(11961, "2020 07 03 3가지 문제를 메서드 처리 ", "김광식", 58));
		boardList.add(new BoardClass(11960, "2020 07 03 split() 와 클래스 연습 데이터", "김정현", 54));
		boardList.add(new BoardClass(11959, "2020 07 02 마지막 3가지 문제 ", "박광수", 92));
		boardList.add(new BoardClass(11958, "2020 07 02 split test ", "김현정", 53));
		boardList.add(new BoardClass(11957, "2020 07 02 제어문 연습데이터 ", "김정현", 64));
		boardList.add(new BoardClass(11956, "코드를 엉망으로 작성하는 법 ", "박광수", 43));
		boardList.add(new BoardClass(11955, "유지 보수 어렵게 코딩하는 방법 ", "김광식", 59));
		boardList.add(new BoardClass(11954, "2020 07 01 Java Platform Standard Edition 8 Documentation ", "Amor vincit omnia", 29));
		boardList.add(new BoardClass(11640, "2019 01 30 변수, 배열, 객체, 클래스 (기초 문법 간단 요약) ", "박광수", 91));
		boardList.add(new BoardClass(11640, "2019 01 30 변수, 배열, 객체, 클래스 (기초 문법 간단 요약) ", "김우주", 95));
		boardList.add(new BoardClass(11639, "2019 01 30 기본 지식 정리 ", "김우주", 70));
	}
} // DataClass END
