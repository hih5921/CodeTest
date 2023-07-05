package Test;

import java.util.ArrayList;
import java.util.List;

public class DartGame {
	public void Solution() {
		//테스트데이터
		String dartResult = "1T2D3D#";
		
		int answer = 0;
		//스코어는 무조건 3세트
		int[] score = new int[3];
		int scoreIdx = -1;

		//다트게임의 결과만큼 반복
		for (int i = 0; i < dartResult.length(); i++) {
			char ch = dartResult.charAt(i);
			//charAt으로 찢은 문자가 숫자인지 아스키코드 값으로 체크
			if (dartResult.charAt(i) >= 48 && dartResult.charAt(i) <= 57) {
				//charAt으로 찢은 문자가 숫자일때만 인덱스값을 늘려줌
				scoreIdx++;
				//현재 찢은 문자가 1이고 다음 문자가 0일때 10으로 넣고 다음 문자열 뛰어넘기
				if (dartResult.charAt(i) == 48 && dartResult.charAt(i + 1) == 57) {
					score[scoreIdx] = 10;
					i++;
				} else {
					//ch는 아스키 코드값을 가진 char형식의 문자이기 때문에 아스키 해당 코드값을 빼줘서 숫자로 만들어준다 
					score[scoreIdx] = ch -48 ;
				}
			} else {
				//보너스 및 상들의 대한 switch문 
				switch (ch) {
				case 'S':
					score[scoreIdx] = (int) Math.pow(score[scoreIdx], 1);
					break;
				case 'D':
					score[scoreIdx] = (int) Math.pow(score[scoreIdx], 2);
					break;
				case 'T':
					score[scoreIdx] = (int) Math.pow(score[scoreIdx], 3);
					break;
				case '*':
					score[scoreIdx] *= 2;
					//아차상은 현재 점수가 이전 점수가 2배가 되기 때문에 인덱스가 0이 아니라면 이전 점수까지 *2
					if (scoreIdx > 0) {
						score[scoreIdx - 1] *= 2;
					}
					break;
				case '#':
					score[scoreIdx] *= -1;
					break;
				}
			}
			
		}
		//점수합계
		for (int i : score) {
			answer += i;
		}
		System.out.println(answer);

	}
}
