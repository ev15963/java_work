package com.freeflux;

/** ��ȸ�� �� ���� ������ ��� Ŭ���� **/
public class ObjectClass {

	private int no = 0; // ��ȣ
	private int age = 0; // ����
	private String job = ""; // ����
	private String marital = ""; // ��ȥ���� (��ȥ/��ȥ)
	private String education = ""; // �з� (unknown:�˼����� / grad:���п� / uiv:���� / high:����б�)
	private String housing = ""; // ������ ���� (yes:���� / no:���� / unknown:�˼�����)
	private String loan = ""; // ���⿩�� (yes:�ֽ� / no:���� / unknown:�˼�����)
	private String contact = ""; // ���� (cellular:����Ʈ�� / telephone:����ȭ)
	private String month = ""; // ���Կ� (jan:1�� / ... / dec:12��)
	private String day_of_week = ""; // ���Կ��� (sun:�Ͽ���~sat:�����)
	private int duration = 0; // �Ⱓ (��¥ �ϼ�)

	/** �⺻ ������ **/
	public ObjectClass() {
	}

	/** �Ʒ��� ���� ���ڿ��� ���޹޾� ������ �����ϴ� ������ **/
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
	 * ���� �ѱ� ����
	 * @return 
	 **/
	public String burnyuk(String eksdj) {
		switch (eksdj) {

		case "student":
			return "�л�";
		case "technician":
			return "�����";
		case "blue-collar":
			return "�ٷ���";
		case "management":
			return "�ڿ���";
		case "self-employed":
			return "�濵";
		case "admin":
			return "�����";
		case "services":
			return "����";
		case "entrepreneur":
			return "�����";
		case "unknown":
			return "�˼�����";
		case "housemaid":
			return "������";
		case "unemployed":
			return "����";
		case "retired":
			return "����";
		}
		return eksdj;
	}

	/** ��ȥ���� (��ȥ/��ȥ) **/
	private String maritalToKor(String marital) {
		if (marital.equals("single")) {
			return "��ȥ";
		} else {
			return "��ȥ";

		}
	} // maritalToKor() END

	/** �з� (unknown:�˼����� / grad:���п� / uiv:���� / high:����б�) **/
	private String educationToKor(String education) {
		//
		if (education.equals("grad")) {
			return "���п�";
		} else if (education.equals("uiv")) {
			return "����";
		} else if (education.equals("high")) {
			return "����б�";
		} else {
			return "�˼�����";
		}

	} // educationToKor() END

	/** ������ ���� (yes:���� / no:���� / unknown:�˼�����) **/
	private String housingToKor(String housing) {
		//
		if (housing.equals("yes")) {
			return "����";
		} else if (housing.equals("no")) {
			return "����";
		} else {
			return "�˼�����";
		}
	} // housingToKor() END

	/** ���⿩�� (yes:�ֽ� / no:���� / unknown:�˼�����) **/
	private String loanToKor(String loan) {
		//
		if (loan.equals("yes")) {
			return "����";
		} else if (housing.equals("no")) {
			return "����";
		} else {
			return "�˼�����";
		}
	} // loanToKor() END

	/** ���� (cellular:����Ʈ�� / telephone:����ȭ) **/
	private String contactToKor(String contact) {
		if (contact.equals("cellular")) {
			return "����Ʈ��";
		} else {
			return "����ȭ";
		}
	} // contactToKor() END

	/** ���Կ� (jan:1�� / ... / dec:12��) **/
	private String monthToKor(String month) {
		//
		switch (month) {
		case "jan":
			return "1��";
		case "feb":
			return "2��";
		case "mar":
			return "3��";
		case "apr":
			return "4��";
		case "may":
			return "5��";
		case "jun":
			return "6��";
		case "jul":
			return "7��";
		case "aug":
			return "8��";
		case "sep":
			return "9��";
		case "oct":
			return "10��";
		case "nov":
			return "11��";
		default:
			return "12��";
		}
	} // String monthToKor() END

	/** ���Կ��� (sun:�Ͽ���~sat:�����) **/
	private String day_of_weekToKor(String day_of_week) {
		//
		switch (day_of_week) {
		case "sun":
			return "�Ͽ���";
		case "mon":
			return "������";
		case "tue":
			return "ȭ����";
		case "wed":
			return "������";
		case "thu":
			return "�����";
		case "fri":
			return "�ݿ���";
		default:
			return "�����";
		}

	} // String day_of_weekToKor() END

	/** ��ü ������ Ȯ�� �޼��� **/
	public void variableValues() {
		System.out.println(this.no + "_" + this.age + "_" + this.job + "_" + this.marital + "_" + this.education + "_"
				+ this.housing + "_" + this.loan + "_" + this.contact + "_" + this.month + "_" + this.day_of_week + "_"
				+ this.duration);
	}

	/** �Ʒ� �޼������ private ���� ���� �޼���� **/
	// ����
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
