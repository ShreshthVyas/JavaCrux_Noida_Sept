package Lecture43;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0};
		int dp[] =  new int[nums.length];
//		for (int i = 0; i < dp.length; i++) {
//			
//		}
		Arrays.fill(dp, -1);
		//System.out.println(robber(nums, 0));
		System.out.println(robber2(nums,dp));
	}

	public static int robber(int[] nums, int i) {
		if(i>= nums.length) {
			return 0;
		}
		int rob = nums[i] + robber(nums, i+2);
		int didnotrob = robber(nums, i+1);
		
		return Math.max(rob, didnotrob);
	}
	
	public static int robber1(int[] nums, int i, int dp[]) {
		if(i>= nums.length) {
			return 0;
		}
		// if already yaad
		if(dp[i]!=0) {
			return dp[i];
		}
		
		int rob = nums[i] + robber1(nums, i+2,dp);
		int didnotrob = robber1(nums, i+1,dp);
		
		return dp[i] = Math.max(rob, didnotrob);//Yaad karna
	}
	
	public static int robber2(int[] nums,  int dp[]) {
		if(nums.length<=1) {
			return nums[0];
		}
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		
		for (int i = 2; i < dp.length; i++) {
			int rob = nums[i] + dp[i-2];
			int dnr = dp[i-1];
			dp[i] = Math.max(dnr, rob);
		}
		
		return dp[dp.length-1];
 	}

}
