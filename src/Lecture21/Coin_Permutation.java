package Lecture21;

public class Coin_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[] = {2,3,5};
		int n  =10;
		coinchange(coin,n ,"");
	}

//	public static void coinchange(int[] coin, int n,int amnt,String ans) {
//		// TODO Auto-generated method stub
//		if(amnt>n) {
//			return;
//		}
//		if(amnt==n) {
//			System.out.println(ans);
//			return;
//		}
//		
//		for (int i = 0; i < coin.length; i++) {
//			coinchange(coin,n,amnt+coin[i],ans+coin[i]);
//		}
//		
//		
//	}
	
	public static void coinchange(int[] coin, int n,String ans) {
		// TODO Auto-generated method stub
		if(n<0) {
			return;
		}
		if(n==0) {
			System.out.println(ans);
			return;
		}
		
		for (int i = coin.length-1; i>=0; i--) {
			coinchange(coin,n-coin[i],ans+coin[i]);
		}
		
		
	}

}
