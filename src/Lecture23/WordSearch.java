package Lecture23;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch [][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCD";
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if(ch[i][j] == word.charAt(0)) {
					boolean ans = word(ch, word, i, j, 0);
					if(ans ==true) {
						System.out.println(true);
						return;
					}
				}
			}
		}
		System.out.println(false);
	}

	public static boolean word(char[][] arr, String word, int i, int j,int idx) {
		// TODO Auto-generated method stub
		if(idx == word.length()) {
			return true;
		}
		if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]!= word.charAt(idx)) {
			return false;
		}
		int r[] = {0 ,1,0,-1};
		int c[] = {1 ,0,-1,0};
		arr[i][j] = '*';
		for (int k = 0; k < c.length; k++) {
			boolean ans = word(arr, word, i + r[k], j+c[k], idx+1);
			if(ans == true) {
				return true;
			}
		}
		arr[i][j] = word.charAt(idx);
		return false;
	}
}

