package Test;

public class Crane {
	public void Solution() {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		int answer = 0;
		int[] temp = new int[moves.length];
		int idx=0;
		
		for(int i : moves) {
			for(int j=0; j<board.length;j++) {
				if(board[j][i-1] != 0) {
					temp[idx] = board[j][i-1];
					board[j][i-1] = 0;

					if(idx != 0 && temp[idx] == temp[idx-1]) {
						idx-=2;
						answer+=2;
					}
					idx++;
					break;
				}
				
			}
		}
		
		System.out.println(answer);

	}
}
