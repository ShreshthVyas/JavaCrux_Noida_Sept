package Lecture18;

public class SumofNdigits_Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(sum(n));
	}
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return sum(n-1) + n;
	}

}
