package com.freeflux;

import java.util.ArrayList;

/** ��ü �Խñ� ������ ��� Ŭ���� 
 * @param boardList : ��ü �Խñ� ������ ��� �迭
 * **/
public class DataClass2 {

	//BoardClass[] boardList = new BoardClass[18];
	ArrayList<BoardClass> boardList=new ArrayList<BoardClass>();

	public DataClass2() { // �⺻������
	} // ������ END

	/** �ʱⵥ���͸� ����迭�� �����ϴ� �޼��� **/
	public void initBoards() {
		boardList.add(new BoardClass(11968, "2020 07 08 Ŭ��������������7 (student, takes)", "�豤��", 25));
		boardList.add(new BoardClass(11967, "2020 07 08 Ŭ��������������5 (�а�/�л�)", "������", 62));
		boardList.add(new BoardClass(11965, "2020 07 07 Ŭ���� ���� ������ 4 (�μ�/���)", "������", 60));
		boardList.add(new BoardClass(11966, "2020 07 07 Ŭ���� ���� ������ 4 ", "�����", 34));
		boardList.add(new BoardClass(11964, "2020 07 07 Ŭ���� ���� ������ 3 (����) ", "�����", 65));
		boardList.add(new BoardClass(11963, "2020 07 06 Ŭ���� ���� ������ 2 (�л�) ", "������", 44));
		boardList.add(new BoardClass(11962, "2020 07 06 Ŭ���� ���� ������ (����) ", "���¼�", 48));
		boardList.add(new BoardClass(11961, "2020 07 03 3���� ������ �޼��� ó�� ", "�豤��", 58));
		boardList.add(new BoardClass(11960, "2020 07 03 split() �� Ŭ���� ���� ������", "������", 54));
		boardList.add(new BoardClass(11959, "2020 07 02 ������ 3���� ���� ", "�ڱ���", 92));
		boardList.add(new BoardClass(11958, "2020 07 02 split test ", "������", 53));
		boardList.add(new BoardClass(11957, "2020 07 02 ��� ���������� ", "������", 64));
		boardList.add(new BoardClass(11956, "�ڵ带 �������� �ۼ��ϴ� �� ", "�ڱ���", 43));
		boardList.add(new BoardClass(11955, "���� ���� ��ư� �ڵ��ϴ� ��� ", "�豤��", 59));
		boardList.add(new BoardClass(11954, "2020 07 01 Java Platform Standard Edition 8 Documentation ", "Amor vincit omnia", 29));
		boardList.add(new BoardClass(11640, "2019 01 30 ����, �迭, ��ü, Ŭ���� (���� ���� ���� ���) ", "�ڱ���", 91));
		boardList.add(new BoardClass(11640, "2019 01 30 ����, �迭, ��ü, Ŭ���� (���� ���� ���� ���) ", "�����", 95));
		boardList.add(new BoardClass(11639, "2019 01 30 �⺻ ���� ���� ", "�����", 70));
	}
} // DataClass END
