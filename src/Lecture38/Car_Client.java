package Lecture38;

import java.util.Arrays;
import java.util.Comparator;

public class Car_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars [] c = new Cars[5];
//		
		c[0] =  new Cars(1001 , 50 , "White");
		c[1] =  new Cars(19000 , 180 , "Golden");
		c[2] =  new Cars(700 , 500 , "Black");
		c[3] =  new Cars(40 , 125 , "Blue");
		c[4] =  new Cars(5000000 , 368 , "Pink");
//		c[0] =  new Cars(100000 , 150 , "Pink");
		display(c);
//		sort(c);
		Arrays.sort(c , new Comparator<Cars>() {
			@Override
			public int compare(Cars o1, Cars o2) {
				// TODO Auto-generated method stub
				return o1.color.compareTo(o2.color);
			}
			
		});
		System.out.println("*************");
		display(c);
	}
	public static <T> void display(T[] c) {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
	
	public static<T extends Comparable<T>>void Sort(T[] arr) {
		
		for (int pass = 1; pass < arr.length; pass++) {
			for (int i = 0; i < arr.length - pass ; i++) {
				if(arr[i].compareTo(arr[i+1]) > 0) {
					T t = arr[i];
					arr[i] =  arr[i+1];
					arr[i+1] =  t;
				}
			}
		}
	}

}
