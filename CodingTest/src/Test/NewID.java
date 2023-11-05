package Test;

public class NewID {
	public void Solution() {
		String new_id = "abcdefghijklmn.p";

		//1단계  소문자 치환
		new_id = new_id.toLowerCase();
		
		//2단계 특수문자 제거(정규식 알파벳,숫자, 일부특수문자)
		new_id = new_id.replaceAll("[^a-z0-9._-]", "");
		
		//3단계 . 중복 제거
		new_id = new_id.replaceAll("(?![a-z0-9]{1,})[.]{2,}", ".");
				
		//4단계 첫자리 . 제거
		new_id = new_id.charAt(0) == '.' ?new_id.substring(1):new_id;
		
		//5단계 빈문자열일경우 a 넣기
		new_id = new_id.isEmpty()?"a":new_id;
		
		//6단계 new_id의 길이가 16이상이면 0~15까지 자르고 마지막이 .일경우 자르기
		new_id = new_id.length()>15 ?
				new_id.substring(0, 15).charAt(14)=='.'? // 15자리로 잘랐을 때 마지막이 .인지 체크
						new_id.substring(0, 14):new_id.substring(0, 15)
				:new_id.charAt(new_id.length()-1)=='.'?new_id.substring(0, new_id.length()-1):new_id; // 15자리 이하일경우 마지막이 .인지 체크
		
		//7단계 new_id의 길이가 2 이하라면 3이 될때까지 마지막글자 반복
		new_id += new_id.length() < 3 ? 
				new_id.length() == 1 ? new_id.substring(0)+new_id.substring(0): new_id.substring(1)
			:"";
					
		
		System.out.println(new_id);
	}
}
