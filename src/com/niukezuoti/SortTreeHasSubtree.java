package com.niukezuoti;

//输入两棵二叉排序树A，B，判断B是不是A的子结构
public class SortTreeHasSubtree {
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		if (root1 == null || root2 == null)
			return false;
		if (root1.val == root2.val) {
			if(root2.left != null) {
				return HasSubtree(root1.left, root2.left);
			}else if(root2.right != null) {
				return HasSubtree(root1.right, root2.right);
			}else {
				return true;
			}
			
		} else if (root1.val < root2.val) {
			if (root1.right != null) {
				return HasSubtree(root1.right, root2);
			}
			return false;
		} else {
			if (root1.left != null) {
				return HasSubtree(root1.left, root2);
			}
			return false;
		}
	}

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		TreeNode t7 = new TreeNode(7);
		TreeNode root1 = t4;
		t4.left = t2;
		t2.left = t1;
		t2.right = t3;
		root1.right = t6;
		t6.left = t5;
		t6.right = t7;
		TreeNode root2 = t2;
		root2.left = t1;
		root2.right = t3;
		System.out.println(new SortTreeHasSubtree().HasSubtree(root1, root2));
	}
}
