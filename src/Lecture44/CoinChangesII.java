package Lecture44;

import java.util.Arrays;
import java.util.Iterator;

public class CoinChangesII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount =5;
		int coins[]= {1,2,5};
//		 int dp [][] = new int[amount+1][coins.length+1];
//		 
//		 for (int[] a : dp) {
//			Arrays.fill(a, -1);
//		}
		System.out.println(tabulation(coins, amount));;
		 
	}
	
	public int cc(int coins[], int idx, int amnt,int dp[][]) {
		if(amnt == 0) {
			return 1;
		}
		if(idx==coins.length) {
			return 0;
		}
		if(dp[amnt][idx]!=-1) {
			return dp[amnt][idx];
		}
		int inc =0;int exc =0;
		if(amnt>= coins[idx]) {
			inc+= cc(coins, idx, amnt-coins[idx],dp);
		}
		exc += cc(coins, idx+1, amnt, dp);
		return dp[amnt][idx] = inc+exc;
	}
	
	public static int tabulation(int coins[],int amount) {
		int dp [][] = new int[amount+1][coins.length+1];
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1;
		}
		for (int amnt = 1; amnt < dp.length; amnt++) {
			for (int i = 1; i < dp[0].length; i++) {//coin idx
				int inc =0;int exc =0;
				if(amnt>= coins[i-1]) {
					inc= dp[amnt-coins[i-1]][i];
				}
				exc = dp[amnt][i-1];
				dp[amnt][i] = inc+exc;
			}
		}
		for (int[] is : dp) {
			System.out.println(Arrays.toString(is));
		}
		return dp[amount][coins.length];
		
	}
}
