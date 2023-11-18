package Lecture20;

public class KeyPad {
	static String arr[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "32";
		kp(s,"");
	}
	public static void kp(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch =  ques.charAt(0);
		String s = arr[ch -'0'];
		for (int i = 0; i < s.length(); i++) {
			kp( ques.substring(1), ans+s.charAt(i));
		}
	}
}
