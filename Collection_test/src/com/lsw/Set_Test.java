package com.lsw;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Test {

	public static void main(String[] args) {


//		컬렉션 프레임워크 1. Set 컬렉션
//
//		코드를 작성하다 보면
//		객체를 여러 개 저장하여 필요할 때 불러와서 사용하는 경우가 있는데,
//		간단한 방법으로는 객체 배열을 사용하면 된다.
//
//		하지만 배열은 크기가 고정되어있으며, 
//		배열의 중간 요소가 삭제될 때 중간중간이 비어버리기 때문에
//		빈자리를 체크하여 옮겨주는 코드를 생성해야 하는 등
//		여러가지 애로사항이 발생한다.
//
//		이런 문제점을 해결하기 위하여 
//		자바에서는 객체를 효율적으로 생성하거나 추가, 삭제할 수 있는
//		컬렉션을 인터페이스와 클래스로 정의해놓았다.
//		이들을 컬렉션 프레임워크라고 한다.
//
//		컬렉션은 배열과는 달리 크기가 가변적이며,
//		컬렉션 내의 객체가 삭제되면 자동으로 자리가 옮겨진다.
//		컬렉션 프레임워크에는 Set, List, Map이 있다.
//		Set, List, Map : interface  / *혼자서 객체로 생성 불가능 interface는 '생성자'가 없다. : 상속또한 불가능
//					*interface에 존재는 두 가지만 존재한다. 상수 / 추상메서드
//		따라서 interface는 반드시 구현(implements)를 해야한다.
//
//		List : 인덱스 번호 존재 : 순서
//		Map : 순서 X
//		Set : 값만 들어가므로 인덱스번호(순서) X, 키, X, 중복값 X

//		HashSet은 인터페이스의 구현 클래스이므로 : Set을 구현받은 클래스 따라서 new 연산자로 생성가능
//		Set 컬렉션을 생성할 때 아래와 같은 방식으로 생성한다.

		Set set = new HashSet(); // 업캐스팅
//		*일반적으로 HashSet은 Set으로 받게 되어 있다.

//		set.isEmpty() 메소드
//		컬렉션 내에 요소가 있는지 여부를 boolean형으로 리턴해주는 메소드이다.

//		Set 컬렉션에 요소를 추가
//		add() 메소드로 컬렉션에 요소를 추가할 수 있다.
		set.add("하나"); // add(Object e), 매개 값의 타입이  Object이다.
		set.add('삼');
		set.add('삼'); // 실제 코딩 시 오류는 나지 않으나 저장 불가 * 중복값을 제거할 때 자주사용됨

//		Set 컬렉션을 출력해보면 추가한 순서와 다르게 나타난다.
//		Set 컬렉션은 순서 없는 저장공간이며,
//		중복 저장이 불가능하다는 것을 알 수 있다.
//
//		**Set 메서드
//		.size() 	 | 컬렉션 요소의 개수를 리턴				    | *반환타입 : int
//		.contains()  | 받은 문자열과 같은 내용의 요소가 있는지 여부를 반환 | *반환타입 : boolean
//		.remove( 값 ) | 매개 값으로 받은 문자열과 같은 내용의 요소를 삭제    |
//
//		<String> 은 제네릭 타입 파라미터로,
//		타입을  String만 사용할 수 있도록 고정시키는 역할이다.
//
//		Set 인터페이스는 제네릭 타입이기 때문에 타입 파라미터를 입력해 주는 것이 좋다.
//		(생략 시 Object 타입이 된다.)
//
//		마찬가지로 add 메소드로 컬렉션 요소에 추가하는 것이 가능하지만,
//		String 요소만 추가하는 것이 가능하다.

		Set<String> set2 = new HashSet<String>(); // ... = new HashSet<>();
		set2.add("문자열1");
//		set2.add(123); // String만 가능하다.

//		타입이 고정되었으므로
//		for-each 문으로 요소에 접근할 수 있다.
		for(String s : set2){
		   System.out.println(s); //문자열1
		}

//		컬렉션의 전체 객체를 순차적으로 가져올 때 반복자(iterator)를 사용할 수 있다.
		Iterator<String> iter = set2.iterator(); // new 연산자로 생성x, 기존컬렉션의 메서드로 반환받음
		while(iter.hasNext()) {
		    System.out.println(iter.next()); //문자열1
		}

//		반복자는 Iterator 인터페이스를 구현한 객체이다.
//		iterator 메소드를 호출하면 컬렉션의 참조를 얻을 수 있다.
//		위 코드에서는 컬렉션의 참조를 iter 참조 변수에 저장하였다.
//
//		.hasNext() | 컬렉션 안에 객체가 있는지 여부를 나타내는 메소드
//		.next() | 컬렉션 안의 객체를 하나 가져오는 메소드
//		.clear() | 컬렉션 내부의 모든 데이터를 삭제
//
		set2.clear();
		System.out.println(set2); //[]

		set2 = null;
		System.out.println(set2); //null
//
//		객체에 null을 대입하는 방법도 있는데, 이경우는 컬렉션 객체를 삭제하는 방법이다.



	
	}
	
	
}
