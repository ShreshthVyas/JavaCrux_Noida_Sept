package Lecture18;

public class PrintDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n  =10;
		PrintDec(n);
	}
	public static void PrintDec(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		PrintDec(n-1);
		
	}

}
