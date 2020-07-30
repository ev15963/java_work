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
//			*일반적으로 HashSet은 Set으로 받게 되어 있다.

//		set.isEmpty() 메소드
//		컬렉션 내에 요소가 있는지 여부를 boolean형으로 리턴해주는 메소드이다.

//		Set 컬렉션에 요소를 추가
//			add() 메소드로 컬렉션에 요소를 추가할 수 있다.
			set.add("하나"); // add(Object e), 매개 값의 타입이  Object이다.
			set.add('삼');
			set.add('삼'); // 실제 코딩 시 오류는 나지 않으나 저장 불가 * 중복값을 제거할 때 자주사용됨

//		Set 컬렉션을 출력해보면 추가한 순서와 다르게 나타난다.
//		Set 컬렉션은 순서 없는 저장공간이며,
//		중복 저장이 불가능하다는 것을 알 수 있다.
//
//		**Set 메서드
//		.size() | 컬렉션 요소의 개수를 리턴 | *반환타입 : int
//		.contains() | 받은 문자열과 같은 내용의 요소가 있는지 여부를 반환 | *반환타입 : boolean
//		.remove( 값 ) | 매개 값으로 받은 문자열과 같은 내용의 요소를 삭제 |
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
			set2.add(123); // String만 가능하다.

//		타입이 고정되었으므로
//		for-each 문으로 요소에 접근할 수 있다.
			for(String s : set2){
			   System.out.println(s);
			}

//		컬렉션의 전체 객체를 순차적으로 가져올 때 반복자(iterator)를 사용할 수 있다.
			Iterator<String> iter = set2.iterator(); // new 연산자로 생성x, 기존컬렉션의 메서드로 반환받음
			while(iter.hasNext()) {
			    System.out.println(iter.next());
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
			System.out.println(set2);

			set2 = null;
			System.out.println(set2);
//
//		객체에 null을 대입하는 방법도 있는데, 이경우는 컬렉션 객체를 삭제하는 방법이다.
//
//		------------------------------------------------------------------------------------------------------------

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
			System.out.println(list);

//		add() 메소드로 요소를 추가한 순서대로 콘솔 화면에 출력되는 것을 확인할 수 있다.

			for(int i = 0; i < list.size(); i++) {
			    System.out.println(list.get(i));
			}

			list.add(2, "ABC");
			for (String st : list) {
			    System.out.println(st);
			}

//		.size() | 컬렉션의 크기를 반환하며, 반복문을 통해 컬렉션의 요소에 접근할 수 있다.
//		.get() | 입력받은 위치에 있는 요소를 가져오는 메서드
//
//		------------------------------------------------------------------------------------------------------------
//		컬렉션의 요소는 객체이다.
//		List 컬렉션에 Person 클래스를 선언하여 만든 객체를 넣을 수 있다.

//			Person 클래스 멤버변수
			private String id, pw, name;

//			Person 클래스 생성자
			public Person(String id, String pw, String name) {
			    super();
			    this.id = id;
			    this.pw = pw;
			    this.name = name;
			}

//			private 변수에 대한 getter / setter 메서드


				Person p1 = new Person();
				Person p2 = new Person("asa","aa","ddd");
				System.out.println(p1); // <= toString(); 생성된 객체의 메모리 번지
				System.out.println(p2); // <= toString();
				// toString() 을 재정의 하지 않았을 경우에는 생성된 객체의 메모리 번지

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
			Person p1 = (Person) list.get(4); // 다운 캐스팅
			System.out.println(obj);
			System.out.println(s);
			System.out.println(p1);

//		.get() | 매개 변수로 받은 인덱스 위치의 요소를 가져오는 메소드
//		add()메소드로 여러타입으로 받은 객체들이 상위 클래스인 
//		Object로 변환되어 업캐스팅 되었기 때문에
//		꺼낼 때 다운 캐스팅으로 꺼낼 수 있다.
//
//		------------------------------------------------------------------------------------------------------------
//
//		컬렉션 프레임워크 3. Map 컬렉션
//						       객체 : 객체
//		Map 컬렉션은 키와 값 쌍으로 구성되어 있다. key : value
//		*주로 환경 설정과 데이터를 임시저장할 때 가장많이 쓰인다.
//
//		키를 이용하여 값을 얻는 자료구조이기 때문에 데이터 검색 효율이 좋다.
//		(키와 값 모두 객체이다.)
//
//		HashMap 클래스는 
//		Map 인터페이스를 구현한 구현 클래스이므로
//		Map 컬렉션을 생성할 때 아래과 같이 생성할 수 있다.

			Map<Integer, String> map = new HashMap<Integer, String>();
			Map<Integer, String> map = new HashMap<>();

//		Map 컬렉션은
//		타입 파라미터를 키, 값 둘 모두에 적용하며
//		모두 생략하면 Object 타입이 된다.
//
//		위 코드에서는 키를 Integer형, 값을 String 형으로 적용하였다.
//
//		**Map 메소드
//		.put | 입력된 키로 입력된 값을 저장하는 메서드

			map.put(0, "가나다"); // 입력된 키는 자동 박싱
			map.put(1, "라마바");
			map.put(3, "차카타");
			map.put(4, "파하갸");
			map.put(5, "냐댜랴");
			System.out.println(map);

//		이미 Map 컬렉션에 같은 키가 있는 경우에는 값을 대체한다.
//////////////////////////////////////////////////////////
			map.put(1,"사아자");
			System.out.println(map);

//		입력된 키는 기본 자료형 int형이 입력되었으나
//		컬렉션 내에서는 객체, Integer형이므로 자동 박싱되는 경우이다.

//		.size() | 컬렉션의 크기를 리턴

			System.out.println("요소 크기\t: " + map.size());

//		.get() | 입력받은 키에 해당하는 값을 반환

			System.out.println(map.get(4)); // 키를 이용하여 값을 얻음
			System.out.println(map);

//		.keySet() | Map 컬렉션의 키를 Set 컬렉션으로 반환
//		*keySet() 메소드는 Map 인터페이스에 정의되어 있으며,
//		 Set형으로 리턴하는 메서드
//			
//			Set<Integer> keySet = map.keySet();
//			System.out.println(keySet);
//			
//			System.out.println(map.keySet());
//
//		위 코드에서 키를 저장한 Set 컬렉션인 keySet 참조 변수를 활용하면
//		Map 컬렉션의 전체 요소에 접근할 수 있다.
//
//
//		반복자(Iterator)를 활용하여 Map 컬렉션의 전체 값을 콘솔 화면에 출력할 수 있다.

			Iterator<Integer> iter = keySet.iterator();
			while(iter.hasNext()) {
			    int num = iter.next();
			    System.out.println(map.get(num));
			}

//		.iterator() | 컬렉션의 참조를 Iterator 형 참조 변수에 저장해준다
//		.next() | Iterator의 메소드이며, Iterator 형 참조 변수에 참조된 컬렉션의 요소를 꺼내어 준다.
//
//		.remove() | 입력받은 키에 해당하는 요소를 삭제한다.
//
//			map.remove(3); // 키 이름
//			System.out.println(map);
//
//		.clear() | 컬렉션의 모든 요소를 삭제하는 메소드
//			*참조 변수에 null을 대입하는 방법도 있다.

			map.clear();
			System.out.println(map);

			map = null;
			System.out.println(map);

//		-----------------------------------------------------
//		배열 => 기본데이터를 저장하는 것이 주 목적(원시)
//
//		컬렉션 => 객체들을 저장하는 것이 주 목적
//		-----------------------------------------------------

//		컬렉션의 요소는 객체이다.

//		아이디, 비밀번호, 이름, 나이를 받는  Child 클래스

//			Child 클래스의 멤버
			private String id, pw, name;
			private int age;

//			Child 클래스의 기본 생성자 Overloading
			public Child(String id, String pw, String name, int age){
			    this.id = id;
			    this.pw = pw;
			    this.name = name;
			    this.age = age;
			}

//			private 멤버에 대한 getter / setter


			//toString() 재정의
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
