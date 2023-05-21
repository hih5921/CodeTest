package Test;

import java.util.HashSet;
import java.util.Set;

//폰켓몬
public class Phonketmon {
	public void Solution() {
		//기본셋팅 값
		int answer = 0;
		int[] nums = {3,3,3,2,2,2};
		//포획할 포켓몬수량 
		int idx = nums.length/2;
		//HashSet 모든 포켓몬을 HashSet에 저장 -> 중복제거
		Set<Integer> set= new HashSet<>();
		for(int i : nums) {
			set.add(i);
		}
		//포획수량보다 중복제거 포켓몬의 수량이 클경우 포획수량 반환 아닐경우 중복제거 포켓몬수량 반환
		if(idx<set.size()) {
			System.out.println(idx);
		}else {
			System.out.println(set.size());
		}
		
	}
}
