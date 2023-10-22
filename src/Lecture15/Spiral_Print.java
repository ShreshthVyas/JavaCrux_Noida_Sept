package Lecture15;

public class Spiral_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [][] = {{1,2,3,4,100},{5,6,7,8,200} ,{9,10,11,12,300}};
		int minc = 0;
		int minr= 0;
		int maxr = arr.length-1;
		int maxc = arr[0].length-1;
		int te = arr.length * arr[0].length;
		int count = 0;
		
		while(count<te) {
		for (int i = minc; i <=maxc && count<te; i++) {
			System.out.print(arr[minr][i] + " ");
			count++;
		}
		minr++;
		for (int i = minr; i <=maxr && count<te; i++) {
			System.out.print(arr[i][maxc] + " ");
			count++;
		}
		maxc--;
		for (int i = maxc; i >=minc &&count<te; i--) {
			System.out.print(arr[maxr][i] + " ");
			count++;
		}
		maxr--;
		for (int i = maxr; i >=minr && count<te; i--) {
			System.out.print(arr[i][minc] + " ");
			count++;
		}
		minc++;
		}
		
		
	}
	

}
