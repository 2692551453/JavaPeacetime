package com.niukezuoti;

//求二叉树的镜像
public class MirrorTree {
	public void Mirror(TreeNode root) {
		if (root == null)
			return;
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		Mirror(root.right);
		Mirror(root.left);
	}
}