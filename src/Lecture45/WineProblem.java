package Lecture45;

public class WineProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wine[] = {2,3,5,1,4};
		System.out.println(rec(wine,0 , wine.length-1, 1));;
		System.out.println(td(wine));
	}
	public static int rec(int wine[], int i, int j, int year) {
		if(i>j) {
			return 0;
		}
		
		int s = wine[i] * year + rec(wine, i+1, j,year+1);
		int e = wine[j] * year + rec(wine , i, j-1, year+1);
		
		return  Math.max(s, e);
	}
	public static int td(int wine[]) {
		int[][] dp = new int[wine.length][wine.length];
		int year = wine.length;
		for (int i = 0; i < dp.length; i++) {
			dp[i][i] = wine[i] * year;
		}
		year--;
		for (int i = 1; i < dp.length; i++) {
			for (int j = i; j < dp.length; j++) {
				int k = j - i;
				int s = wine[k] * year + dp[k + 1][j];
				int e = wine[j] * year + dp[k][j - 1];
				dp[k][j] = Math.max(e, s);
			}
			year--;
		}
		return dp[0][dp[0].length - 1];
	}

}
