package Lecture43;

import java.util.Arrays;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLIS(int[] nums) {
		int dp [] = new int[nums.length];
		Arrays.fill(dp, 1);
		int max= Integer.MIN_VALUE;
		for (int i = 0; i < dp.length; i++) {
			for (int j = i-1; j>=0; j--) {
				if(nums[i]>nums[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
					max = Math.max(max, dp[i]);
				}
			}
		}
//		Arrays.stream(dp).max().getAsInt();
		return max == Integer.MIN_VALUE?1:max;
	}

}
