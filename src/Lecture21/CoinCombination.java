package Lecture21;

public class CoinCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin[] = {2,3,5};
		int n  =10;
		coinchange(coin,n ,0,"",0);
	}

	public static void coinchange(int[] coin, int n,int amnt,String ans, int idx) {
		// TODO Auto-generated method stub
		if(amnt>n) {
			return;
		}
		if(amnt==n) {
			System.out.println(ans);
			return;
		}
		
		for (int i = idx; i < coin.length; i++) {
			coinchange(coin,n,amnt+coin[i],ans+coin[i],i);
		}
	}

}
