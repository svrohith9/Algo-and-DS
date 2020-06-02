package com.leetcode.problems;
/*
  	Example:

	Input:
	
	     4
	   /   \
	  2     7
	 / \   / \
	1   3 6   9
	
	Output:
	
	     4
	   /   \
	  7     2
	 / \   / \
	9   6 3   1

*/

class TreeNode {
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

class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return root;
		else {
			invertTree(root.left);
			invertTree(root.right);
			TreeNode temp = new TreeNode();
			temp.right = root.right;
			root.right = root.left;
			root.left = temp.right;
			return root;
		}
	}
}
