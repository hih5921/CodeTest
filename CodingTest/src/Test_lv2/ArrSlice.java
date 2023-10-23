package Test_lv2;

import java.lang.reflect.Array;
import java.util.Arrays;
//12 ~ 20 런타임 + 메모리 초과 수정필요
public class ArrSlice {
	public void Solution() {
		int n = 3;
		long left= 2;
		long right = 5;
		
		int[] answer = new int[(int)(right-left)+1];
		
		int[] arr = new int[(n*n)];
		Arrays.fill(arr,n);//기본값은 n으로 셋팅(n*n)이 아닌 (n*n)-n을 위해 반복횟수 조금 감소
        Arrays.fill(answer,n); //반복문이 끝까지 돌지 않기때문에 기본값 n으로 fill
		int idx = 0;
		for(int i=0; i<(n*n)-n; i++) {
			if(i / n > 0) { //n 이후로는 i를 n으로 나눈 나머지가 i/n의 몫보다 작으면 i/n몫의 +1값을 넣어서 초기화
				// 말은 복잡하지만 결국 2차원 배열 초기화를 2중for문을 풀어쓴것
				arr[i] =  ((i % n) + 1<= i/n ?(i/n)+1:((i % n) + 1)); 
			}else {//0~n-1까지는 정상실행
				arr[i] = ((i % n) + 1);
			}
			
			//리턴값 셋팅
			if(left <= i && i <= right ) {
				answer[idx++] = arr[i];  
			}
			
		}
		for(int i: answer) {
			System.out.println(i);
		}
	
	}
}
