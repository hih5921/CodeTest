package Test_lv2;

import java.util.Arrays;

public class StepOnGround {
	public void Solution() {
		int[][] temp = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		Integer[][] arrIdx =  new Integer[temp.length][4];
		Integer[][] land =  new Integer[temp.length][4];
		int answerIdx[] = new int[land.length];
		int answer= 0;
		
		land = Arrays.stream(temp)
		        .map(row -> Arrays.stream(row)
		                .boxed()
		                .toArray(Integer[]::new))
		        .toArray(Integer[][]::new);
		// 받아오는 2차원 배열을 각각 land와 arrIdx에 나눠담고 land는 정렬하여 land[i]의 마지막 인덱스 값이
		// arrIdx에서 indexOf하여 현재 인덱스 값이 이전(-1) 인덱스 값고 같은지 체크 같으면 land[i][3](최대값) - land[i][2](다음큰값)
		// 의 차가 작은 행의 인덱스 값을 다음 큰값의 인덱스 값으로 변경하여 해당 인덱스 값들은 answerIdx에 저장하여 나중에 다 더해줌
		// -> 조건을 예시로는 답이 나오나 채점에서 실패... 완전 다 실패.. 문제 분석중
		for(int i=0; i< land.length; i++) {
			arrIdx[i] = land[i].clone();
			Arrays.sort(land[i]);
			 
		}
		
		answerIdx[0] = 3;
		for(int i=1 ; i< land.length; i++) {
			if(Arrays.asList(arrIdx[i]).indexOf(land[i][3]) == Arrays.asList(arrIdx[i-1]).indexOf(land[i-1][3])) {

				if(land[i-1][3] - land[i-1][2] < land[i][3] - land[i][2]) {
					answerIdx[i-1] = Arrays.asList(arrIdx[i-1]).indexOf(land[i-1][2]);
				}else {
					answerIdx[i] = Arrays.asList(arrIdx[i]).indexOf(land[i][2]);
				}
			}else {
				answerIdx[i] = Arrays.asList(arrIdx[i]).indexOf(land[i][3]);
			}
			
		}
		

		for(int i=0; i<land.length;i++) {
			
			answer += arrIdx[i][answerIdx[i]];
		}
		System.out.println(answer);
	}
	
	
}
