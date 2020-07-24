package com.lsw;

public class QuizProtocol {
	 // ���¸� �����ϴ� ���
	 private static final int WAITING = 0;  // ��� 
	 private static final int PROBLEM = 1;  // ����
	 private static final int ANSWER = 2;  // ����

	 private static final int NUMPROBLEMS = 3; // ���� ���� �� 

	 private int state = WAITING;  // ���¸� �����ϴ� ���� (PROBLEM/ANSWER)
	            // �ʱⰪ�� ��� ����..
	 private int currentProblem = 0;  // ���׹�ȣ ���� ����
	            // �Ʒ��� �ΰ��� �迭�� �̿��Ͽ�
	            // ������ ������ Ȯ��.
	 
	 DataBaseClass dbc= new DataBaseClass();
	 
	 
	 // ���� �迭 / ���� �迭
//	 private String[] problems = { "��Ʈ��ũ ó�� ��Ű����?", "�ڹ��� ����ȭ�� �ֽŹ�����?", "���ͳݿ��� ��ǻ�͸� �ĺ��ϴ� �ּҴ�?" };
//	 private String[] answers = { "java.net", "1.8", "IP" };

	 
	 // ----------------------------------------------------------------------------------
	 

	 //QuizServer => main() {
	 //QuizProtocol qp = new QuizProtocol();
	 //qp.process();
	 private QuizDB qdb=null;
	 public QuizProtocol() { //������
		 qdb=new QuizDB("quiz_db"); //�ּ�+�������̸�
		 qdb.connectMySQL();	//���� �޼���
		 qdb.quizInsert();		//QuizProtocol�� String[] ���̺� ����/���� ����
		 qdb.quizSelect();		//���̺���� �����͸� ��ȸ ��
		 //�� ���ڵ带 Quiz ��ü ������ �� ArrayList�� add()
	 }//������ END
	 

	 
	 // ----------------------------------------------------------------------------------
	 
	 /**  ������ �����ϰ� ������ Ȯ�����ִ� �������� ���μ��� �޼���  **/
	 public String process(String theInput) {
	  String theOutput = null;
//	  dbc.qnaNum(question, currentProblem);
	  // �ʱ� ��� ������ ���, client���� ������ ����
	  if (state == WAITING) {
	   // client���� ����
	   theOutput = "��� �����մϴ�(y/n)";
	   state = PROBLEM;
	   
	  // client�� ��� ������ ������ ������ ���� 
	  } else if (state == PROBLEM) {
	   
	   // client�� ���� ������ �ϰڴٰ� "y" �Ǵ� "Y"�� �Է����� ��
	   if (theInput.equalsIgnoreCase("y")) {  // ��ҹ��� ����..
	    theOutput = qdb.quiz_list.get(currentProblem).getQuizAnswer();
	               //problems[currentProblem];  // ��������
	    state = ANSWER;
	    
	   } else { // client�� "n" ,  "N"�� �Է����� ���.
	    state = WAITING;
	    theOutput = "quit";
	   }
	  
	  // ���� ����Ǿ��� ��
	  } else if (state == ANSWER) {
	   if (theInput.equalsIgnoreCase(qdb.quiz_list.get(currentProblem).getQuizAnswer()))
		   							//answers[currentProblem])) {
	    theOutput = "�����Դϴ�. ����Ͻðڽ��ϱ�? (y/n)";
	    state = PROBLEM;
	   } else {
	    state = PROBLEM;
	    theOutput = "�����Դϴ�. ����Ͻðڽ��ϱ�? (y/n)";
	   }
	   
	   currentProblem = (currentProblem + 1) % NUMPROBLEMS;
//	  }
	  return theOutput;
	 }

	} // class END
