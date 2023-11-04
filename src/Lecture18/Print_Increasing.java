package Lecture18;

public class Print_Increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n =10;
		PrintInc(n);
	}
	public static void PrintInc(int n) {
		if(n==0) {
			return;
		}
		
		PrintInc(n-1);
		System.out.println(n);
	}

}
