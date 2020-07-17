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


	}

	/**
	 * 영어 한글 번역
	 * @return 
	 **/
	public String burnyuk(String eksdj) {
		
	}

	/** 결혼여부 (기혼/미혼) **/
	private String maritalToKor(String marital) {
		
	} // maritalToKor() END

	/** 학력 (unknown:알수없슴 / grad:대학원 / uiv:대학 / high:고등학교) **/
	private String educationToKor(String education) {
		
	} // educationToKor() END

	/** 집소유 여부 (yes:보유 / no:없슴 / unknown:알수없슴) **/
	private String housingToKor(String housing) {
		
	} // housingToKor() END

	/** 대출여부 (yes:있슴 / no:없슴 / unknown:알수없슴) **/
	private String loanToKor(String loan) {
		
	} // loanToKor() END

	/** 연락 (cellular:스마트폰 / telephone:집전화) **/
	private String contactToKor(String contact) {
		
	} // contactToKor() END

	/** 가입월 (jan:1월 / ... / dec:12월) **/
	private String monthToKor(String month) {
		//
		switch (month) {
		case "jan":
			return "1월";
		case "feb":
			return "2월";
		case "mar":
			return "3월";
		case "apr":
			return "4월";
		case "may":
			return "5월";
		case "jun":
			return "6월";
		case "jul":
			return "7월";
		case "aug":
			return "8월";
		case "sep":
			return "9월";
		case "oct":
			return "10월";
		case "nov":
			return "11월";
		default:
			return "12월";
		}
	} // String monthToKor() END

	/** 가입요일 (sun:일요일~sat:토요일) **/
	private String day_of_weekToKor(String day_of_week) {
		//
		

	} // String day_of_weekToKor() END

	/** 객체 변수값 확인 메서드 **/
	public void variableValues() {
		
	}

	/** 아래 메서드들은 private 변수 접근 메서드들 **/
	// 직업
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
