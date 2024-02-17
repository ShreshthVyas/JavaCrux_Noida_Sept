package Lecture43;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,15,20};
		int dp[] =  new int[arr.length];
		int a =rec(arr, 0,dp);
		int b = rec(arr, 1, dp);
		System.out.println(Math.min(a, b));
	}

//	public static int rec(int[] cost, int i) {
//		if(i>=cost.length) {
//			return 0;
//		}
//		int f1 = rec(cost,i+1);
//		int f2 = rec(cost,i+2);
//		return cost[i]+ Math.min(f1, f2);	
//	}
	
	public static int rec(int[] cost, int i, int dp[]) {
		if(i>=cost.length) {
			return 0;
		}
		if(dp[i]!=0) {
			return dp[i];
		}
		int f1 = rec(cost,i+1,dp);
		int f2 = rec(cost,i+2,dp);
		return dp[i] = cost[i]+ Math.min(f1, f2);	
	}

}
