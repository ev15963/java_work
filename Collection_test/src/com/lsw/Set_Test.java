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
			System.out.println("요소가 없음");
		}
		
		set.add("하나"); // add(Object e), 매개 값의 타입이 Object이다.
		set.add('삼');
		set.add('삼');
		
		System.out.println("요소개수\t: "+ set.size());
		if(set.contains("하나")) {
			System.out.println("\"하나\" 요소 있음");
		}
		
		set.remove("하나");
		System.out.println(set);
		
		
		Set<String> set2 = new HashSet<String>(); 
		set2.add("문자열 1");
//		set2.add(123); //string만 가능
		
		for(String s: set2) {
			System.out.println(s);
		}
		
		List<String> list = new ArrayList<String>();
			list.add("가나다");
			list.add("라마바");
			list.add("사아자");
			list.add("사아자");
			System.out.println(list);
			
			for(int i=0; i<list.size();i++) {
				System.out.println(list.get(i));
			}
			
			System.out.println("----------------------------"); //위 코드와 구분하기 위해
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
			
//			반복문 안에서는 get()메소드를 이용하였으며,
//			toString() 메소드를 오버라이딩하여 콘솔 화면에 표현할 수 있다.
			
			for (int i=0; i< personList.size(); i++) {
				Person p1 = personList.get(i);
				System.out.println(p1); //toString() 메소드 자동 호출
			}
			
			for (Person per : personList) {
				System.out.println(per); //toString() 메소드 자동 호출
			}
			////////////////////////////////////////////
			
			for (int i=0; i<personList.size();i++) {
//				Person p1 = personList.get(i);
//				System.out.println(p1.getName()); //특정 변수값 추출
				Person p1 = personList.get(i).getName();
			}
			
			for(int i=0; i<personList.size();i++) {
				String p1 = personList.get(i).getName(); //특정 변수값 추출
				System.out.println(p1);
			}
			
			for (Person per: personList) {
				System.out.println(per.getName()); //특정 변수 값 추출
			}

//			반복자(Iterator)를 사용해서 출력할 수도 있다.
//			iterator() 메소드로
//			컬랙션을 참조하고 있는 personlist 참조 변수의 참조를 가져와
//			Iterator형의 iter 참조 변수에 저장한다.
			
				Iterator<Person> iter = personList.iterator();
				while(iter.hasNest()) {
					Person pp = iter.next();
					System.out.println(pp);
				}
				
//			hasNext() 메소드는 컬렉션에 객체가 남아있는지 여부를 리턴하는 메소드이며,
		//	
//			next() 메소드는 컬렉션의 요소를 꺼내주는 메소드이다.
				
//			컬랙션의 제네릭 타입을 Object로 지정할 수 있다.
//			제네릭 타입을 생략해도 Object로 적용된다.
				
				List list new ArrayList(); //List<Object>list new ArrayList<Object>();
				
//			컬랙션의 요소는 객체이므로,
//			각 add로 추가된 기본 자료형 값들은 각 기본 자료형의 객체형인 포장 클래스로 들어가게 되기 때문에 자동 박싱된다.
		//	
//			그리고 이 List 컬랙션 요소는 
//			상위 클래스인 Object 타입이기 때문에 포장 클래스가 들어가면 업캐스팅이 된다.
			
				list.add("문자열");
				list.add(10); //Integer로 자동박싱
				list.add(3.14); //Double로 자동박싱
				list.add(true);//Boolean으로 자동박싱
				list.add(new Person("aaa", "1234", "가나다")); //Object타입으로 upcasting
				System.out.println(list);
				
				Object obj  = list.get(3);
				String s = (String) list.get(0); //다운캐스팅
				Person p1 = (Person) list.get(4); //다운캐스팅
				System.out.println(obj);
				System.out.println(s);
				System.out.println(p1);
				
//			get() 메소드는 매개 변수로 받은 인덱스 위치의 요소를 가져오는 메소드이다.
			
			////////////////////////////////
			
			
//			컬랙션 프래임워크 3. Map 컬랙션
		//	
//			Map 컬랙션은 키와 값 쌍으로 구성되있다.
//			키를 이용하여 값을 얻는 자료구조이기 때문에 데이터 검색 효율이 좋다.(키와 값 모두 객체이다.)
		//	
//			HashMap클래스는
//			Map 인터페이스를 구현한 구현 클래스이므로
//			Map 컬렉션을 생생할 때 아래와 같이 생성할 수 있다.
			
			Map<Integer, String> map = new HashMap<Integer, String>();
			Map<Integer, String> map2 = new HashMap<>();
			
//			Map컬랙션은
//			타입 파리미터를 키, 값 둘 모두에 적용하며
//			모두 생략하면 Object 타입이 된다.
		//	
//			위 코드에서는 키를 Interger형, 값을 String형으로 적용하였다.
			
//			put()메소드는
//			입력된 키로 입력된 값을 저장하는 메소드이다.
		//	
			map.put(0, "가나다"); //입력된 키는 자동 박싱
			map.put(1, "라마바");
			map.put(3, "차카타");
			map.put(4, "파하갸");
			map.put(3, "냐댜랴");
			System.out.println(map);
			
//			이미 Map컬랙션에 같은 키가 있는 경우에는 값을 대체한다.
			
			map.put(1, "사아자");
			System.out.println(map);
			
//			입력된 키는 기본 자료형  int형이 입력되었으나
//			컬랙션 내에서는 객체, Integer형이므로 자동 박싱되는 경우이다.
//			set은 중복 값이 없고 map은 중복 키가 없다.
			
//			size() 메소드는 컬랙션의 크기를 리턴하며, 
			System.out.println("요소 크기\t: "+ map.size());
			
//			get() 메소드는 입력받은 키에 해당하는 값을 리턴해준다.
			
			System.out.println(map.get(4)); //키를 이용하여 값을 얻음 get(key 값);
			System.out.println(map);
			
//			keySet() 메소드는
//			Map 컬랙션의 키를 Set 컬렉션으로 리턴해준다.
			
			Set<Integer> keySet = map.keySet();
			System.out.println(map.keySet());
			
//			위 코드에서 키를 저장한 Set 컬랙션인 KeySet 참조 변수를 활용하면
//			Map 컬렉션의 전체 요소에 접근할 수 있다.
		//	
//			#keySet() 메소드는 Map 인터페이스에 정의되어 있으며,
//			Set형으로 리턴하는 메소드이다.
			
//			반복자(Iterator)를 활용하여
//			Map 컬랙션의 전체 값을 콘솔 화면에 출력할 수 있다.
			
			Iterator<Integer> iter = keySet.iterator();
			while (iter.hasNext()) {
				int num = iter.next();
				System.out.println(map.get(num));
			}
			
//			iterator() 메소드는
//			컬랙션의 참조를 iterator 형 참조 변수에 저장해준다.
		//	
//			next()메소드는
//			Iterator의 메소드이며
//			Iterator 형 참조변수에 참조된 컬렉션의 요소를 꺼내준다.
			
//			remove() 메소드는 입력받은 키에 해당하는 요소를 삭제한다.
			
			map.remove(3); //키 이름
			System.out.println(map);
			
//			clear() 메소드는 컬랙션의 모든 요소를 삭제하는 메소드이며 아예 참조 변수에 null을 대입하는 방법도 있다.
			
			map.clear();
			System.out.println(map);
			
			map=null;
			System.out.println(map);
			
			//배열 => 주로 기본데이터 (원시) 11/ 0.2/ true
			
			//컬랙션 => 객체들을 저장하는 목적
//			Intger 10
//			Float 0.2
			
	
	
	}
	
	
}
