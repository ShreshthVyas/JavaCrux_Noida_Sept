package Lecture35;

import Lecture34.BinaryTree.Node;

public class Diameter {

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

	public int diameterOfBinaryTree(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int ld = diameterOfBinaryTree(root.left);
		int rd = diameterOfBinaryTree(root.right);
		int sd  = ht(root.left) + ht(root.right) +2;
		
		return Math.max(sd, Math.max(rd, ld));
		
	}
	public int ht(TreeNode nn) {
		if(nn==null) {
			return -1;
		}
		int lh = ht(nn.left);
		int rh = ht(nn.right);
		
		return Math.max(lh, rh) +1;
	}

}
