 package com.lsw.obj;

public class ObjectClass {

	private int no =0;
	private String id=null;
	private String pw=null;
	
	public ObjectClass() {
			
	}
	//�ܺηκ��� ���� �޴� ������
	public ObjectClass(int no, String id, String pw) {
		this.setNo(no);
		this.setId(id);
		this.setPw(pw);
	}
	

	/** �Ʒ��� private ���� ���� getter �� **/
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
