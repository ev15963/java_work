package com.lsw.obj;

public class CafeMember {

	private int seqno=0;
	private String nickname="";
	private String name="";
	private String rating="";
	private String regidate="";
	private String lastdate="";
	private int visitno=0;
	private int postno=0;
	private int replyno=0;
	private String gender="";
	
	public CafeMember(int i1, String s2, String s3, String s4, String s5, String s6, 
			int i7, int i8, int i9, String s10) {
		this.seqno=i1;
		this.nickname=s2;
		this.name=s3;
		this.rating=s4;
		this.regidate=s5;
		this.lastdate=s6;
		this.visitno=i7;
		this.postno=i8;
		this.replyno=i9;
		this.gender=s10;
	}
	
	public int getSeqno() {
		return seqno;
	}

	public void setSeqno(int seqno) {
		this.seqno = seqno;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getRegidate() {
		return regidate;
	}

	public void setRegidate(String regidate) {
		this.regidate = regidate;
	}

	public String getLastdate() {
		return lastdate;
	}

	public void setLastdate(String lastdate) {
		this.lastdate = lastdate;
	}

	public int getVisitno() {
		return visitno;
	}

	public void setVisitno(int visitno) {
		this.visitno = visitno;
	}

	public int getPostno() {
		return postno;
	}

	public void setPostno(int postno) {
		this.postno = postno;
	}

	public int getReplyno() {
		return replyno;
	}

	public void setReplyno(int replyno) {
		this.replyno = replyno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public CafeMember() {
	
	}

}
