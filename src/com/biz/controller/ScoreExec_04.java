package com.biz.controller;

import java.util.ArrayList;
import java.util.List;

import com.biz.model.ScoreVO;

public class ScoreExec_04 {

	public static void main(String[] args) {

		List<ScoreVO> scList = new ArrayList<ScoreVO>();

		scList.add(new ScoreVO("1", 100, 60, 88));
		scList.add(new ScoreVO("2", 80, 50, 71));
		scList.add(new ScoreVO("3", 92, 69, 74));
		scList.add(new ScoreVO("4", 93, 80, 79));
		scList.add(new ScoreVO("5", 79, 70, 87));
		scList.add(new ScoreVO("6", 90, 88, 99));

		int scLen = scList.size();
		for (int i = 0; i < scLen; i++) {

			// scList의 i 위치에 담긴 주소복사
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
