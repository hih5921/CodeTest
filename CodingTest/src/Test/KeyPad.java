package Test;

public class KeyPad {
	public void Solution() {
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		
		String answer ="";
		
		int l_num = 10; //*
		int r_num = 12; //#
		for(int i : numbers) {
			i = i==0 ? 11 : i;
			switch (i % 3) {
			case 1:
				l_num =i;
				answer+="L";
				break;
			case 0:	
				r_num =i;
				answer+="R";
				break;				

			default:
				int l_val = Math.abs(l_num - i); 
				int r_val = Math.abs(r_num - i);
				
				int lx_gap = l_val % 3; // x축 이동횟수
				int ly_gap = l_val / 3; // y축 이동횟수
				
				int rx_gap = r_val % 3;
				int ry_gap = r_val / 3;
				
				int l_gap = lx_gap + ly_gap;
				int r_gap = rx_gap + ry_gap;
				
				if(l_gap < r_gap) {
					answer+="L";
					l_num =i;
				}else if(l_gap > r_gap) {
					answer+="R";
					r_num =i;
				}else {
					answer += hand.equals("right") ? "R":"L";
					r_num = hand.equals("right") ? i : r_num;
					l_num = hand.equals("right") ? l_num : i;
				}
				break;
			}
		}
		
		System.out.println(answer);
	}
}
