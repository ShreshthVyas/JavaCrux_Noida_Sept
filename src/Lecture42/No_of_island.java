package Lecture42;

public class No_of_island {
	 public int numIslands(char[][] grid) {
	      int count =0;
	      for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j]=='1') {
					count++;
					dfs(grid,i,j,grid.length,grid[0].length);
				}
			}
		}
	     return count;
	 }

	private void dfs(char[][] grid, int i, int j, int n, int m) {
		// TODO Auto-generated method stub
		if(i<0 || i>=n||j<0||j>=m || grid[i][j]=='0') {
			return;
		}
		grid[i][j] = '0';
		dfs(grid, i+1, j, n, m);
		dfs(grid, i, j+1, n, m);
		dfs(grid, i-1, j, n, m);
		dfs(grid, i, j-1, n, m);
	}
	 
}
