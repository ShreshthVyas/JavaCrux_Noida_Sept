package Lecture44;

import java.util.Arrays;

public class LCS {
	public static void main(String[] args) {
		String s = "abcde";
		String t = "ace";
		tabulation(s, t);
		
	}
	public static int lcs(String s, String t, int i, int j, int dp[][]) {
		if(i==s.length()||j==t.length()) {
			return 0;
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int ans =0;
		if(s.charAt(i)== t.charAt(j)) {
			ans = 1+ lcs(s, t, i+1, j+1,dp); // 
		}
		else {
			ans = Math.max(lcs(s, t, i+1, j,dp), lcs(s, t, i, j+1,dp));
		}
		return dp[i][j] = ans;
	}
	
	public static int tabulation(String s, String t) {
		int dp[][] = new int[s.length()+1][t.length()+1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans = 0;
				if(s.charAt(i-1)== t.charAt(j-1)) {
					ans = 1 + dp[i-1][j-1];
				}
				else {
					ans = Math.max(dp[i-1][j], dp[i][j-1]);
				}
				dp[i][j] = ans;
		}
	}
		for (int[] is : dp) {
			System.out.println(Arrays.toString(is));
		}
		return dp[s.length()][t.length()];
	}		
}
