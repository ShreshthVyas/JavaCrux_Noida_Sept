package Lecture45;

import java.util.Arrays;

public class MinFallingSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][] = {{}};
		int dp[][] = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, 999999999);
		}
		int min = 999999999;
		for (int i = 0; i < grid[0].length; i++) {
			min  =  Math.min(min ,rec(grid, 0, i,dp));
		}
		
	}
	
	public static int rec(int grid[][], int cr, int cc, int dp[][]) {
		if(cr>=grid.length || cc>=grid[0].length || cc<0) {
			return 999999999;
		}
		if(cr ==grid.length-1) {
			return grid[cr][cc];
		}
		if(dp[cr][cc]!= 999999999) {
			return dp[cr][cc];
		}
		int ld = rec(grid, cr+1, cc-1,dp);
		int rd = rec(grid, cr+1, cc+1,dp);
		int d = rec(grid, cr+1, cc,dp);
		
		
		return dp[cr][cc] = Math.min(ld, Math.min(rd, d)) + grid[cr][cc];
	}

}
