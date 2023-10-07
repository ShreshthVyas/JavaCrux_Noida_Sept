package Lecture10;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,12,7,5};
		int k = 1;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if(k==arr[i]) {
				flag =true;
				break;
			}
		}
		if(flag) {
			System.out.println("Key is found");
		}
		else {
			System.out.println("Key is not found");
		}	
	}

}
