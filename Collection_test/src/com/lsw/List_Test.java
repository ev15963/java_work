package com.lsw;

import java.util.ArrayList;
import java.util.List;

public class List_Test {

	public static void main(String[] args) {
//		�÷��� �����ӿ�ũ 2. List �÷���
//
//		ArrayList�� List �������̽��� ���� ��ü�̹Ƿ�
//		List �÷����� ������ �� �̷��� ������ �� �ִ�.
//
			List<String> list = new ArrayList<>();
//			*�������� ������ ���׸� Ÿ�� �Ķ���� ������ ������ �����ϴ�.
//
//		add() �޼ҵ�� List �÷��ǿ� ��Ҹ� �߰��� �� �ִ�.
//		���׸� Ÿ�� �Ķ���͸� String���� �ξ��� ������
//		���ڿ��� �Է��� �� �ִ�.
//
//		List �÷����� ������ �ִ� �����������, �ߺ� ������ �����ϴ�.
			
			list.add("������");
			list.add("�󸶹�");		
			list.add("�����");
			list.add("�����");
//			list.add(123);
			System.out.println("list"+list);

//		add() �޼ҵ�� ��Ҹ� �߰��� ������� �ܼ� ȭ�鿡 ��µǴ� ���� Ȯ���� �� �ִ�.

			for(int i = 0; i < list.size(); i++) {
			    System.out.println(list.get(i));
			}
			System.out.println("-----------------------------");

			list.add(2, "ABC");
			for (String st : list) {
			    System.out.println(st);
			}

//		.size() | �÷����� ũ�⸦ ��ȯ�ϸ�, �ݺ����� ���� �÷����� ��ҿ� ������ �� �ִ�.
//		.get() | �Է¹��� ��ġ�� �ִ� ��Ҹ� �������� �޼���
//
//		------------------------------------------------------------------------------------------------------------

	}

}
