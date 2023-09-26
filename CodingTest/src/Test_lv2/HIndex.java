package Test_lv2;

import java.util.Arrays;

public class HIndex {
	public void Solution() {
		int[] citations = { 3, 0, 6, 1, 5 }; //인용논문수
		int answer = 0;
		Arrays.sort(citations);
		//참고 - H지수
		int hidx = 0;
		for (int i=0; i < citations.length; i++) {
			hidx = citations.length - i; 
			//현재 인용논문수가 h_index보다 크면  h_index를 저장 후 break
			answer = citations[i] >=  hidx  ? hidx:0;  
			
			if(answer != 0) break;
			
		}
		System.out.println(answer);
	}

}
