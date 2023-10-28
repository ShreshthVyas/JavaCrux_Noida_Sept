package Lecture16;

public class Palindromic_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitin";
		for (int i = 0; i <= s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				if(isPal(s.substring(i,j))) {
					System.out.println(s.substring(i,j));
				}
			}
			
		}
	}
	public static boolean isPal(String s) {
		int i = 0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)!= s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
