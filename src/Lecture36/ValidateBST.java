package Lecture36;

import Lecture36.InsertIntoBST.TreeNode;

public class ValidateBST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	class Solution {
	    public boolean isValidBST(TreeNode root) {
	        return valid(root).isbst;
	    }
	    public bstpair valid(TreeNode root) {
	    	if(root == null) {
	    		return new bstpair();
	    	}
	    	bstpair left = valid(root.left);
	    	bstpair right = valid(root.right);
	    	bstpair self =  new bstpair();
	    	self.min = Math.min(root.val, Math.min(left.min, right.min));
	    	self.max = Math.max(root.val, Math.max(left.max, right.max));
	    	self.isbst = left.isbst && right.isbst && root.val> left.max && root.val <right.min;
	    	return self;
	    }
	    public class bstpair{
	    	boolean isbst = true;
	    	long min = Long.MAX_VALUE;
	    	long max = Long.MIN_VALUE;
	    }
	}

}
