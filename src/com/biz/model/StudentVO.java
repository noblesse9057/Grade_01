package com.biz.model;

/*
 *  ��ü������ Ư¡(1)�� �߻�ȭ�� ����
 *  
 *  
 *  �繰, ��������� �ϳ��� �������� ����ϱ� ���Ͽ� 
 *  ��ü���̰� Ư¡���� �����͵��� �����Ͽ�
 *  �ϳ��� �������� ����� ��
 */

public class StudentVO {

	// �л��� ��Ÿ���� �����͵��� ����
	// member ����, �ʵ�
	// ��ü���� Ư¡(2) ������ ����
	// Ŭ������ �ʵ���� �ܺο��� ���� �������� ���ϵ���
	// private���� �����ϴ� ��
	private String number; // �й�
	private String name; // �л��̸�
	private int grade; // �г�
	private String addr; // �ּ�
	private String tel; // ��ȭ��ȣ

	/*
	 * �⺻������, super �ƹ��� �Ű������� ���� ������ �⺻������ method�� ���¸� ���߾��� ����
	 */
	public StudentVO() {
	}

	/*
	 * �ʵ� ������ �ʵ��(�������)�� �Ű������� ���� �ִ� ������
	 */
	public StudentVO(String Number, String Name, int Grade, String Addr, String Tel) {
		super();
		this.number = Number;
		this.name = Name;
		this.grade = Grade;
		this.addr = Addr;
		this.tel = Tel;
	}

	// ���е� �ʵ���� ����(����,�б�)�ϱ� ���ؼ�
	// ���ʵ忡 �ش��ϴ� getter�� setter�� ����
	// getter�� setter�� �Ӽ��̶�� �θ��� ���� �ִ�.
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	// ������
	// ����� : �ڵ��� �ϸ� �߰��߰� �������� �帧�� �����ϰ�
	// �ڵ� �帧�� �����Ѵ�� �� ����Ǵ��� �˾ƺ��°�
	@Override
	public String toString() {
		return "StudentVO [number=" + number + ", name=" + name + ", grade=" + grade + ", addr=" + addr + ", tel=" + tel
				+ "]";
	}

}
