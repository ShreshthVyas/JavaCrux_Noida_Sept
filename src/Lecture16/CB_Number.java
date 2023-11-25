package Lecture16;

public class CB_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "4991";
		boolean arr[] =  new boolean[s.length()];
		int count  =0;
		for (int i = 1; i <=s.length(); i++) {
			for (int j = 0; j <=s.length()-i; j++) {
				long n = Long.parseLong(s.substring(j,j+i));
				
				if(isCB(n) && isvisited(arr, j, j+i)) {
					System.out.println(s.substring(j,j+i));
					count++;
					for (int k = j; k < j+i; k++) {
						arr[k] = true;
					}
					
				}
			}
		}
		System.out.println(count);
		
	}
	public static boolean isCB(long n) {
		int arr[] = {2,3,5,7,11,13,17,19,23,29};
		//Point 1
		if(n ==0 || n==1) {
			return false;
		}
		
		//Point 2
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == n) {
				return true;
			}
		}
		
		//Point 3
		for (int i = 0; i < arr.length; i++) {
			if(n%arr[i]  == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static boolean isvisited(boolean visit[] , int i , int j) {
		for (int k = i; k < j; k++) {
			if(visit[k]) {
				return false;
			}
		}
		return true;
	}
	

}
