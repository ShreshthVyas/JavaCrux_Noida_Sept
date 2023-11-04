package Lecture18;

public class Power_Rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2,6));
	}
	public static int pow(int a , int b) {
		if(b==0) {
			return 1;
		}
		return pow(a,b-1) *a;
	}

}
