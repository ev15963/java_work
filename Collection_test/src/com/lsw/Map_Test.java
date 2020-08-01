package com.lsw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map_Test {

	public static void main(String[] args) {
		// 컬렉션 프레임워크 3. Map 컬렉션
		// 객체 : 객체
		// Map 컬렉션은 키와 값 쌍으로 구성되어 있다. key : value
		// *주로 환경 설정과 데이터를 임시저장할 때 가장많이 쓰인다.
		//
		// 키를 이용하여 값을 얻는 자료구조이기 때문에 데이터 검색 효율이 좋다.
		// (키와 값 모두 객체이다.)
		//
		// HashMap 클래스는
		// Map 인터페이스를 구현한 구현 클래스이므로
		// Map 컬렉션을 생성할 때 아래과 같이 생성할 수 있다.

		Map<Integer, String> map = new HashMap<Integer, String>();
		// Map<Integer, String> map = new HashMap<>();

		// Map 컬렉션은
		// 타입 파라미터를 키, 값 둘 모두에 적용하며
		// 모두 생략하면 Object 타입이 된다.
		//
		// 위 코드에서는 키를 Integer형, 값을 String 형으로 적용하였다.
		//
		// **Map 메소드
		// .put | 입력된 키로 입력된 값을 저장하는 메서드

		map.put(0, "가나다"); // 입력된 키는 자동 박싱
		map.put(1, "라마바");
		map.put(3, "차카타");
		map.put(4, "파하갸");
		map.put(5, "냐댜랴");
		System.out.println(map);

		// 이미 Map 컬렉션에 같은 키가 있는 경우에는 값을 대체한다.
		//////////////////////////////////////////////////////////
		map.put(1, "사아자");
		System.out.println(map);

		// 입력된 키는 기본 자료형 int형이 입력되었으나
		// 컬렉션 내에서는 객체, Integer형이므로 자동 박싱되는 경우이다.

		// .size() | 컬렉션의 크기를 리턴

		System.out.println("요소 크기\t: " + map.size());

		// .get() | 입력받은 키에 해당하는 값을 반환

		System.out.println(map.get(4)); // 키를 이용하여 값을 얻음
		System.out.println(map);

		// .keySet() | Map 컬렉션의 키를 Set 컬렉션으로 반환
		// *keySet() 메소드는 Map 인터페이스에 정의되어 있으며,
		// Set형으로 리턴하는 메서드
		//
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet); //[0, 1, 3, 4, 5]

		System.out.println(map.keySet()); //[0, 1, 3, 4, 5]
		//
		// 위 코드에서 키를 저장한 Set 컬렉션인 keySet 참조 변수를 활용하면
		// Map 컬렉션의 전체 요소에 접근할 수 있다.
		//
		//
		// 반복자(Iterator)를 활용하여 Map 컬렉션의 전체 값을 콘솔 화면에 출력할 수 있다.

		
		
		Iterator<Integer> iter = keySet.iterator();
		while (iter.hasNext()) {
			int num = iter.next();
//			System.out.println(iter);
			System.out.println(num);	//0 1 3 4 5
			System.out.println(map.get(num));	
		}
		
//		가나다
//		사아자
//		차카타
//		파하갸
//		냐댜랴

		// .iterator() | 컬렉션의 참조를 Iterator 형 참조 변수에 저장해준다
		// .next() | Iterator의 메소드이며, Iterator 형 참조 변수에 참조된 컬렉션의 요소를 꺼내어 준다.
		//
		// .remove() | 입력받은 키에 해당하는 요소를 삭제한다.
		
		 map.remove(3); // 키 이름
		 System.out.println(map); //{0=가나다, 1=사아자, 4=파하갸, 5=냐댜랴}
		//
		// .clear() | 컬렉션의 모든 요소를 삭제하는 메소드
		// *참조 변수에 null을 대입하는 방법도 있다.

		map.clear();
		System.out.println(map);  //{}

		map = null;
		System.out.println(map); //null

		// -----------------------------------------------------
		// 배열 => 기본데이터를 저장하는 것이 주 목적(원시)
		//
		// 컬렉션 => 객체들을 저장하는 것이 주 목적
		// -----------------------------------------------------

		// ------------------------------------------------------------------------------------------------------------

	}

}
