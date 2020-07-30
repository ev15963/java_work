package com.lsw;

import java.util.ArrayList;
import java.util.List;

public class List_Test {

	public static void main(String[] args) {
//		컬렉션 프레임워크 2. List 컬렉션
//
//		ArrayList는 List 인터페이스의 구현 객체이므로
//		List 컬렉션을 생성할 때 이렇게 생성할 수 있다.
//
			List<String> list = new ArrayList<>();
//			*연산자의 우측의 제네릭 타입 파라미터 내용은 생략이 가능하다.
//
//		add() 메소드로 List 컬렉션에 요소를 추가할 수 있다.
//		제네릭 타입 파라미터를 String으로 두었기 때문에
//		문자열만 입력할 수 있다.
//
//		List 컬렉션은 순서가 있는 저장공간으로, 중복 저장이 가능하다.
			
			list.add("가나다");
			list.add("라마바");		
			list.add("사아자");
			list.add("사아자");
//			list.add(123);
			System.out.println("list"+list);

//		add() 메소드로 요소를 추가한 순서대로 콘솔 화면에 출력되는 것을 확인할 수 있다.

			for(int i = 0; i < list.size(); i++) {
			    System.out.println(list.get(i));
			}
			System.out.println("-----------------------------");

			list.add(2, "ABC");
			for (String st : list) {
			    System.out.println(st);
			}

//		.size() | 컬렉션의 크기를 반환하며, 반복문을 통해 컬렉션의 요소에 접근할 수 있다.
//		.get() | 입력받은 위치에 있는 요소를 가져오는 메서드
//
//		------------------------------------------------------------------------------------------------------------

	}

}
