package Lecture47;

public class UniqueNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public int[] singleNumber(int[] nums) {
		int xor =0;
		
		for(int val: nums) {
			xor ^=val;
		}
		
		int mask = xor & (~(xor-1));
		int a  =0;
		for(int val: nums) {
			if((val&mask) !=0) {
				a^=val;
			}
		}
		int b = a^xor;
		int arr[] = {a,b};
		return arr;
		
		
		
	}

}
