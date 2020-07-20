 package com.lsw.obj;

public class ObjectClass {

	private int no =0;
	private String id=null;
	private String pw=null;
	
	public ObjectClass() {
			
	}
	//외부로부터 전달 받는 생성자
	public ObjectClass(int no, String id, String pw) {
		this.setNo(no);
		this.setId(id);
		this.setPw(pw);
	}
	

	/** 아래는 private 변수 대한 getter 들 **/
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
}
