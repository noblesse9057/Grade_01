package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_006 {

	public static void main(String[] args) {

		/*
		 * ScoreVO�� �̿��ؼ� List�� �����ϰ� 5�� �л��� ������ Ű����� �Է¹޾� List�� �߰��ϰ� ������ ����� ���Ͻÿ�
		 */
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Scanner scan = new Scanner(System.in);

		int scLen = scList.size();

		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "�� �л� ��������>");
			String strKor = scan.nextLine();
			int intKor = Integer.valueOf(strKor);

			System.out.print((i + 1) + "�� �л� ��������>");
			String strEng = scan.nextLine();
			int intEng = Integer.valueOf(strEng);

			System.out.print((i + 1) + "�� �л� ��������>");
			String strMath = scan.nextLine();
			int intMath = Integer.valueOf(strMath);

			int intTotal = intKor + intEng + intMath;
			int intAvg = intTotal / 3;

			// 1�����
			// ScoreVO vo =new ScoreVO();
			// vo.setNumber(""+(i+1));
			// vo.setKor(intKor);
			// vo.setEng(intEng);
			// vo.setMath(intMath);

			// 2�����
			// vo= new ScoreVO(""+(i+1),intKor,intEng,intMath);
			// scList.add(vo);

			// 3�����
			scList.add(new ScoreVO("" + (i + 1), intKor, intEng, intMath, intTotal, intAvg));

		}
		for (ScoreVO vo : scList) {
			System.out.println(vo.toString());
		}

	}

}
