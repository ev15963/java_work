package com.freeflux;

/** 조회된 한 행의 정보를 담는 클래스 **/
public class ObjectClass {

	private int no = 0; // 번호
	private int age = 0; // 나이
	private String job = ""; // 직업
	private String marital = ""; // 결혼여부 (기혼/미혼)
	private String education = ""; // 학력 (unknown:알수없슴 / grad:대학원 / uiv:대학 / high:고등학교)
	private String housing = ""; // 집소유 여부 (yes:보유 / no:없슴 / unknown:알수없슴)
	private String loan = ""; // 대출여부 (yes:있슴 / no:없슴 / unknown:알수없슴)
	private String contact = ""; // 연락 (cellular:스마트폰 / telephone:집전화)
	private String month = ""; // 가입월 (jan:1월 / ... / dec:12월)
	private String day_of_week = ""; // 가입요일 (sun:일요일~sat:토요일)
	private int duration = 0; // 기간 (날짜 일수)

	/** 기본 생성자 **/
	public ObjectClass() {
	}

	/** 아래와 같은 문자열을 전달받아 변수에 대입하는 생성자 **/
	// "1" "18" "student" "single" "unknown" "yes" "no" "cellular" "may" "thu" "183"
	public ObjectClass(String no, String age, String job, String marital, String education, String housing, String loan,
			String contact, String month, String day_of_week, String duration) {
		this.no = Integer.parseInt(no);
		this.age = Integer.parseInt(age);
		this.job = job;
		this.marital = maritalToKor(marital);
		this.education = educationToKor(education);
		this.housing = housingToKor(housing);
		this.loan = loanToKor(loan);
		this.contact = contactToKor(contact);
		this.month = monthToKor(month);
		this.day_of_week = day_of_weekToKor(day_of_week);
		this.duration = Integer.parseInt(duration);
	}

	/** 결혼여부 (기혼/미혼) **/
	private String maritalToKor(String marital) {
		
		return "";
	} // maritalToKor() END

	/** 학력 (unknown:알수없슴 / grad:대학원 / uiv:대학 / high:고등학교) **/
	private String educationToKor(String education) {
		
		return "";
	} // educationToKor() END

	/** 집소유 여부 (yes:보유 / no:없슴 / unknown:알수없슴) **/
	private String housingToKor(String housing) {
		
		return "";
	} // housingToKor() END

	/** 대출여부 (yes:있슴 / no:없슴 / unknown:알수없슴) **/
	private String loanToKor(String loan) {
		
		return "";
	} // loanToKor() END

	/** 연락 (cellular:스마트폰 / telephone:집전화) **/
	private String contactToKor(String contact) {
		
		return "";
	} // contactToKor() END

	/** 가입월 (jan:1월 / ... / dec:12월) **/
	private String monthToKor(String month) {
		
		return "";
	} // String monthToKor() END

	/** 가입요일 (sun:일요일~sat:토요일) **/
	private String day_of_weekToKor(String day_of_week) {
		
		return "";
	} // String day_of_weekToKor() END

	/** 객체 변수값 확인 메서드 **/
	public void variableValues() {
		System.out.println(this.no + "_" + this.age + "_" + this.job + "_" + this.marital + "_" + this.education + "_"
				+ this.housing + "_" + this.loan + "_" + this.contact + "_" + this.month + "_" + this.day_of_week + "_"
				+ this.duration);
	}

	/** 아래 메서드들은 private 변수 접근 메서드들 **/

	public int getNo() {
		return no;
	}

	public int getAge() {
		return age;
	}

	public String getJob() {
		return job;
	}

	public String getMarital() {
		return marital;
	}

	public String getEducation() {
		return education;
	}

	public String getHousing() {
		return housing;
	}

	public String getLoan() {
		return loan;
	}

	public String getContact() {
		return contact;
	}

	public String getMonth() {
		return month;
	}

	public String getDay_of_week() {
		return day_of_week;
	}

	public int getDuration() {
		return duration;
	}

}
