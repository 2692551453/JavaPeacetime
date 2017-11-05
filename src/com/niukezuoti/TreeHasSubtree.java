package com.niukezuoti;

//输入两棵二叉树A，B，判断B是不是A的子结构
public class TreeHasSubtree {
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		if (root1 != null && root2 != null) {
			if (root1.val == root2.val) {
				result = Checknext(root1, root2);
			}
			if (!result) {
				result = HasSubtree(root1.left, root2);
			}
			if (!result) {
				result = HasSubtree(root1.right, root2);
			}
		}
		return result;
	}

	public boolean Checknext(TreeNode root1, TreeNode root2) {
		if (root2 == null)
			return true;
		if (root1 == null)
			return false;
		if (root1.val != root2.val)
			return false;
		return Checknext(root1.left, root2.left) && Checknext(root1.right, root2.right);
	}
}
