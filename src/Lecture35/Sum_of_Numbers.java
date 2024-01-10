package Lecture35;

import Lecture35.pathSum.TreeNode;

public class Sum_of_Numbers {
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

	public int sumNumbers(TreeNode root) {
		return sum(root, 0);
	}

	public int sum(TreeNode root, int ans) {
		if (root == null) {
			return 0;
		}
		if(root.left==null && root.right ==null) {
			return ans * 10 + root.val;
		}
		int left = sum(root.left, ans * 10 + root.val);
		int right = sum(root.right, ans * 10 + root.val);

		return left + right;

	}
}
