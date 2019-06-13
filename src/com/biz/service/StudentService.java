package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.StudentVO;

public class StudentService {

	List<StudentVO> stdList;
	Scanner scan;

	public StudentService() {
		stdList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
	}

	// Ű���忡�� �л������� �Է¹޾Ƽ� stdList�� �߰�
	public boolean inpusStudent(int number) throws NumberFormatException {

		System.out.print("�й��Է�");
		String strNum = scan.nextLine();

		System.out.print("�̸��Է�");
		String strName = scan.nextLine();

		System.out.print("�г��Է�");
		String strGrade = scan.nextLine();
		int intGrade = Integer.valueOf(strGrade);

		System.out.print("�ּ��Է�");
		String strAddr = scan.nextLine();

		System.out.print("��ȭ��ȣ�Է�");
		String strTel = scan.nextLine();

		StudentVO vo = new StudentVO();
		vo.setNumber(strNum);
		vo.setName(strNum);
		vo.setGrade(intGrade);
		vo.setTel(strTel);
		vo.setAddr(strAddr);
		stdList.add(vo);
		return true;
	}

	// stdList�� ��� �л������� console�� ���̱�
	public void viewStudents() {

		System.out.println("�����͹� �л�����");
		System.out.println("===================================================");
		System.out.println("�й�\t�̸�\t�г�\t�ּ�\t��ȭ��ȣ");
		System.out.println("---------------------------------------------------");
		for (StudentVO vo : stdList) {

			System.out.printf("%s\t%s\t%d\t%s\t%s\n", vo.getNumber(), vo.getName(), vo.getGrade(), vo.getAddr(),
					vo.getTel());

		}
		System.out.println("===================================================");
	}

}
