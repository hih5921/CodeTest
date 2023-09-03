package Test;


import java.util.stream.IntStream;

public class Weapone {
	public void Solution() {
		
		int number = 10;
		int limit = 3;
		int power = 2;
		
		int answer = 1;
// 		Stream사용하여 간략화하려고 했으나 filter조건을 충족시키지 못해 실패		
//		for(int i=2 ; i <= number; i++) {
//			answer += getCount(i) > limit ? power : getCount(i);
//		}
		
		
		
//		3		
		for(int i=2 ; i <= number; i++) {
			int temp = 0;
			
			for (int j=1; j<=Math.sqrt(i); j++) { // 제곱근으로 반복횟수 줄임
                if (i%j==0) {
             	   temp++;
             	  if (j != i / j) { // 제곱근의 값으로 반복 횟수가 줄어들어 앞 뒤 숫자를 뒤집어 계산해서 카운트 +1
		                temp++;
		            }
                 }
             }
		
			if(temp > limit) { // 리미트 체크하여 초과 시 power 값으로 더해줌
				answer += power;
			}else {
				answer +=temp;
			}
		}
		
		
		
		
		
		System.out.println(answer);
	    
	}
	
	public int getCount(int num) {
		return (int)IntStream.rangeClosed(1, (int)Math.sqrt(num))
	            .filter(i -> num % i == 0 )
	            .count();
	}
}
