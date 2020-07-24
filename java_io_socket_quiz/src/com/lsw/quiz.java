package com.lsw;

//db를 위해 클래스 추가
public class quiz {

	/**
	 * mySQL의 quiz_db 중 quiz_table 내에 있는 문제와 정보를 하니의 객체로 묶어주기 위한 클ㄹ스 (각 레크도르르 하나의
	 * 객체로..) QuizDB 객체의 ArrayList<Quiz> quiz_list에 저장(add()).
	 */

	private String quizQuestion = null;
	private String quizAnswer = null;
	private int quizNo = 0;

	/** 기본생성자 **/
	public quiz() {
	}

	/**아래 메서드들은 게터세터**/
	

	public int getQuizNo() {
		return quizNo;
	}

	public String getQuizQuestion() {
		return quizQuestion;
	}

	public String getQuizAnswer() {
		return quizAnswer;
	}

	public void setQuizNo(int quizNo) {
		this.quizNo = quizNo;
	}

	public void setQuizQuestion(String quizQuestion) {
		this.quizQuestion = quizQuestion;
	}

	public void setQuizAnswer(String quizAnswer) {
		this.quizAnswer = quizAnswer;
	}

}
