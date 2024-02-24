package Lecture45;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="sjbjbc";
		String t = "ljqnfqf";
		 int dp [][] = new int[s.length()+1][t.length()+1];
		 
		 
		 for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
	}
	public int rec(String s, String t, int i,int j) {
		if(i ==s.length()) {
			return t.length()-j;
		}
		if(j == t.length()) {
			return s.length()-i;
		}
		int  min =0;
		if(s.charAt(i)== t.charAt(j)) {
			min = rec(s, t, i+1, j+1);
		}
		else {
			int d= rec(s, t, i+1, j);
			int r = rec(s, t, i+1, j+1);
			int in = rec(s, t, i, j+1);
			min  = Math.min(r, Math.min(in, d))+1;
		}
		
		return min;
	}
	
	public int td(String s, String t) {
		int dp [][] = new int[s.length()+1][t.length()+1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0]  = i;
		}
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i]  = i;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int  min =0;
				if(s.charAt(i-1)== t.charAt(j-1)) {
					min = dp[i-1][j-1];
				}
				else {
					int d= dp[i-1][j];
					int r = dp[i-1][j-1];
					int in = dp[i][j-1];
					min  = Math.min(r, Math.min(in, d))+1;
				}
				dp[i][j] = min;
			}
			
		}
		
		return dp[dp.length-1][dp[0].length-1];
		
	}

}
