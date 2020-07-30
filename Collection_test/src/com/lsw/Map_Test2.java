package com.lsw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Test2 {

	public static void main(String[] args) {
		// Child클래스를 Map 컬랙션에 넣을 수 있다.
		// 키를 String, 값을 Child으로 하는 Map 컬랙션을 생성.

		Map<String, Child> map = new HashMap<String, Child>();
		// Map<String, Child> map = new HashMap<>();
		//
		// 생성자로 값을 입력하여 put 메소드에 전달하였고,
		// Getter 메소드롤 이용하여 입력한 id 필드값을 키로 설정.

		Child p = new Child("aaa", "1234", "가나다", 21);
		map.put(p.getId(), p); // id를 키 값으로 둠

		p = new Child("bbb", "4567", "라마바", 22);
		map.put(p.getId(), p);

		// 입력한 Child 객체들은 컬렉션에 잘 저장되어 있는 것을 확인할 수 있다.
		System.out.println("1"+map);
		//{aaa=Person [id=aaa, pw=1234, name=가나다, age=21], bbb=Person [id=bbb, pw=4567, name=라마바, age=22]}

		// 마찬가지로 반복자를 이용하여 전체 컬렉션 요소에 접근할 수 있다.

		Set<String> keySet = map.keySet();
		System.out.println("2"+keySet); //[aaa, bbb]

		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			//Person [id=aaa, pw=1234, name=가나다, age=21]
			//Person [id=bbb, pw=4567, name=라마바, age=22]
			System.out.println("3"+map.get(iter.next())); // toString() 자동호출
		}

		// System.out.println(map.get(iter.next()).getId()); //이렇게 꺼내면 안된다.

		while (iter.hasNext()) {
			Child c = map.get(iter.next()); // 반드시 선언
			System.out.println("4"+c.getId());
			System.out.println("5"+c.getName());
		}

		// KeySet메소드를 호출하여 키를 set컬랙션으로 저장해두고,
		// iterator 메소드로 키가 들어있는 set 컬랙션의 참조값을 iter에 참조
		//
		// get() 메소드는 입력받은 키에 해당하는 값을 리턴해 주는데,
		// 컬랙션의 요소를 꺼내주는 next() 메소드를 이용하여
		// 키를 리턴하는 방법으로 전체 컬렉션에 접근
//		
//		put() 메소드로 입력받은 키가 컬렉션이 있는 값과 같은 경우
//		새로 입력된 값으로 대체된다.
		
		map.put("ccc", new Child("ddd", "asasaa", "냐댜랴", 26)); //수정
		
//	remove() 메소드는 입력받은 키를 차아 그 요소를 삭제한다.
	
		map.remove("ccc");				//삭제
		for (String key : keySet) {
			//Person [id=aaa, pw=1234, name=가나다, age=21]
			//Person [id=bbb, pw=4567, name=라마바, age=22]
			System.out.println("6"+map.get(key));
		}

	}

}
