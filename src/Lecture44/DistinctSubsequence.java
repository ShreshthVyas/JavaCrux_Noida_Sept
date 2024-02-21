package Lecture44;

public class DistinctSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int ds(String s, String t, int i, int j, int dp[][]) {
		if(j == t.length()) {
			return 1;
		}
		if(i == s.length()) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		
		int inc =0;int exc=0;
		if(s.charAt(i)==t.charAt(j)) {
			inc+= ds(s, t, i+1, j+1, dp);
		}
		exc+= ds(s, t, i,j+1, dp);
		return dp[i][j] = inc+exc;
		
	}

}
