package Lecture43;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =50;
		//System.out.println(fib(50));
		int dp[] = new int[n+1];
		System.out.println(fib2(n, dp));
	}
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int f1 = fib(n-1);
		int f2 = fib(n-2);
		
		return f1+f2;
	}
	
	public static int fib1(int n, int dp[]) {
		if(n==0 || n==1) {
			return n;
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		int f1 = fib(n-1);
		int f2 = fib(n-2);
//		dp[n] = f1+f2;
		return dp[n] = f1+f2;
	}
	
	public static int fib2(int n , int dp[]) {
		dp[0] =0;
		dp[1] = 1;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n];
	}
}
