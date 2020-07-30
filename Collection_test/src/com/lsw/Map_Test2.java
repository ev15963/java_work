package com.lsw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Test2 {

	public static void main(String[] args) {
		// ChildŬ������ Map �÷��ǿ� ���� �� �ִ�.
		// Ű�� String, ���� Child���� �ϴ� Map �÷����� ����.

		Map<String, Child> map = new HashMap<String, Child>();
		// Map<String, Child> map = new HashMap<>();
		//
		// �����ڷ� ���� �Է��Ͽ� put �޼ҵ忡 �����Ͽ���,
		// Getter �޼ҵ�� �̿��Ͽ� �Է��� id �ʵ尪�� Ű�� ����.

		Child p = new Child("aaa", "1234", "������", 21);
		map.put(p.getId(), p); // id�� Ű ������ ��

		p = new Child("bbb", "4567", "�󸶹�", 22);
		map.put(p.getId(), p);

		// �Է��� Child ��ü���� �÷��ǿ� �� ����Ǿ� �ִ� ���� Ȯ���� �� �ִ�.
		System.out.println("1"+map);
		//{aaa=Person [id=aaa, pw=1234, name=������, age=21], bbb=Person [id=bbb, pw=4567, name=�󸶹�, age=22]}

		// ���������� �ݺ��ڸ� �̿��Ͽ� ��ü �÷��� ��ҿ� ������ �� �ִ�.

		Set<String> keySet = map.keySet();
		System.out.println("2"+keySet); //[aaa, bbb]

		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			//Person [id=aaa, pw=1234, name=������, age=21]
			//Person [id=bbb, pw=4567, name=�󸶹�, age=22]
			System.out.println("3"+map.get(iter.next())); // toString() �ڵ�ȣ��
		}

		// System.out.println(map.get(iter.next()).getId()); //�̷��� ������ �ȵȴ�.

		while (iter.hasNext()) {
			Child c = map.get(iter.next()); // �ݵ�� ����
			System.out.println("4"+c.getId());
			System.out.println("5"+c.getName());
		}

		// KeySet�޼ҵ带 ȣ���Ͽ� Ű�� set�÷������� �����صΰ�,
		// iterator �޼ҵ�� Ű�� ����ִ� set �÷����� �������� iter�� ����
		//
		// get() �޼ҵ�� �Է¹��� Ű�� �ش��ϴ� ���� ������ �ִµ�,
		// �÷����� ��Ҹ� �����ִ� next() �޼ҵ带 �̿��Ͽ�
		// Ű�� �����ϴ� ������� ��ü �÷��ǿ� ����
//		
//		put() �޼ҵ�� �Է¹��� Ű�� �÷����� �ִ� ���� ���� ���
//		���� �Էµ� ������ ��ü�ȴ�.
		
		map.put("ccc", new Child("ddd", "asasaa", "�Ĵ���", 26)); //����
		
//	remove() �޼ҵ�� �Է¹��� Ű�� ���� �� ��Ҹ� �����Ѵ�.
	
		map.remove("ccc");				//����
		for (String key : keySet) {
			//Person [id=aaa, pw=1234, name=������, age=21]
			//Person [id=bbb, pw=4567, name=�󸶹�, age=22]
			System.out.println("6"+map.get(key));
		}

	}

}
