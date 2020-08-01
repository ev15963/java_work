package com.lsw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Test2 {

	public static void main(String[] args) {
//		컬렉션의 요소는 객체이다.
//		List 컬렉션에 Person 클래스를 선언하여 만든 객체를 넣을 수 있다.



//		private 변수에 대한 getter / setter 메서드


		Person p1 = new Person("1", "2", "3");
		Person p2 = new Person("asa","aa","ddd");
		System.out.println(p1); // <= toString(); 생성된 객체의 메모리 번지
		System.out.println(p2); // <= toString();
		// toString() 을 재정의 하지 않았을 경우에는 생성된 객체의 메모리 번지

		List<Person> personList = new ArrayList<Person>();
		
		//add()메소드로 각각 생성한 Person형 타입 객체를 컬랙션 요소에 넣는다.
		
		System.out.println("1--------------------------------");
		
		Person p = new Person("aaa", "1234", "가나다");
		personList.add(p);
		
		p=new Person("bbb", "1234", "라마바");
		personList.add(p);
		
		p=new Person("ccc", "1234", "사아자");
		personList.add(p);
		
		for(int i =0; i< personList.size();i++) {
			Person p3 = personList.get(i);
			System.out.println(p3.getId()); //특정
		}
		
		System.out.println("2-----------------------------");
		
		for(int i=0; i<personList.size();i++) {
			String p4 = personList.get(i).getPw();
			System.out.println(p4);
		}
		
		System.out.println("3------------------------------");
		
		for(int i=0;i<personList.size();i++) {
			System.out.println(personList.get(i).getName()); //toString() 메소드 자동 호출
		}
		
		System.out.println("4-------------------------------");
		
		for(Person per : personList) {
			System.out.println(per); //toString() 메소드 자동 호출
		}
		
		System.out.println("-------------------------------");
				
//		반복자(Iterator)를 사용해서 출력할 수도 있다.
//		iterator() 메소드로 컬렉션을 참조하고 있는 personList 참조 변수의 참조를 가져와
//		Iterator형의 iter 참조 변수에 저장한다.

		Iterator<Person> iter = personList.iterator();
		while(iter.hasNext()){
		    Person pp = iter.next();
		    System.out.println(pp);
		}

//		.hasNext() | 컬렉션의 객체가 남아있는지 여부를 반환하는 메소드
//		.next() | 컬렉션의 요소를 꺼내주는 메소드

//		컬렉션의 제네릭 타입을 Object로 지정할 수 있다.
//		제네릭 타입을 생략해도 Object로 적용된다.

		List list = new ArrayList(); // List<Object> list = new ArrayList<Object>();

//		컬렉션의 요소는 객체이므로,
//		각 add로 추가된 기본 자료형 값들은
//		각 기본 자료형의 객체형인 포장 클래스로 들어가게 되기 때문에 자동 박싱된다.
//
//		그리고 이 List 컬렉션의 요소는
//		상위 클래스인 Object 타입이기 때문에 포장 클래스가 들어가면 업 캐스팅이 된다.

		list.add("문자열");
		list.add(10); // Integer로 자동 박싱
		list.add(3.14); // Double로 자동 박싱
		list.add(true); // Boolean으로 자동 박싱
		list.add(new Person("aaa", "1234", "가나다")); // Object타입으로 upcasting
		System.out.println(list);


		Object obj = list.get(3);
		String s = (String) list.get(0); // 다운 캐스팅
		Person p11 = (Person) list.get(4); // 다운 캐스팅
		System.out.println("list.get(3) : "+obj);	//true
		System.out.println("list.get(0) : "+s);		//문자열
		System.out.println("list.get(4) : "+p11);	//Person [id=aaa, pw=1234, name= 가나다, age= age]


//		.get() | 매개 변수로 받은 인덱스 위치의 요소를 가져오는 메소드
//		add()메소드로 여러타입으로 받은 객체들이 상위 클래스인 
//		Object로 변환되어 업캐스팅 되었기 때문에
//		꺼낼 때 다운 캐스팅으로 꺼낼 수 있다.
//
//		------------------------------------------------------------------------------------------------------------
//
	}

}
