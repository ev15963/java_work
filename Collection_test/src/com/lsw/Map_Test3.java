package com.lsw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_Test3 {

	public static void main(String[] args) {
		
//		List 컬랙션 안의 요소로 Map 컬랙션을 저장
		List<Map<String, Object>> list = new ArrayList<>();
//		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
//		List 컬랙션 요소의 타입으로 Map 컬랙션을 지정한 모습입니다.
//		Map 컬랙션의 키를 String 타입, 값을 Object 타입으로 하였다.
		
//		객체 배열과 마찬가지로, 
//		List 컬랙션의 요소가 Map 컬랙션이므로 요소를 대입할 때마다
//		Map 컬랙션을 생성하여야한다.
		
		Map<String, Object> map = new HashMap<>();
		map.put("id", "aaa");		//string 객체로 변환되어 저장
		map.put("pw", "1234");
		map.put("name", "가나다");
		map.put("age", 20);	//자동 박싱에 의해 Integer 객체로 변환되어 저장
		
		list.add(map);
		
//	put() 메소드로 Map 컬랙션에 요소를 입력한 다음,
//	add() 메소드로  요소가 입력된 Map 컬렉션을 List 컬랙션의 요소로 추가.
//	"id", "pw", "name", "age"가 각각 컬렉션 요소의 키가 된다.

		map = new HashMap<>();
		map.put("id", "bbb");
		map.put("pw", "5678");
		map.put("name", "라마바");
		map.put("age", 21);
		list.add(map);
		
		map = new HashMap<>();
		map.put("id", "ccc");
		map.put("pw", "5678");
		map.put("name", "라마바");
		map.put("age", 21);
		list.add(map);
		
//		for-each 문을 이용하여 객체의 요소를 콘솔 화면에 출력.
//		List 컬랙션의 요소가 Map 컬랙션이므로 가능하다.
//		
//		Map 타입의 참조변수 m이
//		list의 요소의  Map 컬랙션을 받아서 콘솔 화면에 출력한다.
		
		for(Map<String, Object> m : list) {
			System.out.println(m);		//Map 객체 출력
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
