package Test;

public class MBbtiKakao {
	public void Solution() {
		String survey[] = {"RT"};
		int choices[] = {2};
		String answer="";
		
		
		int ry=0, tu=0, fr=0, co=0, mu=0, ja=0, ap=0, ne=0, idx=0;
		
		for(String str : survey) {
			if(choices[idx] == 0) { // 0일때는 분기 x 바로 컨티뉴
				continue;
			}
			switch (str) {
			// choices 값이 1~3이면 3을 choices 값으로 나눈 몫을 빼주고 5이상이면 choices를 4로 나눈 나머지(1~3)을 더해준다
			case "RT":
				ry+= choices[idx] < 4? -(int)Math.ceil(3.0/choices[idx]):(int)choices[idx]%4;
				break;
			case "TR":
				tu+= choices[idx] < 4? -(int)Math.ceil(3.0/choices[idx]):(int)choices[idx]%4;
				break;
			case "FC":
				fr+= choices[idx] < 4? -(int)Math.ceil(3.0/choices[idx]):(int)choices[idx]%4;
				break;
			case "CF":
				co+= choices[idx] < 4? -(int)Math.ceil(3.0/choices[idx]):(int)choices[idx]%4;
				break;
			case "MJ":
				mu+= choices[idx] < 4? -(int)Math.ceil(3.0/choices[idx]):(int)choices[idx]%4;
				break;
			case "JM":
				ja+= choices[idx] < 4? -(int)Math.ceil(3.0/choices[idx]):(int)choices[idx]%4;
				break;
			case "AN":
				ap+= choices[idx] < 4? -(int)Math.ceil(3.0/choices[idx]):(int)choices[idx]%4;
				break;
			case "NA":
				ne+= choices[idx] < 4? -(int)Math.ceil(3.0/choices[idx]):(int)choices[idx]%4;
				break;
			}
			idx++;
		}
		
		
		answer += ry <= tu ? "R":"T";
		answer += co <= fr ? "C":"F";
		answer += ja <= mu ? "J":"M";
		answer += ap <= ne ? "A":"N";

		System.out.println(answer);
		
	}
}
