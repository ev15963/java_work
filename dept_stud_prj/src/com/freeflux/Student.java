package com.freeflux;

/** 학생정보 클래스 **/
public class Student {
	public String stu_id="";		// 학번
	public String resident_id="";	// 주민번호
	public String name="";		// 이름
	public int year=0; 				// 학년
	public String address="";		// 주소
	public String dept_id=""; 		// 학과번호
	
	public int age=0;					// 나이
	public char gender='0';		// 성별
	
	//("1292001", "900424-1825409", "김광식", 3, "서울", "920");
	public Student(String s, String r, String n, int y, String a, String d) {
		this.stu_id=s;
		this.resident_id=r;
		this.name=n;
		this.year=y;
		this.address=a;
		this.dept_id=d;
		
		/** 나이와 성별을 구하는 메서드에게 값을 전달하기 위한 분리 작업 **/
		// 주민번호 분리 : "900424-1825409" => "900424" "1825409"
		String[] residents=this.resident_id.split("-");
		String residentFront=residents[0].substring(0,2);	// "900424"=>"90"
		String residentBack=residents[1].substring(0,1);	// "1825409"=>"1"
		
		this.ageMethod(residentFront, residentBack);		// 나이 메서드 호출
		this.genderMethod(residentBack);						// 성별 메서드 호출
	} // 생성자 END

	/** 주민번호를 이용하여 나이를 구하는 메서드 **/
	public void ageMethod(String rFront, String rBack) {
		if(rBack.equals("1") || rBack.equals("2") ) {
			this.age=2020-(Integer.parseInt(rFront)+1900);
		}else {
			this.age=2020-(Integer.parseInt(rFront)+2000);
		}
	} // ageMethod() END
	
	/** 주민번호를 이용하여 성별을 구하는 메서드 **/
	public void genderMethod(String rBack) {
		if(rBack.equals("1") || rBack.equals("3") ) {
			this.gender='M';
		}else {
			this.gender='F';
		}
	} // genderMethod() END
	
} // class END




