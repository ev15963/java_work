package com.freeflux;

public class Takes {
	public String stu_id="";		// �й�
	public String room_id="";		// ���ǽ�
	public String take="";			// ����
	
	// ("1292001", "C101-01", "B+");
	public Takes(String stu, String room, String t) {
		this.stu_id=stu;
		this.room_id=room;
		this.take=t;
	}

}
