package Lecture17;

public class Enhanced_for_loopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {10,20,30,40,60,70};
		
//		for (int i = 0; i < arr.length; i++) {
//			
//		}
		
		for (int j : arr1) {
			System.out.println(j);
		}
		
		int arr [][] = {{1,2,3,4},{5,6,7,8} ,{9,10,11,12}};
		for (int[] a : arr) {
			for (int i : a) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}

}
