package com.lsw.obj;

public class CafeMember {

	private String seqno="";
	private String nickname="";
	private String name="";
	private String rating="";
	private String regidate="";
	private String lastdate="";
	private String visitno="";
	private String postno="";
	private String replyno="";
	private String gender="";
	
	public CafeMember(String s1, String s2, String s3, String s4, String s5, String s6, 
			String s7, String s8, String s9, String s10) {
		this.seqno=s1;
		this.nickname=s2;
		this.name=s3;
		this.rating=s4;
		this.regidate=s5;
		this.lastdate=s6;
		this.visitno=s7;
		this.postno=s8;
		this.replyno=s9;
		this.gender=s10;
	}
	
	

	public String getSeqno() {
		return seqno;
	}



	public void setSeqno(String seqno) {
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



	public String getVisitno() {
		return visitno;
	}



	public void setVisitno(String visitno) {
		this.visitno = visitno;
	}



	public String getPostno() {
		return postno;
	}



	public void setPostno(String postno) {
		this.postno = postno;
	}



	public String getReplyno() {
		return replyno;
	}



	public void setReplyno(String replyno) {
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
