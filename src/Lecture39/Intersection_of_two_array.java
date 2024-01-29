package Lecture39;

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection_of_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		for (int a : nums1) {
			set1.add(a);
		}
		for (int a : nums2) {
			set2.add(a);
		}
		ArrayList<Integer>  list = new ArrayList<>();
		for (int a : set1) {
			if(set2.contains(a)) {
				list.add(a);
			}
		}
		int arr[] = new int[list.size()];
		int idx =0;
		for (int i : list) {
			arr[idx++] = i;
		}
		
		return arr;
	}

}
