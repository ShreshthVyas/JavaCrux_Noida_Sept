package Lecture46;

public class LisNLogN {
	public static void main(String[] args) {
		
	}
	
	public int lengthOfLIS(int[] nums) {
		int lis[] = new int[nums.length];
		int len =1;
		lis[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]> lis[len-1]) {
				lis[len] = nums[i];
				len++;
			}
			else {
				int idx = binarysearch(0,len-1,lis, nums[i]);
				lis[idx] = nums[i];
			}
		}
		
		return len;
	}

	private int binarysearch(int si, int ei, int[] lis, int k) {
		// TODO Auto-generated method stub
		int idx =0;
		while(si<=ei) {
			int mid = (si+ei)/2;
			if(lis[mid]>=k) {
				idx =mid;
				ei = mid-1;
			}
			else {
				si =mid+1;
			}
		}
		return idx;
	}
	
}
