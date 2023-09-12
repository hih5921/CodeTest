package Test_lv2;

public class MagicElv {
	public void Solution() {
		
		int storey = 2554;
		int answer = 0;
		
		while(storey > 0) {
			if(storey % 10 > 5) { // 6 ~ 9까지는 윗층으로 올라갔다가 내려오는게 짧음
				answer += (10 - (storey % 10));
				storey +=10; // 층을 올라가기 때문에 층수 계산을 위해 +10
			}else if(storey % 10 < 5){ // 1~4는 바로 내려가는게 빠름
				answer += storey % 10;
			}else { // 5층 단위일 경우 앞자리 비교(위와 같은 로직)
				if(storey % 100 >= 50) {// 앞자리 6~9는 올라가는게 빠름  
					answer += 10 - (storey % 10);
					storey+=10;
				}else {
					answer +=storey % 10;
				}
			}
			storey = storey / 10;
		}
		System.out.println(answer);
	}
}
