package com.freeflux;

/** �ϳ��� �Խñ� ������ ��� Ŭ����**/
public class BoardClass {
	public int bno=0;
	public String title="";
	public String writer="";
	public int hit=0;

	// 11968, "2020 07 08 Ŭ��������������7 (student, takes)" ,  "�豤��",  25
	/** �ܺηκ��� �����͸� ���޹޾� ��������� �����ϴ� ������ 
	 * @param n : ��ȣ
	 * @param t : ����
	 * @param w : �ۼ���
	 * @param h : ��ȸ��
	**/
	public BoardClass(int n, String t, String w, int h) {
		this.bno=n;
		this.title=t;
		this.writer=w;
		this.hit=h;
	} // ������ END

}
