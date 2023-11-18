package Lecture20;

public class permutaion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String q = "aa";
		permutation(q,"");
	}

	public static void permutation(String q, String ans) {
		// TODO Auto-generated method stub
		if(q.length() ==0) {
			System.out.println(ans);
			return;
		}
		boolean visited[] = new boolean [26];
		for (int i = 0; i < q.length(); i++) {
			char ch = q.charAt(i);
			if(visited[ch -'a'] == false) {
				visited[ch -'a'] = true;
				String s1 = q.substring(0,i);
				String s2 = q.substring(i+1);
				permutation(s1+s2, ans+ ch);
			}
			
		}
	}

}
