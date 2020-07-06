package com.lsw;

public class ProfessorClass {
	// ("92001", "590327-1839240", "이태규", 920, "교수", "1997")
	// 이 영역에 선언되는 변수는 클래스으 인스턴스 변수
	// 인스턴스는 클래스가 객체로 생성되는 과정
	// 생성된 객체는 하나의 인스턴스 결과..
	public String n, jumin, name, rank, year;
	public int pay;
	public int age = 0;
	public int jae = 0;

	public ProfessorClass(String no, String j, String n, int p, String r, String y) {

		this.n = no; // 검색속도 빠름 바로 public String가서 찾음
		this.jumin = j;
		this.name = n;
		this.rank = r;
		this.pay = p;
		this.year = y; // 입사년도 -> 재직년수

		this.ageMethod(this.jumin); // 객체생성이 끝날때 age 값을 생성
		this.jaeMethod(this.year);
	} // 생성자 END

	// 주민번호를 이용한 나이계산 메소드
	public void ageMethod(String jumin) {
		String[] ju=jumin.split("-");	//"590327-1839240" 분리
		
		String nFront=ju[0].substring(0,2); //"590327" => "59"
		int temp=Integer.parseInt(nFront); //"59" => 59
		
		String nBack = ju[1].substring(0,1); //"1839240" => "1"
		if(nBack.equals("1")||nBack.equals("2")) {
			this.age=2020-(temp+1900); //1900년대 나이 구하기
		} else {
			this.age=2020-(temp+2000); //2000 년대 나이 구하기
		}
		
		
//		public void age(String s, String s1) { // s : String n1
//			String nfront=s.substring(0,2); //주민 앞자리중 맨처음 2자리
//			int temp=Integer.parseInt(nfront);
//
//			String nback=s1.substring(0,1); //주민 뒷자리중 맨처음 1자리
//			if(nback.equals("1")||nback.equals("2")) {
//				age=2020-(temp+1900);
//			} else {
//				age=2020-(temp+2020);
//			}
//		}
	} // ageMethod() END
	
	public void jaeMethod(String year) {
		
		int y = Integer.parseInt(year);
		this.jae= 2020-y;
	} // jaeMethod() END
} // 클래스 END
