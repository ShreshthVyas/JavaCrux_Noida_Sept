package Lecture19;

public class Static_Demo {
	static int val =10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		val++;
		demo();
		
	}
	public static void demo() {
		val+=10;
		System.out.println(val);
		int val = 12;
		System.out.println(val);
		val++;
	}
	

}
