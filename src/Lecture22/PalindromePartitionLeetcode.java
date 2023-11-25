package Lecture22;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitionLeetcode {

	static List<List<String>>  ans  = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ll = new ArrayList<>();
		String ques = "nitin";
		palpart(ques, ll);
		System.out.println(ans);
	}
	public static void palpart(String ques,List<String> ll) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
//			System.out.println(ans);
			
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = 1; i <=ques.length(); i++) {
			String s = ques.substring(0,i);
			if(isPal(s)) {
				ll.add(s);
				palpart(ques.substring(i),ll);
				ll.remove(ll.size()-1);
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
