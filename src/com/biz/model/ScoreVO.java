package com.biz.model;

public class ScoreVO {

	private String Number;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private int average;
	private int rnak;

	/*
	 * ���Ƿ� �����ڸ� ����� �Ǹ� �⺻�����ڰ� �ڵ����� ��������� �ʴ´�. �׷��� ���Ƿ� �����ڸ� ����� ��쿡�� Ư���� ��찡 �ƴϸ�
	 * �⺻�����ڷ� ����� �־�� �Ѵ�.
	 */
	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * �ʵ� �Ű������� ���Ե� ���Ƿ� ���� ������
	 */

	public ScoreVO(String number, int kor, int eng, int math, int total, int average, int rnak) {
		super();
		Number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.average = average;
		this.rnak = rnak;
	}

	public ScoreVO(String number, int kor, int eng, int math, int total, int average) {
		super();
		Number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.average = average;
	}

	/*
	 * �ʵ� �Ű������� �Ϻΰ� ���Ե� ���Ƿ� ���� ������
	 */
	public ScoreVO(String number, int kor, int eng, int math) {
		super();
		Number = number;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	public int getRnak() {
		return rnak;
	}

	public void setRnak(int rnak) {
		this.rnak = rnak;
	}

	@Override
	public String toString() {
		return "ScoreVO [Number=" + Number + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", average=" + average + ", rnak=" + rnak + "]";
	}

}
