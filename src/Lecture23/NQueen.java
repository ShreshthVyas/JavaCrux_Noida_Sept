package Lecture23;

public class NQueen {
	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean board[][] = new boolean[n][n];
		nqueen(board, n , 0);
		System.out.println(count);
	}

	public static void nqueen(boolean[][] board, int n, int row) {
		// TODO Auto-generated method stub
		if(n==0) {
//			System.out.println(".");
			count++;
			Display(board);
			System.out.println();
			return;
		}
		
		for (int col = 0; col < board.length; col++) {
			if(isitpossible(board,row, col)) {
//				System.out.print(row +" " + col + "|");
				board[row][col] = true;
				nqueen(board,n-1,row+1);
				board[row][col] = false;
			}
		}	
	}
	public static boolean isitpossible(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		// lower half recursion khud dekhega
		
		//up
		for (int r = row; r>=0; r--) {
			if(board[r][col]) {
				return false;
			}
		}
		// upper-left diagonal
		int cr = row, cc = col;
		while(cr>=0 && cc>=0) {
			if(board[cr][cc]) {
				return false;
			}
			cr--;
			cc--;
		}
		
		//upper-right diagonal
		cr = row; cc = col;
		while(cr>=0 && cc<board.length) {
			if(board[cr][cc]) {
				return false;
			}
			cr--;
			cc++;
		}
		
		
		return true;
	}

	public static void Display(boolean arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
