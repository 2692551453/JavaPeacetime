package com.niukezuoti;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//从上往下打印出二叉树的每个节点，同层节点从左至右打印
public class PrintTreeFromTopToBottom {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		if (root == null)
			return list;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		TreeNode tmp;
		while (!queue.isEmpty()) {
			tmp = queue.poll();
			list.add(tmp.val);
			if (tmp.left != null)
				queue.offer(tmp.left);
			if (tmp.right != null)
				queue.offer(tmp.right);
		}
		return list;
	}

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(10);
		TreeNode t2 = new TreeNode(6);
		TreeNode t3 = new TreeNode(14);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(8);
		TreeNode t6 = new TreeNode(12);
		TreeNode t7 = new TreeNode(16);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		ArrayList<Integer> list = new PrintTreeFromTopToBottom().PrintFromTopToBottom(t1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
