package Lecture18;

public class Rec_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1;
		System.out.println(fact(n));
//		fact(n-1);
	}
	
	public static int fact(int n) {
		if(n == 1) {
			return 1; // Base Condition 
		}
		
		return fact(n-1) * n;
	}

}
