package Test;

public class SearchPrimeNum {
	
	public void Solution() {
		int answer = 0;
		int n = 11;
		//풀이1 시간초과, break 추가해도 시간초과
//		for(int i=2; i<=n; i++) {
//			int cnt = 0;
//			for(int j=2; j<=i; j++) {
//				if(i%j==0)cnt++;
//				if(cnt>1)break;
//			}
//			if(cnt==1) {
//				answer++;
//			}
//		}
		
		//풀이2 변경사항 
		//기존 약수의 개수를 체크하여 소수를 판단했으나 시간단축을 위해 검사구분을 빼고 true, false만 보는 boolean타입으로 변경
		//루프의 횟수를 줄이기 위해 2를 제외한 짝수는 루프에서 제외(미세하게 시간 감소 했으나 여전히 시간초과)
		//어떤 소수도 N의 제곱근보다 큰 수로 나눠지지 않는다는 규칙이 있다. (Google검색 - 소수찾는공식)
		//제곱근을 구하는 Math.sqrt(i) 사용하여 반복횟수 축소 후 통과
		for (int i = 2; i <= n; i++) {
            boolean chk = true;
            
            if (i==2) {
            	chk = true;
            } else if (i%2==0) {
            	chk = false;
            } else {
                for (int j=3; j<=Math.sqrt(i); j+=2) {
                   if (i%j==0) {
                	   chk = false;
                        break;
                    }
                }
            }
            if (chk) {
            	answer++;
            }
		}
		
		System.out.println("fni"+answer);
	}
}
