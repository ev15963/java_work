package com.lsw;

//db�� ���� Ŭ���� �߰�
public class quiz {

	/**
	 * mySQL�� quiz_db �� quiz_table ���� �ִ� ������ ������ �ϴ��� ��ü�� �����ֱ� ���� Ŭ���� (�� ��ũ������ �ϳ���
	 * ��ü��..) QuizDB ��ü�� ArrayList<Quiz> quiz_list�� ����(add()).
	 */

	private String quizQuestion = null;
	private String quizAnswer = null;
	private int quizNo = 0;

	/** �⺻������ **/
	public quiz() {
	}

	/**�Ʒ� �޼������ ���ͼ���**/
	

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
