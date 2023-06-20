package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FailureRate {
	
	public void Solution() {
		/*Test Value*/
		int N = 10;
		int [] stages = {5,1,2,5,1,2,6,8,1,7};
		
		//최대클리어 스테이지 계산
		//최대클리어스테이지 이상의 N값은 0으로 처리하기위해
		int maxStage=0;
		for(int i : stages)if(maxStage < i) maxStage=i;
		
		//총 도전자는 stages의 길이
		double challenger = stages.length;
	
		int[] answer = new int[N];
		List<Double> fr = new ArrayList<Double>();
		
		//스테이지별 인원수 배열생성(계산을 위해 0으로 채워줌)
		int[] stageCnt = new int[N];
		Arrays.fill(stageCnt, 0);
				
		for(int i : stages) {
			//최대스테이지 이하만 계산
			if(i<=N) 
			stageCnt[i-1] += 1;
		}
		
		for(int i=0; i<stageCnt.length ; i++) {
            if(challenger > 0){
            	//최대클리어 스테이지 미만일경우만 실행
            	if(i<maxStage) {
				    fr.add((double)stageCnt[i] / challenger);  
				    challenger -=stageCnt[i];
				//최대클리어 스테이지 이상일경우 0으로 채움
            	}else {
            		fr.add(0.0);
            	}
            //도전자가 0일경우 이후는 0으로 채움
            }else {
            	fr.add(0.0);
            }
		}
		
		for(int i=0; i<N; i++) {
			double max = 0;
			for(int j=0; j<N;j++) {
				if(max<fr.get(j)) {
					max = fr.get(j);
				}
			}
			//실패율 내림차순 정렬
			answer[i] = fr.indexOf(max)+1;
			
			if(answer[i] >0)		
			fr.set(answer[i]-1, -1.0);//인덱스값을 사용하기 위해 remove하지 않고 -1로 변경
        }
		
		//테스트
		for(int i : answer) {
			System.out.println(i);
		}
		
	}
	
}
