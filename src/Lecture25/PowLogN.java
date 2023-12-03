package Lecture25;

public class PowLogN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(3,3));
	}
	public static int pow(int a, int b) {
		if(b==0) {
			return 1;
		}
		int ans  = pow(a, b/2);
		ans  = ans *ans;
		if (b%2!=0) {
			ans= ans*a;
		}
		return ans;
	}

}
