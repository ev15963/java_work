package com.lsw;

public class QuizProtocol {

	private static final int WAITING = 0;
	private static final int PROBLEM = 1;
	private static final int ANSWER = 2;

	private static final int NUMPROBLEMS = 3;

	private int state = WAITING; //���¸� �����ϴ� ���� (PROBLEM

	private int currentProblem = 0;

	// ���� �迭 / ���� �迭
	private String[] problems = { "��Ʈ��ũ ó�� ��Ű����?", "�ڹ��� ����ȭ�� �ֽŹ�����?", "���ͳݿ��� ��ǻ�͸� �ĺ��� �ּҴ�?" };
	private String[] answers = { "java.net", "1.8", "IP" };

	public QuizProtocol() {
	} // �⺻������ END

	/** ������ �����ϰ� ������ Ȯ�����ִ� �������� ���μ��� �޼��� **/
	public String process(String theInput) {
		String theOutput = null;

		// �ʱ� ��� ������ ���, client���� ������ ����
		if (state == WAITING) {
			// client���� ����
			theOutput = "��� �����մϴ�(y/n)";
			state = PROBLEM;
			// client�� ��� ������ ������ ������ ����
		} else if (state == PROBLEM) {

			// client�� ���� ������ �ϰڴٰ� "y" �Ǵ� "Y"�� �Է��Ͽ��� ��
			if (theInput.equalsIgnoreCase("y")) { // ��ҹ��� ��..
				theOutput = problems[currentProblem]; // ��������
				state = ANSWER;
			} else {
				state = WAITING;
				theOutput = "quit";
			}

			// ���� ����Ǿ��� ��
		} else if (state == ANSWER) {
			if(theInput.equalsIgnoreCase(answers[currentProblem])) {
				theOutput = "�����Դϴ�. ����Ͻðڽ��ϱ�? (y/n)";
				state = PROBLEM;
			} else {
				state = PROBLEM;
				theOutput = "�����Դϴ�. ����Ͻðڽ��ϱ�? (y/n)";
			}
			currentProblem = (currentProblem + 1) % NUMPROBLEMS;
		}
		return theOutput;
	}

}
