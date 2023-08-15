package Test;

public class PaintOver {
	public void Solution() {
		 
		int n = 8; // 전체크기
		int m = 4; // paint 크기
		int[] section = {2,3,6}; // 덧칠영역
		
		
		int answer = 1; // section의 0번 값에 최소 1회 덧칠
		m -=1; //section value 포함시키기 위해 -1
		
		int painting = section[0] +m; //  덧칠영역 초기값 생성
		for(int s_val : section) {
			
			// 덧칠영역보다 칠해야 하는 값이 크면 answer +1 및 덫칠영역 section value+m으로 재생성
			if(painting < s_val) { 
				answer++;
				painting = s_val + m;
			}			
		}
		
		System.out.println(answer);
	}
}
