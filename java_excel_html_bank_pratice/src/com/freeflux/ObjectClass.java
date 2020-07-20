package com.freeflux;

/** 조회된 한 행의 정보를 담는 클래스 **/
public class ObjectClass {

	private int no = 0;
	private int age = 0;
	private String job = "";
	private String marital = "";
	private String education = "";
	private String housing = "";
	private String loan = "";
	private String contact = "";
	private String month = "";
	private String day_of_week = "";
	private int duration = 0;

	/** 기본 생성자 **/
	public ObjectClass() {
	}

	/** 아래와 같은 문자열을 전달받아 변수에 대입하는 생성자 **/
	// "1" "18" "student" "single" "unknown" "yes" "no" "cellular" "may" "thu" "183"
	public ObjectClass(String no, String age, String job, String marital, String education, String housing, String loan,
			String contact, String month, String day_of_week, String duration) {

		this.no = Integer.parseInt(no);
		this.age = Integer.parseInt(age);
		this.job = burnyuk(job);
		this.marital = maritalToKor(marital);
		this.education = educationToKor(education);
		this.housing = housingToKor(housing);
		this.loan = loanToKor(loan);
		this.contact = contactToKor(contact);
		this.month = monthToKor(month);
		this.day_of_week = day_of_weekToKor(day_of_week);
		this.duration = Integer.parseInt(duration);
System.out.println("testtesttesttesttesttesttest");
	}

	/**
	 * 영어 한글 번역
	 * 
	 * @return
	 **/
	public String burnyuk(String eksdj) {
		switch (eksdj) {

		case "admin":
			return "관리자";
		case "blue-collar":
			return "블루칼라";
		case "entrepreneur":
			return "기업가";
		case "housemaid":
			return "집사";
		case "management":
			return "관리인";
		case "retired":
			return "은퇴자";
		case "self-employed":
			return "자영업자";
		case "services":
			return "사무직";
		case "student":
			return "학생";
		case "technician":
			return "기술자";
		case "unemployed":
			return "취준생";
		default:
			return "몰라";
		}
	}

	/** 결혼여부 (기혼/미혼) **/
	private String maritalToKor(String marital) {
		switch (marital) {
		case "single":
			return "미혼";
		case "married":
			return "기혼";
		default:
			return "이혼";
		}
	} // maritalToKor() END

	/** 학력 (unknown:알수없슴 / grad:대학원 / uiv:대학 / high:고등학교) **/
	private String educationToKor(String education) {
		switch (education) {
		case "unknown" : return "알수 없음";
		case "grad" : return "대학원";
		case "uiv" : return "대학";
		default: return "고등학교";
		}
	} // educationToKor() END

	/** 집소유 여부 (yes:보유 / no:없슴 / unknown:알수없슴) **/

//	case"":return"";

	private String housingToKor(String housing) {
		switch(housing) {
		case "yes" : return "보유";
		case "no" : return "없슴";
		default: return "알수없음";
		}
	} // housingToKor() END

	/** 대출여부 (yes:있슴 / no:없슴 / unknown:알수없슴) **/
	private String loanToKor(String loan) {
		switch(loan) {
		case "yes" : return "보유";
		case "no" : return "없슴";
		default: return "알수없음";
		}
	} // loanToKor() END

	/** 연락 (cellular:스마트폰 / telephone:집전화) **/
	private String contactToKor(String contact) {
		switch(contact) {
		case "cellular" : return "스마트폰";
		default: return "집전화";
		}
	} // contactToKor() END

	/** 가입월 (jan:1월 / ... / dec:12월) **/
	private String monthToKor(String month) {
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
		switch (day_of_week) {
		case "mon" : return "월요일";
		case "tue" : return "화요일";
		case "wed" : return "수요일";
		case "thu" : return "목요일";
		default : return "금요일";
				
		}

	} // String day_of_weekToKor() END

//	this.no = no;
//	this.age = age;
//	this.job = burnyuk(job);
//	this.marital = maritalToKor(marital);
//	this.education = educationToKor(education);
//	this.housing = housingToKor(housing);
//	this.loan = loanToKor(loan);
//	this.contact = contactToKor(contact);
//	this.month = monthToKor(month);
//	this.day_of_week = day_of_weekToKor(day_of_week);
//	this.duration = Integer.parseInt(duration);
	
	/** 객체 변수값 확인 메서드 **/
	public void variableValues() {
		System.out.println(this.no+"_"+this.age);
	}

	/** 아래 메서드들은 private 변수 접근 메서드들 **/
	// 직업
//	private String no = "";
//	private String age = "";
//	private String job = "";
//	private String marital = "";
//	private String education = "";
//	private String housing = "";
//	private String loan = "";
//	private String contact = "";
//	private String month = "";
//	private String day_of_week = "";
//	private int duration = 0;
	
	public int getNo() {
		return no;
	}
	public int getAge() {
		return age;
	}
	public String getJob() {
		return job;
	}
	public String getMarial() {
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
