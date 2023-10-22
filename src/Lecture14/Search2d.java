package Lecture14;

public class Search2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][] = {{1,2,3,4},{6,7,8,9} ,{10,11,12,13}};
		int target = 10;
		System.out.println(check(arr, target));;
		
	}
	public static boolean check(int arr[][] , int target) {
		int  row = 0;
		int  col = arr[0].length -1;
		while(row< arr.length && col >=0) {
			if(arr[row][col] == target ) {
				return true;
			}
			else if (arr[row][col] > target) {
				col--;
			}
			else {
				row++;
			}
		}
		return false;
	}

}
