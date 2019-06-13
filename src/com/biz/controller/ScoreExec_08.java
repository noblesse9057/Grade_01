package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_08 {

	public static void main(String[] args) {

		/*
		 * �л��� ������ �Է¹޴� ���ȿ� �Ǽ��� ������ �߸��Է¹����� (���ڿ� ���ڰ� ���ԵǴ°��) Exception�� �߻��ϴµ� Exp�� �߻��ϸ�
		 * �ٽ� �л��� ������ �Է¹޵��� ó��
		 */
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Scanner scan = new Scanner(System.in);

		// int scLen = scList.size();

		for (int i = 0; i < 5; i++) {

			/*
			 * 3������ ������ ���� int �������� try �� �������� ������ ���ش�.
			 * 
			 * try���� ���������� 3������ ������ scList�� ��ƾ��ϴµ� try�� ������ �����̵Ǹ� ������ �Ұ����ϱ� ����
			 */
			int intKor = 0;
			int intEng = 0;
			int intMath = 0;
			try {
				System.out.print((i + 1) + "�� �л� ��������>");
				String strKor = scan.nextLine();
				intKor = Integer.valueOf(strKor);

				System.out.print((i + 1) + "�� �л� ��������>");
				String strEng = scan.nextLine();
				intEng = Integer.valueOf(strEng);

				System.out.print((i + 1) + "�� �л� ��������>");
				String strMath = scan.nextLine();
				intMath = Integer.valueOf(strMath);

			} catch (NumberFormatException e) {
				// e.printStackTrace();
				System.out.println((i + 1) + "�� �л� ���� �Է� ����!!");
				System.out.println((i + 1) + "�� �л� ������ �ٽ� �Է�");
				i--;
				/*
				 * for�� while �ݺ��������� ����Ҽ� ������ continue�� ������ ���Ŀ� �ִ� ��� �ڵ�� �����ϰ� for�� while ����
				 * ���������� �����Ѵ�. break�� �ݺ����� ���� continue�� �ݺ����� ��� ����
				 */
				continue;
			}

			int intTotal = intKor + intEng + intMath;
			int intAvg = intTotal / 3;

			// 3�����
			scList.add(new ScoreVO("" + (i + 1), intKor, intEng, intMath, intTotal, intAvg));
			System.out.println(scList.get(i).toString());

		}
		// �������
		int scLen1 = scList.size();
		for (int i = 0; i < scLen1; i++) {
			ScoreVO vo = scList.get(i);

			int intTotal = vo.getKor();
			intTotal += vo.getEng();
			intTotal += vo.getMath();

			vo.setTotal(intTotal);
			vo.setAverage(intTotal / 3);
		}

		for (ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}

	}
}
