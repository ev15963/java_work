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


//		�÷��� �����ӿ�ũ 1. Set �÷���
//
//		�ڵ带 �ۼ��ϴ� ����
//		��ü�� ���� �� �����Ͽ� �ʿ��� �� �ҷ��ͼ� ����ϴ� ��찡 �ִµ�,
//		������ ������δ� ��ü �迭�� ����ϸ� �ȴ�.
//
//		������ �迭�� ũ�Ⱑ �����Ǿ�������, 
//		�迭�� �߰� ��Ұ� ������ �� �߰��߰��� �������� ������
//		���ڸ��� üũ�Ͽ� �Ű��ִ� �ڵ带 �����ؾ� �ϴ� ��
//		�������� �ַλ����� �߻��Ѵ�.
//
//		�̷� �������� �ذ��ϱ� ���Ͽ� 
//		�ڹٿ����� ��ü�� ȿ�������� �����ϰų� �߰�, ������ �� �ִ�
//		�÷����� �������̽��� Ŭ������ �����س��Ҵ�.
//		�̵��� �÷��� �����ӿ�ũ��� �Ѵ�.
//
//		�÷����� �迭���� �޸� ũ�Ⱑ �������̸�,
//		�÷��� ���� ��ü�� �����Ǹ� �ڵ����� �ڸ��� �Ű�����.
//		�÷��� �����ӿ�ũ���� Set, List, Map�� �ִ�.
//		Set, List, Map : interface  / *ȥ�ڼ� ��ü�� ���� �Ұ��� interface�� '������'�� ����. : ��Ӷ��� �Ұ���
//					*interface�� ����� �� ������ �����Ѵ�. ��� / �߻�޼���
//		���� interface�� �ݵ�� ����(implements)�� �ؾ��Ѵ�.
//
//		List : �ε��� ��ȣ ���� : ����
//		Map : ���� X
//		Set : ���� ���Ƿ� �ε�����ȣ(����) X, Ű, X, �ߺ��� X

//		HashSet�� �������̽��� ���� Ŭ�����̹Ƿ� : Set�� �������� Ŭ���� ���� new �����ڷ� ��������
//		Set �÷����� ������ �� �Ʒ��� ���� ������� �����Ѵ�.

			Set set = new HashSet(); // ��ĳ����
//			*�Ϲ������� HashSet�� Set���� �ް� �Ǿ� �ִ�.

//		set.isEmpty() �޼ҵ�
//		�÷��� ���� ��Ұ� �ִ��� ���θ� boolean������ �������ִ� �޼ҵ��̴�.

//		Set �÷��ǿ� ��Ҹ� �߰�
//			add() �޼ҵ�� �÷��ǿ� ��Ҹ� �߰��� �� �ִ�.
			set.add("�ϳ�"); // add(Object e), �Ű� ���� Ÿ����  Object�̴�.
			set.add('��');
			set.add('��'); // ���� �ڵ� �� ������ ���� ������ ���� �Ұ� * �ߺ����� ������ �� ���ֻ���

//		Set �÷����� ����غ��� �߰��� ������ �ٸ��� ��Ÿ����.
//		Set �÷����� ���� ���� ��������̸�,
//		�ߺ� ������ �Ұ����ϴٴ� ���� �� �� �ִ�.
//
//		**Set �޼���
//		.size() | �÷��� ����� ������ ���� | *��ȯŸ�� : int
//		.contains() | ���� ���ڿ��� ���� ������ ��Ұ� �ִ��� ���θ� ��ȯ | *��ȯŸ�� : boolean
//		.remove( �� ) | �Ű� ������ ���� ���ڿ��� ���� ������ ��Ҹ� ���� |
//
//		<String> �� ���׸� Ÿ�� �Ķ���ͷ�,
//		Ÿ����  String�� ����� �� �ֵ��� ������Ű�� �����̴�.
//
//		Set �������̽��� ���׸� Ÿ���̱� ������ Ÿ�� �Ķ���͸� �Է��� �ִ� ���� ����.
//		(���� �� Object Ÿ���� �ȴ�.)
//
//		���������� add �޼ҵ�� �÷��� ��ҿ� �߰��ϴ� ���� ����������,
//		String ��Ҹ� �߰��ϴ� ���� �����ϴ�.

			Set<String> set2 = new HashSet<String>(); // ... = new HashSet<>();
			set2.add("���ڿ�1");
			set2.add(123); // String�� �����ϴ�.

//		Ÿ���� �����Ǿ����Ƿ�
//		for-each ������ ��ҿ� ������ �� �ִ�.
			for(String s : set2){
			   System.out.println(s);
			}

//		�÷����� ��ü ��ü�� ���������� ������ �� �ݺ���(iterator)�� ����� �� �ִ�.
			Iterator<String> iter = set2.iterator(); // new �����ڷ� ����x, �����÷����� �޼���� ��ȯ����
			while(iter.hasNext()) {
			    System.out.println(iter.next());
			}

//		�ݺ��ڴ� Iterator �������̽��� ������ ��ü�̴�.
//		iterator �޼ҵ带 ȣ���ϸ� �÷����� ������ ���� �� �ִ�.
//		�� �ڵ忡���� �÷����� ������ iter ���� ������ �����Ͽ���.
//
//		.hasNext() | �÷��� �ȿ� ��ü�� �ִ��� ���θ� ��Ÿ���� �޼ҵ�
//		.next() | �÷��� ���� ��ü�� �ϳ� �������� �޼ҵ�
//		.clear() | �÷��� ������ ��� �����͸� ����
//
			set2.clear();
			System.out.println(set2);

			set2 = null;
			System.out.println(set2);
//
//		��ü�� null�� �����ϴ� ����� �ִµ�, �̰��� �÷��� ��ü�� �����ϴ� ����̴�.
//
//		------------------------------------------------------------------------------------------------------------

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
			System.out.println(list);

//		add() �޼ҵ�� ��Ҹ� �߰��� ������� �ܼ� ȭ�鿡 ��µǴ� ���� Ȯ���� �� �ִ�.

			for(int i = 0; i < list.size(); i++) {
			    System.out.println(list.get(i));
			}

			list.add(2, "ABC");
			for (String st : list) {
			    System.out.println(st);
			}

//		.size() | �÷����� ũ�⸦ ��ȯ�ϸ�, �ݺ����� ���� �÷����� ��ҿ� ������ �� �ִ�.
//		.get() | �Է¹��� ��ġ�� �ִ� ��Ҹ� �������� �޼���
//
//		------------------------------------------------------------------------------------------------------------
//		�÷����� ��Ҵ� ��ü�̴�.
//		List �÷��ǿ� Person Ŭ������ �����Ͽ� ���� ��ü�� ���� �� �ִ�.

//			Person Ŭ���� �������
			private String id, pw, name;

//			Person Ŭ���� ������
			public Person(String id, String pw, String name) {
			    super();
			    this.id = id;
			    this.pw = pw;
			    this.name = name;
			}

//			private ������ ���� getter / setter �޼���


				Person p1 = new Person();
				Person p2 = new Person("asa","aa","ddd");
				System.out.println(p1); // <= toString(); ������ ��ü�� �޸� ����
				System.out.println(p2); // <= toString();
				// toString() �� ������ ���� �ʾ��� ��쿡�� ������ ��ü�� �޸� ����

//		�ݺ���(Iterator)�� ����ؼ� ����� ���� �ִ�.
//		iterator() �޼ҵ�� �÷����� �����ϰ� �ִ� personList ���� ������ ������ ������
//		Iterator���� iter ���� ������ �����Ѵ�.

			Iterator<Person> iter = personList.iterator();
			while(iter.hasNext()){
			    Person pp = iter.next();
			    System.out.println(pp);
			}

//		.hasNext() | �÷����� ��ü�� �����ִ��� ���θ� ��ȯ�ϴ� �޼ҵ�
//		.next() | �÷����� ��Ҹ� �����ִ� �޼ҵ�

//		�÷����� ���׸� Ÿ���� Object�� ������ �� �ִ�.
//		���׸� Ÿ���� �����ص� Object�� ����ȴ�.

			List list = new ArrayList(); // List<Object> list = new ArrayList<Object>();

//		�÷����� ��Ҵ� ��ü�̹Ƿ�,
//		�� add�� �߰��� �⺻ �ڷ��� ������
//		�� �⺻ �ڷ����� ��ü���� ���� Ŭ������ ���� �Ǳ� ������ �ڵ� �ڽ̵ȴ�.
//
//		�׸��� �� List �÷����� ��Ҵ�
//		���� Ŭ������ Object Ÿ���̱� ������ ���� Ŭ������ ���� �� ĳ������ �ȴ�.

			list.add("���ڿ�");
			list.add(10); // Integer�� �ڵ� �ڽ�
			list.add(3.14); // Double�� �ڵ� �ڽ�
			list.add(true); // Boolean���� �ڵ� �ڽ�
			list.add(new Person("aaa", "1234", "������")); // ObjectŸ������ upcasting
			System.out.println(list);


			Object obj = list.get(3);
			String s = (String) list.get(0); // �ٿ� ĳ����
			Person p1 = (Person) list.get(4); // �ٿ� ĳ����
			System.out.println(obj);
			System.out.println(s);
			System.out.println(p1);

//		.get() | �Ű� ������ ���� �ε��� ��ġ�� ��Ҹ� �������� �޼ҵ�
//		add()�޼ҵ�� ����Ÿ������ ���� ��ü���� ���� Ŭ������ 
//		Object�� ��ȯ�Ǿ� ��ĳ���� �Ǿ��� ������
//		���� �� �ٿ� ĳ�������� ���� �� �ִ�.
//
//		------------------------------------------------------------------------------------------------------------
//
//		�÷��� �����ӿ�ũ 3. Map �÷���
//						       ��ü : ��ü
//		Map �÷����� Ű�� �� ������ �����Ǿ� �ִ�. key : value
//		*�ַ� ȯ�� ������ �����͸� �ӽ������� �� ���帹�� ���δ�.
//
//		Ű�� �̿��Ͽ� ���� ��� �ڷᱸ���̱� ������ ������ �˻� ȿ���� ����.
//		(Ű�� �� ��� ��ü�̴�.)
//
//		HashMap Ŭ������ 
//		Map �������̽��� ������ ���� Ŭ�����̹Ƿ�
//		Map �÷����� ������ �� �Ʒ��� ���� ������ �� �ִ�.

			Map<Integer, String> map = new HashMap<Integer, String>();
			Map<Integer, String> map = new HashMap<>();

//		Map �÷�����
//		Ÿ�� �Ķ���͸� Ű, �� �� ��ο� �����ϸ�
//		��� �����ϸ� Object Ÿ���� �ȴ�.
//
//		�� �ڵ忡���� Ű�� Integer��, ���� String ������ �����Ͽ���.
//
//		**Map �޼ҵ�
//		.put | �Էµ� Ű�� �Էµ� ���� �����ϴ� �޼���

			map.put(0, "������"); // �Էµ� Ű�� �ڵ� �ڽ�
			map.put(1, "�󸶹�");
			map.put(3, "��īŸ");
			map.put(4, "���ϰ�");
			map.put(5, "�Ĵ���");
			System.out.println(map);

//		�̹� Map �÷��ǿ� ���� Ű�� �ִ� ��쿡�� ���� ��ü�Ѵ�.
//////////////////////////////////////////////////////////
			map.put(1,"�����");
			System.out.println(map);

//		�Էµ� Ű�� �⺻ �ڷ��� int���� �ԷµǾ�����
//		�÷��� �������� ��ü, Integer���̹Ƿ� �ڵ� �ڽ̵Ǵ� ����̴�.

//		.size() | �÷����� ũ�⸦ ����

			System.out.println("��� ũ��\t: " + map.size());

//		.get() | �Է¹��� Ű�� �ش��ϴ� ���� ��ȯ

			System.out.println(map.get(4)); // Ű�� �̿��Ͽ� ���� ����
			System.out.println(map);

//		.keySet() | Map �÷����� Ű�� Set �÷������� ��ȯ
//		*keySet() �޼ҵ�� Map �������̽��� ���ǵǾ� ������,
//		 Set������ �����ϴ� �޼���
//			
//			Set<Integer> keySet = map.keySet();
//			System.out.println(keySet);
//			
//			System.out.println(map.keySet());
//
//		�� �ڵ忡�� Ű�� ������ Set �÷����� keySet ���� ������ Ȱ���ϸ�
//		Map �÷����� ��ü ��ҿ� ������ �� �ִ�.
//
//
//		�ݺ���(Iterator)�� Ȱ���Ͽ� Map �÷����� ��ü ���� �ܼ� ȭ�鿡 ����� �� �ִ�.

			Iterator<Integer> iter = keySet.iterator();
			while(iter.hasNext()) {
			    int num = iter.next();
			    System.out.println(map.get(num));
			}

//		.iterator() | �÷����� ������ Iterator �� ���� ������ �������ش�
//		.next() | Iterator�� �޼ҵ��̸�, Iterator �� ���� ������ ������ �÷����� ��Ҹ� ������ �ش�.
//
//		.remove() | �Է¹��� Ű�� �ش��ϴ� ��Ҹ� �����Ѵ�.
//
//			map.remove(3); // Ű �̸�
//			System.out.println(map);
//
//		.clear() | �÷����� ��� ��Ҹ� �����ϴ� �޼ҵ�
//			*���� ������ null�� �����ϴ� ����� �ִ�.

			map.clear();
			System.out.println(map);

			map = null;
			System.out.println(map);

//		-----------------------------------------------------
//		�迭 => �⺻�����͸� �����ϴ� ���� �� ����(����)
//
//		�÷��� => ��ü���� �����ϴ� ���� �� ����
//		-----------------------------------------------------

//		�÷����� ��Ҵ� ��ü�̴�.

//		���̵�, ��й�ȣ, �̸�, ���̸� �޴�  Child Ŭ����

//			Child Ŭ������ ���
			private String id, pw, name;
			private int age;

//			Child Ŭ������ �⺻ ������ Overloading
			public Child(String id, String pw, String name, int age){
			    this.id = id;
			    this.pw = pw;
			    this.name = name;
			    this.age = age;
			}

//			private ����� ���� getter / setter


			//toString() ������
			@Override
			public String toString() {
			    StringBuilder builder = new StringBuilder();

			    builder.append("Person [id=").append(id).append(", pw=")
				.append(pw).append(", name= ").append(name)
				.append(", age= ").append(age).append("]");

			return builder.toString();
			}

//		------------------------------------------------------------------------------------------------------------
	

	
	}
	
	
}
