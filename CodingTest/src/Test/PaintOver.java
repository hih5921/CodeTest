package Test;

public class PaintOver {
	public void Solution() {
		 
		int n = 8; // ��üũ��
		int m = 4; // paint ũ��
		int[] section = {2,3,6}; // ��ĥ����
		
		
		int answer = 1; // section�� 0�� ���� �ּ� 1ȸ ��ĥ
		m -=1; //section value ���Խ�Ű�� ���� -1
		
		int painting = section[0] +m; //  ��ĥ���� �ʱⰪ ����
		for(int s_val : section) {
			
			// ��ĥ�������� ĥ�ؾ� �ϴ� ���� ũ�� answer +1 �� ��ĥ���� section value+m���� �����
			if(painting < s_val) { 
				answer++;
				painting = s_val + m;
			}			
		}
		
		System.out.println(answer);
	}
}
