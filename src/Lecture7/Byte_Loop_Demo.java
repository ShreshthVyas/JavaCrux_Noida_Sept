package Lecture7;

public class Byte_Loop_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (byte b = 0; b <= 128; ++b) {
//		System.out.println(b);
//	}
//		for (byte b = 0; b <= 127; ++b) {
//			System.out.println(b);
//		}
//		for (byte b = 0; b < 128; ++b) {
//		System.out.println(b);
//	}
	// all of the above will result in infinite loop 
		// In case of byte after 127 value resets to -128
		for (byte b = 0; b < 127; ++b) {
			System.out.println(b);
		}
	}

}
