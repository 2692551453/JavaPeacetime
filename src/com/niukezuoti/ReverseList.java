package com.niukezuoti;

//输入一个链表，反转链表后，输出链表的所有元素。
public class ReverseList {
	   public ListNode reverseList(ListNode head) {
			if (head == null)
				return null;
			ListNode pre = null;
			ListNode p = null;
			while (head != null) {
				p = head;
	            head = head.next;//这一句必须在p.next = pre之前
				p.next = pre;
				pre = p;
			}
			return pre;
		}
	}
