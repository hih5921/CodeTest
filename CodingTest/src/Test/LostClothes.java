package Test;

import java.util.Arrays;

public class LostClothes {
	public void Solution() {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		int answer =0;
		int[] check = new int[n];
		Arrays.fill(check, 0); // 기본 0으로 셋팅
		
		for(int i : lost) {// 체육복 잃어버린 사람은 -1
			check[i-1] -= 1;
		}
		
		for(int i : reserve) {
			check[i-1] += 1;	//여벌있는 인원은 +1
		}
		
		for(int i=0; i<n ; i++) {
			if(check[i] < 0) {
				if(i!=0 && check[i-1] == 1) { // 첫번째 사람이 아니고 이전 사람이 여분이 있을경우 
					check[i-1] -=1;
					check[i] +=1;
				}else if(i != n-1 && check[i+1] == 1) { // 마지막 사람이 아니고 다음 사람이 여분이 있을경우
					check[i+1] -=1;
					check[i] +=1;
				}
			}
		}
		
		for(int i : check) {
			answer += i >= 0 ? 1:0;
		}
		System.out.println(answer);
	}
}
