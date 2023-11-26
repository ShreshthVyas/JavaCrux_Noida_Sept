package Lecture23;

public class Sudoku_Solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		ss(grid,0,0);
	}

	public static void ss(int[][] grid, int row, int col) {
		// TODO Auto-generated method stub
		if(col ==9) {
			
			row++;
			col =0;
		}
		if(row == 9) {
			Display(grid);
			return;
		}
		if(grid[row][col]!=0) {
			ss(grid,row,col+1);
		}
		else {
			for (int val = 1; val <=9; val++) {
				if(isitpossible(grid, val,row,col)) {
					grid[row][col] = val;
					ss(grid,row,col+1);
					grid[row][col] = 0;
					
				}
			}
		}
		
	}
	
	public static boolean isitpossible(int[][] grid, int val, int row, int col) {
		// TODO Auto-generated method stub
		// col check
		for (int r = 0; r < 9; r++) {
			if(grid[r][col]==val) {
				return false;
			}
		}
		
		//row check
		for (int c = 0; c < 9; c++) {
			if(grid[row][c]==val) {
				return false;
			}
		}
		// square check
		int r = row - row%3;
		int c = col - col%3;
		for (int i = r; i <r+3; i++) {
			for (int j = c; j < c+3; j++) {
				if(grid[i][j]==val) {
					return false;
				}
			}
		}
		
		return true;
	}

	public static void Display(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
