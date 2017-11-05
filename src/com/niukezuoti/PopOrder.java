package com.niukezuoti;

import java.util.Stack;

//输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序
public class PopOrder {

	/*
	 * 借用一个辅助的栈，遍历压栈顺序，先讲第一个放入栈中，这里是1，
	 * 然后判断栈顶元素是不是出栈顺序的第一个元素，这里是4，很显然1≠4，所以我们继续压栈，
	 * 直到相等以后开始出栈，出栈一个元素，则将出栈顺序向后移动一位，直到不相等，
	 * 这样循环等压栈顺序遍历完成，如果辅助栈还不为空，说明弹出序列不是该栈的弹出顺序。
	 */
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA.length == 0 || popA.length == 0)
			return false;
		Stack<Integer> s = new Stack<Integer>();
		// 用于标识弹出序列的位置
		int popIndex = 0;
		for (int i = 0; i < pushA.length; i++) {
			s.push(pushA[i]);
			// 如果栈不为空，且栈顶元素等于弹出序列
			while (!s.empty() && s.peek() == popA[popIndex]) {
				// 出栈
				s.pop();
				// 弹出序列向后一位
				popIndex++;
			}
		}
		return s.empty();
	}
}