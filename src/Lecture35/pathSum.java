package Lecture35;

import Lecture35.Diameter.TreeNode;

public class pathSum {

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

	public boolean hasPathSum(TreeNode root, int targetSum) {
		if(root == null) {
			return false;
		}
		if(root.left== null && root.right ==null) {
			if(targetSum - root.val==0) {
				return true;
			}
			return false;	
		}
		boolean left  =  hasPathSum(root.left, targetSum - root.val);
		boolean right =  hasPathSum(root.right, targetSum - root.val);
		
		return left || right;
	}

}
