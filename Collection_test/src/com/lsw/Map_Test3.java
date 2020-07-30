package com.lsw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_Test3 {

	public static void main(String[] args) {
		
//		List �÷��� ���� ��ҷ� Map �÷����� ����
		List<Map<String, Object>> list = new ArrayList<>();
//		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
//		List �÷��� ����� Ÿ������ Map �÷����� ������ ����Դϴ�.
//		Map �÷����� Ű�� String Ÿ��, ���� Object Ÿ������ �Ͽ���.
		
//		��ü �迭�� ����������, 
//		List �÷����� ��Ұ� Map �÷����̹Ƿ� ��Ҹ� ������ ������
//		Map �÷����� �����Ͽ����Ѵ�.
		
		Map<String, Object> map = new HashMap<>();
		map.put("id", "aaa");		//string ��ü�� ��ȯ�Ǿ� ����
		map.put("pw", "1234");
		map.put("name", "������");
		map.put("age", 20);	//�ڵ� �ڽ̿� ���� Integer ��ü�� ��ȯ�Ǿ� ����
		
		list.add(map);
		
//	put() �޼ҵ�� Map �÷��ǿ� ��Ҹ� �Է��� ����,
//	add() �޼ҵ��  ��Ұ� �Էµ� Map �÷����� List �÷����� ��ҷ� �߰�.
//	"id", "pw", "name", "age"�� ���� �÷��� ����� Ű�� �ȴ�.

		map = new HashMap<>();
		map.put("id", "bbb");
		map.put("pw", "5678");
		map.put("name", "�󸶹�");
		map.put("age", 21);
		list.add(map);
		
		map = new HashMap<>();
		map.put("id", "ccc");
		map.put("pw", "5678");
		map.put("name", "�󸶹�");
		map.put("age", 21);
		list.add(map);
		
//		for-each ���� �̿��Ͽ� ��ü�� ��Ҹ� �ܼ� ȭ�鿡 ���.
//		List �÷����� ��Ұ� Map �÷����̹Ƿ� �����ϴ�.
//		
//		Map Ÿ���� �������� m��
//		list�� �����  Map �÷����� �޾Ƽ� �ܼ� ȭ�鿡 ����Ѵ�.
		
		for(Map<String, Object> m : list) {
			System.out.println(m);		//Map ��ü ���
		}
		
		for(Map<String, Object> m : list) {
			String id = (String) m.get("id");
			String pw = (String) m.get("pw");
			String name = (String) m.get("name");
			int age = (Integer) m.get("age");
			System.out.println(id + ":"+ pw +":"+name +":"+age);
		}
	}

}
