package com.freeflux;

/** �ϳ��� �Ź��� ���� ������ ��� Ŭ���� **/
public class NewsClass {
	private String press="";		// �Ź��� �̸�
	private String img="";			// ��ǥ�̹���
	private String url="";			// URL 
	private String category=""; 	// ����

	public NewsClass() {	 //  �⺻������
	} // �⺻ ������ END
	
	/** �ܺηκ��� ���޹��� �����͸� ���(�ν��Ͻ�) ������ �����ϴ� ������ **/
	public NewsClass(String img, String url) {
		this.img=img;
		this.url=url;
	}  // Overloading ������ END

	/** �ܺηκ��� ���޹��� �����͸� ���(�ν��Ͻ�) ������ �����ϴ� ������ **/
	public NewsClass(String press, String img, String url, String category) {
		this.press=press;
		this.img=img;
		this.url=url;
		this.category=category;
	}  // Overloading ������ END

	/** �Ʒ� �޼���� private ���������Ϳ� �����ϱ� ���� getter ��**/
	public String getPress() {
		return press;
	}

	public String getImg() {
		return img;
	}

	public String getUrl() {
		return url;
	}

	public String getCategory() {
		return category;
	}
	
	
}
