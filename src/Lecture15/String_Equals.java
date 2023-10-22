package Lecture15;

public class String_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Shresht");
		String t = new String("Shreshth");
		System.out.println(Equals(s,t));
		System.out.println(s.equals(t));
		
	}
	public static boolean Equals(String s , String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!= t.charAt(i)) {
				return false;
			}
		}
		return true;
		
	}

}
