package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.model.ScoreVO;

public class ScoreExec_06 {

	public static void main(String[] args) {

		/*
		 *  ScoreVO�� �̿��ؼ� List�� �����ϰ�
		 *  5�� �л��� ������ Ű����� �Է¹޾� List�� �߰��ϰ�
		 *  ������ ����� ���Ͻÿ�
		 */
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Scanner scan = new Scanner(System.in);
		
		int scLen = scList.size();
		
		for(int i = 0; i<5; i++) {
			System.out.print("��������>");
			int intKor = scan.nextInt();
					
			System.out.print("��������>");
			int intEng = scan.nextInt();
			
			System.out.print("��������>");
			int intMath = scan.nextInt();
			int intTotal = intKor + intEng + intMath;
			int intAvg = intTotal /3;
			
			scList.add(new ScoreVO(""+(i+1),intKor,intEng,intMath,intTotal,intAvg));
		}
			for(ScoreVO vo : scList) {
				System.out.println(vo.toString());
			}
			
		}
		
		
		
		
	}

