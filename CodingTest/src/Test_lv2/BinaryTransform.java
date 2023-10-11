package Test_lv2;

public class BinaryTransform {
	public void Solution() {
		String s = "110010101001";
		int[] answer = {0,0};
		
		while(s.length() > 1) {
			answer[0]++; // 횟수 카운팅
			answer[1] += (s.replace("1", "").length()) ; // 제거할 0의 길이
			s = s.replace("0", "");

			s = Integer.toBinaryString(s.length()); //문자열의 2진변환(0제거 후 길이)
		}
		System.out.println(answer[0]+"/"+answer[1]);
	}
		
}
