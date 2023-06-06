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
		
		//풀이2 
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
