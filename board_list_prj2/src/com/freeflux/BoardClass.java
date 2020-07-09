package com.freeflux;

/** 하나의 게시글 정보를 담는 클래스**/
public class BoardClass {
	public int bno=0;
	public String title="";
	public String writer="";
	public int hit=0;

	// 11968, "2020 07 08 클래스연습데이터7 (student, takes)" ,  "김광식",  25
	/** 외부로부터 데이터를 전달받아 멤버변수에 대입하는 생성자 
	 * @param n : 번호
	 * @param t : 제목
	 * @param w : 작성자
	 * @param h : 조회수
	**/
	public BoardClass(int n, String t, String w, int h) {
		this.bno=n;
		this.title=t;
		this.writer=w;
		this.hit=h;
	} // 생성자 END

}
