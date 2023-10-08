package Package11;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,-1,2,3,-2,12};
		for (int i = 0; i < arr.length; i++) {
			int min_idx =  i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx = j;
				}
			}
			int t = arr[i];
			arr[i] =  arr[min_idx];
			arr[min_idx] = t;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
