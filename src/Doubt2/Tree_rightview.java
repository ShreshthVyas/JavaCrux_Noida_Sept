package Doubt2;

import java.util.*;

public class Tree_rightview {
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
	List<Integer> ll = new ArrayList<>();
	int max =-1;
	public List<Integer> rightSideView(TreeNode root) {
		dfs(root,0);
		return ll;
	}
	private void dfs(TreeNode root, int lvl) {
		// TODO Auto-generated method stub
		if(root ==null) {
			return;
		}
		if(lvl>max) {
			ll.add(root.val);
			max = lvl;
		}
		dfs(root.right,lvl+1);
		dfs(root.left,lvl+1);
	}
}
