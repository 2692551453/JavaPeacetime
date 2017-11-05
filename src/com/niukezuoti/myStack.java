package com.niukezuoti;

import java.util.Stack;

//定义栈的数据结构，在该类型中实现一个能够得到栈最小元素的min函数。
public class myStack {
	private Stack<Integer> data_stack = new Stack<Integer>();
	private Stack<Integer> min_stack = new Stack<Integer>();

	/*
	 * 当每次压入数据栈的元素小余辅助站的元素的时候，才把新元素压入辅助栈 否则把辅助站栈顶元素去到压入辅助栈，保持两个栈元素个数一致。 Stack.Peek 与
	 * stack.pop 的区别 相同点：大家都返回栈顶的值。 不同点：peek 不改变栈的值(不删除栈顶的值)，pop会把栈顶的值删除
	 */
	public void push(int node) {// 进栈
		if (min_stack.isEmpty() || min_stack.peek() >= node) {
			min_stack.push(node);
		} else {
			min_stack.push(min_stack.peek());
		}
		data_stack.push(node);
	}

	public void pop() {// 出栈
		if (data_stack.empty() || min_stack.empty())
			return;
		data_stack.pop();
		min_stack.pop();
	}

	public int top() {// 取得栈顶元素
		if (!data_stack.empty()) {
			return data_stack.peek();
		}
		return 0;
	}

	public int min() {// 取得最小值
		if (!min_stack.empty()) {
			return min_stack.peek();
		}
		return 0;
	}
}
