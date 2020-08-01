package com.lsw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Test {

	public static void main(String[] args) {
		// �÷��� �����ӿ�ũ 3. Map �÷���
		// ��ü : ��ü
		// Map �÷����� Ű�� �� ������ �����Ǿ� �ִ�. key : value
		// *�ַ� ȯ�� ������ �����͸� �ӽ������� �� ���帹�� ���δ�.
		//
		// Ű�� �̿��Ͽ� ���� ��� �ڷᱸ���̱� ������ ������ �˻� ȿ���� ����.
		// (Ű�� �� ��� ��ü�̴�.)
		//
		// HashMap Ŭ������
		// Map �������̽��� ������ ���� Ŭ�����̹Ƿ�
		// Map �÷����� ������ �� �Ʒ��� ���� ������ �� �ִ�.

		Map<Integer, String> map = new HashMap<Integer, String>();
		// Map<Integer, String> map = new HashMap<>();

		// Map �÷�����
		// Ÿ�� �Ķ���͸� Ű, �� �� ��ο� �����ϸ�
		// ��� �����ϸ� Object Ÿ���� �ȴ�.
		//
		// �� �ڵ忡���� Ű�� Integer��, ���� String ������ �����Ͽ���.
		//
		// **Map �޼ҵ�
		// .put | �Էµ� Ű�� �Էµ� ���� �����ϴ� �޼���

		map.put(0, "������"); // �Էµ� Ű�� �ڵ� �ڽ�
		map.put(1, "�󸶹�");
		map.put(3, "��īŸ");
		map.put(4, "���ϰ�");
		map.put(5, "�Ĵ���");
		System.out.println(map);

		// �̹� Map �÷��ǿ� ���� Ű�� �ִ� ��쿡�� ���� ��ü�Ѵ�.
		//////////////////////////////////////////////////////////
		map.put(1, "�����");
		System.out.println(map);

		// �Էµ� Ű�� �⺻ �ڷ��� int���� �ԷµǾ�����
		// �÷��� �������� ��ü, Integer���̹Ƿ� �ڵ� �ڽ̵Ǵ� ����̴�.

		// .size() | �÷����� ũ�⸦ ����

		System.out.println("��� ũ��\t: " + map.size());

		// .get() | �Է¹��� Ű�� �ش��ϴ� ���� ��ȯ

		System.out.println(map.get(4)); // Ű�� �̿��Ͽ� ���� ����
		System.out.println(map);

		// .keySet() | Map �÷����� Ű�� Set �÷������� ��ȯ
		// *keySet() �޼ҵ�� Map �������̽��� ���ǵǾ� ������,
		// Set������ �����ϴ� �޼���
		//
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet); //[0, 1, 3, 4, 5]

		System.out.println(map.keySet()); //[0, 1, 3, 4, 5]
		//
		// �� �ڵ忡�� Ű�� ������ Set �÷����� keySet ���� ������ Ȱ���ϸ�
		// Map �÷����� ��ü ��ҿ� ������ �� �ִ�.
		//
		//
		// �ݺ���(Iterator)�� Ȱ���Ͽ� Map �÷����� ��ü ���� �ܼ� ȭ�鿡 ����� �� �ִ�.

		
		
		Iterator<Integer> iter = keySet.iterator();
		while (iter.hasNext()) {
			int num = iter.next();
//			System.out.println(iter);
			System.out.println(num);	//0 1 3 4 5
			System.out.println(map.get(num));	
		}
		
//		������
//		�����
//		��īŸ
//		���ϰ�
//		�Ĵ���

		// .iterator() | �÷����� ������ Iterator �� ���� ������ �������ش�
		// .next() | Iterator�� �޼ҵ��̸�, Iterator �� ���� ������ ������ �÷����� ��Ҹ� ������ �ش�.
		//
		// .remove() | �Է¹��� Ű�� �ش��ϴ� ��Ҹ� �����Ѵ�.
		
		 map.remove(3); // Ű �̸�
		 System.out.println(map); //{0=������, 1=�����, 4=���ϰ�, 5=�Ĵ���}
		//
		// .clear() | �÷����� ��� ��Ҹ� �����ϴ� �޼ҵ�
		// *���� ������ null�� �����ϴ� ����� �ִ�.

		map.clear();
		System.out.println(map);  //{}

		map = null;
		System.out.println(map); //null

		// -----------------------------------------------------
		// �迭 => �⺻�����͸� �����ϴ� ���� �� ����(����)
		//
		// �÷��� => ��ü���� �����ϴ� ���� �� ����
		// -----------------------------------------------------

		// ------------------------------------------------------------------------------------------------------------

	}

}
