package com.freeflux;

public class Takes {
	private String stu_id="";		// 학번
	public String room_id="";		// 강의실
	public String take="";			// 학점
	
	// ("1292001", "C101-01", "B+");
	public Takes(String stu, String room, String t) {
		this.setStu_id(stu);
		this.room_id=room;
		this.take=t;
	}

	public String getStu_id() {
		return stu_id;
	}

	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}

}
