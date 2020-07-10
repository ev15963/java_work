package com.freeflux;

/** 학과정보 클래스 **/
public class Department {
	private int dept_id=0; 			// 학과번호
	public String dept_name=""; 	// 학과이름
	public String office="";			// 강의실
	
	// (920, "컴퓨터공학과", "201호");
	public Department(int id, String name, String off) {
		this.dept_id=id;
		this.dept_name=name;
		this.office=off;
	} // 생성자 END

} // class END
