package Lecture22;

public class QueenPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int noq = 2;
		boolean board[] =  new boolean[n];
		queen(n,noq,"",board,0);
	}

	public static void queen(int n, int noq, String ans, boolean[] board, int qpsf) {
		// TODO Auto-generated method stub
		if(qpsf == noq) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if(!board[i]) {
				board[i] =true;
				queen(n,noq,ans + "b"+ i + "q" + qpsf,board,qpsf+1);
				board[i] = false;// Backtracking
			}
		}	
	}
}
