package Lecture30;

public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f();
		f(2);
		f(1,2,3);
		f(1,2,30l);
		f(2,3,4l,9.6f);
		
		
	}
	public static void f() {
		System.out.println(1);
	}
	public static int f(int a) {
		return 1;
	}
	public static int f(int a, int b , int d) {
		return a+b+d;
	}
	public static long f(int a, int b, long c) {
		return a+b+c;
	}
	public static long f(int a, int b, long c , float f) {
		return a+b+c + (long) f ;
	}
	

}
