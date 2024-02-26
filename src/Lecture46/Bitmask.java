package Lecture46;

public class Bitmask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =91\;
//		int m =6;
//		System.out.println(n&1);
//		System.out.println(m&1);
//		countsetbit(n);
		countsetbitfast(n);
		
		
	}
	public static void countsetbit(int n) {
		int ans =0;
		while(n!=0) {
			if((n&1)==1) {
				ans++;
			}
			n>>=1;//n = n>>1;
		}
		System.out.println(ans);
	}
	public static void countsetbitfast(int n) {
		int ans =0;
		while(n!=0) {
			ans++;
			n = (n&(n-1));
		}
		System.out.println(ans);
	}

}
