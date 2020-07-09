package com.freeflux;

public class Takes {
	public String stu_id="";		// 학번
	public String room_id="";		// 강의실
	public String take="";			// 학점
	
	// ("1292001", "C101-01", "B+");
	public Takes(String stu, String room, String t) {
		this.stu_id=stu;
		this.room_id=room;
		this.take=t;
	}

}
