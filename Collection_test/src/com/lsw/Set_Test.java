package com.lsw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;

public class Set_Test {

	public static void main(String[] args) {

		Set set = new HashSet();
		
		if(set.isEmpty()) {
			System.out.println("��Ұ� ����");
		}
		
		set.add("�ϳ�"); // add(Object e), �Ű� ���� Ÿ���� Object�̴�.
		set.add('��');
		set.add('��');
		
		System.out.println("��Ұ���\t: "+ set.size());
		if(set.contains("�ϳ�")) {
			System.out.println("\"�ϳ�\" ��� ����");
		}
		
		set.remove("�ϳ�");
		System.out.println(set);
		
		
		Set<String> set2 = new HashSet<String>(); 
		set2.add("���ڿ� 1");
//		set2.add(123); //string�� ����
		
		for(String s: set2) {
			System.out.println(s);
		}
		
		List<String> list = new ArrayList<String>();
			list.add("������");
			list.add("�󸶹�");
			list.add("�����");
			list.add("�����");
			System.out.println(list);
			
			for(int i=0; i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
			System.out.println("----------------------------"); //�� �ڵ�� �����ϱ� ����
			list.add(2, "ABC");
			for(String st : list) {
				System.out.println(st);
			}
	

			private String id, pw, name="";

//			public Person(String id, String pw, String name) {
//						super();
//						this.id=id;
//						this.pw=pw;
//						this.name=name;
//					}

//			public String toString() {
//				StringBuilder builder = new StringBuilder();

				// builder.append(" ")
				// }
//			}
			
//			�ݺ��� �ȿ����� get()�޼ҵ带 �̿��Ͽ�����,
//			toString() �޼ҵ带 �������̵��Ͽ� �ܼ� ȭ�鿡 ǥ���� �� �ִ�.
			
			for (int i=0; i< personList.size(); i++) {
				Person p1 = personList.get(i);
				System.out.println(p1); //toString() �޼ҵ� �ڵ� ȣ��
			}
			
			for (Person per : personList) {
				System.out.println(per); //toString() �޼ҵ� �ڵ� ȣ��
			}
			////////////////////////////////////////////
			
			for (int i=0; i<personList.size();i++) {
//				Person p1 = personList.get(i);
//				System.out.println(p1.getName()); //Ư�� ������ ����
				Person p1 = personList.get(i).getName();
			}
			
			for(int i=0; i<personList.size();i++) {
				String p1 = personList.get(i).getName(); //Ư�� ������ ����
				System.out.println(p1);
			}
			
			for (Person per: personList) {
				System.out.println(per.getName()); //Ư�� ���� �� ����
			}

//			�ݺ���(Iterator)�� ����ؼ� ����� ���� �ִ�.
//			iterator() �޼ҵ��
//			�÷����� �����ϰ� �ִ� personlist ���� ������ ������ ������
//			Iterator���� iter ���� ������ �����Ѵ�.
			
				Iterator<Person> iter = personList.iterator();
				while(iter.hasNest()) {
					Person pp = iter.next();
					System.out.println(pp);
				}
				
//			hasNext() �޼ҵ�� �÷��ǿ� ��ü�� �����ִ��� ���θ� �����ϴ� �޼ҵ��̸�,
		//	
//			next() �޼ҵ�� �÷����� ��Ҹ� �����ִ� �޼ҵ��̴�.
				
//			�÷����� ���׸� Ÿ���� Object�� ������ �� �ִ�.
//			���׸� Ÿ���� �����ص� Object�� ����ȴ�.
				
				List list new ArrayList(); //List<Object>list new ArrayList<Object>();
				
//			�÷����� ��Ҵ� ��ü�̹Ƿ�,
//			�� add�� �߰��� �⺻ �ڷ��� ������ �� �⺻ �ڷ����� ��ü���� ���� Ŭ������ ���� �Ǳ� ������ �ڵ� �ڽ̵ȴ�.
		//	
//			�׸��� �� List �÷��� ��Ҵ� 
//			���� Ŭ������ Object Ÿ���̱� ������ ���� Ŭ������ ���� ��ĳ������ �ȴ�.
			
				list.add("���ڿ�");
				list.add(10); //Integer�� �ڵ��ڽ�
				list.add(3.14); //Double�� �ڵ��ڽ�
				list.add(true);//Boolean���� �ڵ��ڽ�
				list.add(new Person("aaa", "1234", "������")); //ObjectŸ������ upcasting
				System.out.println(list);
				
				Object obj  = list.get(3);
				String s = (String) list.get(0); //�ٿ�ĳ����
				Person p1 = (Person) list.get(4); //�ٿ�ĳ����
				System.out.println(obj);
				System.out.println(s);
				System.out.println(p1);
				
//			get() �޼ҵ�� �Ű� ������ ���� �ε��� ��ġ�� ��Ҹ� �������� �޼ҵ��̴�.
			
			////////////////////////////////
			
			
//			�÷��� �����ӿ�ũ 3. Map �÷���
		//	
//			Map �÷����� Ű�� �� ������ �������ִ�.
//			Ű�� �̿��Ͽ� ���� ��� �ڷᱸ���̱� ������ ������ �˻� ȿ���� ����.(Ű�� �� ��� ��ü�̴�.)
		//	
//			HashMapŬ������
//			Map �������̽��� ������ ���� Ŭ�����̹Ƿ�
//			Map �÷����� ������ �� �Ʒ��� ���� ������ �� �ִ�.
			
			Map<Integer, String> map = new HashMap<Integer, String>();
			Map<Integer, String> map2 = new HashMap<>();
			
//			Map�÷�����
//			Ÿ�� �ĸ����͸� Ű, �� �� ��ο� �����ϸ�
//			��� �����ϸ� Object Ÿ���� �ȴ�.
		//	
//			�� �ڵ忡���� Ű�� Interger��, ���� String������ �����Ͽ���.
			
//			put()�޼ҵ��
//			�Էµ� Ű�� �Էµ� ���� �����ϴ� �޼ҵ��̴�.
		//	
			map.put(0, "������"); //�Էµ� Ű�� �ڵ� �ڽ�
			map.put(1, "�󸶹�");
			map.put(3, "��īŸ");
			map.put(4, "���ϰ�");
			map.put(3, "�Ĵ���");
			System.out.println(map);
			
//			�̹� Map�÷��ǿ� ���� Ű�� �ִ� ��쿡�� ���� ��ü�Ѵ�.
			
			map.put(1, "�����");
			System.out.println(map);
			
//			�Էµ� Ű�� �⺻ �ڷ���  int���� �ԷµǾ�����
//			�÷��� �������� ��ü, Integer���̹Ƿ� �ڵ� �ڽ̵Ǵ� ����̴�.
//			set�� �ߺ� ���� ���� map�� �ߺ� Ű�� ����.
			
//			size() �޼ҵ�� �÷����� ũ�⸦ �����ϸ�, 
			System.out.println("��� ũ��\t: "+ map.size());
			
//			get() �޼ҵ�� �Է¹��� Ű�� �ش��ϴ� ���� �������ش�.
			
			System.out.println(map.get(4)); //Ű�� �̿��Ͽ� ���� ���� get(key ��);
			System.out.println(map);
			
//			keySet() �޼ҵ��
//			Map �÷����� Ű�� Set �÷������� �������ش�.
			
			Set<Integer> keySet = map.keySet();
			System.out.println(map.keySet());
			
//			�� �ڵ忡�� Ű�� ������ Set �÷����� KeySet ���� ������ Ȱ���ϸ�
//			Map �÷����� ��ü ��ҿ� ������ �� �ִ�.
		//	
//			#keySet() �޼ҵ�� Map �������̽��� ���ǵǾ� ������,
//			Set������ �����ϴ� �޼ҵ��̴�.
			
//			�ݺ���(Iterator)�� Ȱ���Ͽ�
//			Map �÷����� ��ü ���� �ܼ� ȭ�鿡 ����� �� �ִ�.
			
			Iterator<Integer> iter = keySet.iterator();
			while (iter.hasNext()) {
				int num = iter.next();
				System.out.println(map.get(num));
			}
			
//			iterator() �޼ҵ��
//			�÷����� ������ iterator �� ���� ������ �������ش�.
		//	
//			next()�޼ҵ��
//			Iterator�� �޼ҵ��̸�
//			Iterator �� ���������� ������ �÷����� ��Ҹ� �����ش�.
			
//			remove() �޼ҵ�� �Է¹��� Ű�� �ش��ϴ� ��Ҹ� �����Ѵ�.
			
			map.remove(3); //Ű �̸�
			System.out.println(map);
			
//			clear() �޼ҵ�� �÷����� ��� ��Ҹ� �����ϴ� �޼ҵ��̸� �ƿ� ���� ������ null�� �����ϴ� ����� �ִ�.
			
			map.clear();
			System.out.println(map);
			
			map=null;
			System.out.println(map);
			
			//�迭 => �ַ� �⺻������ (����) 11/ 0.2/ true
			
			//�÷��� => ��ü���� �����ϴ� ����
//			Intger 10
//			Float 0.2
			
	
	
	}
	
	
}
