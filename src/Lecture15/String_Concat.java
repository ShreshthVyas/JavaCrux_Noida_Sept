package Lecture15;

public class String_Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		String x = s;
		String b = "Bye";
		s = s + b;
		String d = "HelloBye";
		String c = s + b;
//		System.out.println(x + " " + s);
//		System.out.println(s==d);
		System.out.println(1 + "Hello");
		System.out.println(100000000000l + "Hello");
		System.out.println(1+ 1 + "Hello" );
		System.out.println(1+ 190 + "Hello" + 23 + 84 + "Bye" + 134 + 1);
		
		
	}

}
