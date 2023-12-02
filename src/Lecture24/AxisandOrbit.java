package Lecture24;

public class AxisandOrbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bammab";
		int odd = 0;
		for (int axis = 0; axis < s.length(); axis++) {
			for (int orbit = 0;axis-orbit>=0 && orbit+axis<s.length(); orbit++) {
				if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)) {
					break;
				}
				odd++;
			}
		}
		int even =0;
		for (double axis = 0.5; axis < s.length(); axis++) {
			for (double orbit = 0.5;axis-orbit>=0 && orbit+axis<s.length(); orbit++) {
				if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))) {
					break;
				}
				even++;
			}
		}
		System.out.println(odd +even);
	}

}
