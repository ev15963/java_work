package com.lsw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Test2 {

	public static void main(String[] args) {
//		�÷����� ��Ҵ� ��ü�̴�.
//		List �÷��ǿ� Person Ŭ������ �����Ͽ� ���� ��ü�� ���� �� �ִ�.



//		private ������ ���� getter / setter �޼���


		Person p1 = new Person("1", "2", "3");
		Person p2 = new Person("asa","aa","ddd");
		System.out.println(p1); // <= toString(); ������ ��ü�� �޸� ����
		System.out.println(p2); // <= toString();
		// toString() �� ������ ���� �ʾ��� ��쿡�� ������ ��ü�� �޸� ����

		List<Person> personList = new ArrayList<Person>();
		
		//add()�޼ҵ�� ���� ������ Person�� Ÿ�� ��ü�� �÷��� ��ҿ� �ִ´�.
		
		System.out.println("1--------------------------------");
		
		Person p = new Person("aaa", "1234", "������");
		personList.add(p);
		
		p=new Person("bbb", "1234", "�󸶹�");
		personList.add(p);
		
		p=new Person("ccc", "1234", "�����");
		personList.add(p);
		
		for(int i =0; i< personList.size();i++) {
			Person p3 = personList.get(i);
			System.out.println(p3.getId()); //Ư��
		}
		
		System.out.println("2-----------------------------");
		
		for(int i=0; i<personList.size();i++) {
			String p4 = personList.get(i).getPw();
			System.out.println(p4);
		}
		
		System.out.println("3------------------------------");
		
		for(int i=0;i<personList.size();i++) {
			System.out.println(personList.get(i).getName()); //toString() �޼ҵ� �ڵ� ȣ��
		}
		
		System.out.println("4-------------------------------");
		
		for(Person per : personList) {
			System.out.println(per); //toString() �޼ҵ� �ڵ� ȣ��
		}
		
		System.out.println("-------------------------------");
				
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
		Person p11 = (Person) list.get(4); // �ٿ� ĳ����
		System.out.println("list.get(3) : "+obj);	//true
		System.out.println("list.get(0) : "+s);		//���ڿ�
		System.out.println("list.get(4) : "+p11);	//Person [id=aaa, pw=1234, name= ������, age= age]


//		.get() | �Ű� ������ ���� �ε��� ��ġ�� ��Ҹ� �������� �޼ҵ�
//		add()�޼ҵ�� ����Ÿ������ ���� ��ü���� ���� Ŭ������ 
//		Object�� ��ȯ�Ǿ� ��ĳ���� �Ǿ��� ������
//		���� �� �ٿ� ĳ�������� ���� �� �ִ�.
//
//		------------------------------------------------------------------------------------------------------------
//
	}

}
