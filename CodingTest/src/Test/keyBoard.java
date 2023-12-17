package Test;

public class keyBoard {
	public void solution() {
		String[] keymap = {"ABCE"};
		String[] targets = {"ABDE"};
		 int answer[]  = new int[targets.length];
			
			int idx = 0;
			int touch;
			for(String t : targets) { // target의 배열 반복
				for(int i=0;i<t.length();i++) { //target배열값의 글자수 반복
					touch = 101;//touch는 keymap 내부의 알파벳 위치(터치수) 최대 100이라 초기값으로 101셋팅
					for(String k: keymap) {
						//indexof는 처음에서 제일 가까운 값의 인덱스 값을 리턴 값이 없을 경우 -1
						touch = touch < k.indexOf(t.charAt(i)) || k.indexOf(t.charAt(i)) == -1? // touch값이 더 작거나-1일 경우 touch유지  
								touch : k.indexOf(t.charAt(i));
					}
					if(touch == 101) {//값이 없을경우 -1
						answer[idx] =-1;
	                    break;                    
					}else {
						answer[idx]+=  touch+1;
					}
				}
				idx++;
			}
		
		for(int i: answer) {
			System.out.println(i);	
		}
	}
}
