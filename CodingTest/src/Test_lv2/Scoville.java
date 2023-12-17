package Test_lv2;


import java.util.PriorityQueue;

public class Scoville {
	public void solution() {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K =7;
		int answer = 0;
		int calcScoville =0;
		
		PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(); // 우선순위 오름차순

        for (int i : scoville) {
        	pQ.offer(i); //scoville 우선순위큐에 추가
        }

        while (pQ.peek() < K) { // peek을 사용해 원하는 스코빌지수보다 값이 작은지 체크
            if (pQ.size() < 2) { // size를 체크해 poll로 뽑아낼 값이 2개 이상 있는지 확인(없을 경우 계산에서 오류)
            	System.out.println("return -1"); // 모든 값을 원하는 스코빌 이상으로 만들지 못해 -1 리턴
            }
            
            int a = pQ.poll();
            int b = pQ.poll();

            calcScoville = a + (b * 2); // 스코빌값 계산 후 pQ에 넣고 실행횟수 +1
            pQ.offer(calcScoville);
            answer ++;            
        }
        System.out.println(answer);
	}
}
