package Lecture45;

public class Knapsack0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size[] = {1,2,3,2,2};
		int val [] = {8,4,0,5,3};
		int cap = 4;
		int dp[][] = new int[val.length+1][cap+1];
		
		System.out.println(rec(size,val,cap,0));
	}

	private static int rec(int[] size, int[] val, int cap, int i, int dp[][]) {
		// TODO Auto-generated method stub
		if(cap==0 ||i==val.length) {
			return 0;
		}
		if(dp[i][cap]!=-1) {
			return dp[i][cap];
		}
		int inc=0;int exc =0;
		if(cap>= size[i]) {
			inc = val[i]  + rec(size,val,cap-size[i],i+1,dp);//dp[][i-1]
		}
		exc = rec(size,val,cap,i+1,dp);
		
		return dp [i][cap] = Math.max(inc, exc);
		
	}
	

}
