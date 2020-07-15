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
		this.job = burnyuk(job);
		this.marital = maritalToKor(marital);
		this.education = educationToKor(education);
		this.housing = housingToKor(housing);
		this.loan = loanToKor(loan);
		this.contact = contactToKor(contact);
		this.month = monthToKor(month);
		this.day_of_week = day_of_weekToKor(day_of_week);
		this.duration = Integer.parseInt(duration);
	}

	/**
	 * 영어 한글 번역
	 * @return 
	 **/
	public String burnyuk(String eksdj) {
		switch (eksdj) {

		case "student":
			return "학생";
		case "technician":
			return "기술자";
		case "blue-collar":
			return "근로자";
		case "management":
			return "자영업";
		case "self-employed":
			return "경영";
		case "admin":
			return "기술자";
		case "services":
			return "서비스";
		case "entrepreneur":
			return "기업가";
		case "unknown":
			return "알수없슴";
		case "housemaid":
			return "가정부";
		case "unemployed":
			return "무직";
		case "retired":
			return "은퇴";
		}
		return eksdj;
	}

	/** 결혼여부 (기혼/미혼) **/
	private String maritalToKor(String marital) {
		if (marital.equals("single")) {
			return "미혼";
		} else {
			return "기혼";

		}
	} // maritalToKor() END

	/** 학력 (unknown:알수없슴 / grad:대학원 / uiv:대학 / high:고등학교) **/
	private String educationToKor(String education) {
		//
		if (education.equals("grad")) {
			return "대학원";
		} else if (education.equals("uiv")) {
			return "대학";
		} else if (education.equals("high")) {
			return "고등학교";
		} else {
			return "알수없음";
		}

	} // educationToKor() END

	/** 집소유 여부 (yes:보유 / no:없슴 / unknown:알수없슴) **/
	private String housingToKor(String housing) {
		//
		if (housing.equals("yes")) {
			return "보유";
		} else if (housing.equals("no")) {
			return "없음";
		} else {
			return "알수없음";
		}
	} // housingToKor() END

	/** 대출여부 (yes:있슴 / no:없슴 / unknown:알수없슴) **/
	private String loanToKor(String loan) {
		//
		if (loan.equals("yes")) {
			return "보유";
		} else if (housing.equals("no")) {
			return "없음";
		} else {
			return "알수없음";
		}
	} // loanToKor() END

	/** 연락 (cellular:스마트폰 / telephone:집전화) **/
	private String contactToKor(String contact) {
		if (contact.equals("cellular")) {
			return "스마트폰";
		} else {
			return "집전화";
		}
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
		switch (day_of_week) {
		case "sun":
			return "일요일";
		case "mon":
			return "월요일";
		case "tue":
			return "화요일";
		case "wed":
			return "수요일";
		case "thu":
			return "목요일";
		case "fri":
			return "금요일";
		default:
			return "토요일";
		}

	} // String day_of_weekToKor() END

	/** 객체 변수값 확인 메서드 **/
	public void variableValues() {
		System.out.println(this.no + "_" + this.age + "_" + this.job + "_" + this.marital + "_" + this.education + "_"
				+ this.housing + "_" + this.loan + "_" + this.contact + "_" + this.month + "_" + this.day_of_week + "_"
				+ this.duration);
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
