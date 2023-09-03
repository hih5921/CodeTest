package Test;

import java.util.ArrayList;
import java.util.List;

public class LongJump {

	public void Solution() {
		
		int n = 5;
		long answer = 1;
		
		// f(n) = f(n-1) + f(n-2) 피보나치수열
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		
		for(int i=2 ; i < n ; i++) {
			list.add((list.get(i-1) + list.get(i-2)) % 1234567);
		}
		
		answer = list.get(n-1) ;
		//answer = list.get(n-1) % 1234567; 값을 넣고 꺼내올 때 나누면 불합격(이유는 모르겠음..)
		
		System.out.println(answer);
		
	}
}
