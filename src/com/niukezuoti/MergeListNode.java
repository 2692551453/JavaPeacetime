package com.niukezuoti;

//输入两个单调递增的链表，输出两个链表合成后的链表，需要合成后的链表满足单调不减规则。
public class MergeListNode {
	public ListNode Merge(ListNode list1, ListNode list2) {
		
//		 if(list1 == null){
//	           return list2;
//	       }
//	       if(list2 == null){
//	           return list1;
//	       }
//	       if(list1.val <= list2.val){
//	           list1.next = Merge(list1.next, list2);
//	           return list1;
//	       }else{
//	           list2.next = Merge(list1, list2.next);
//	           return list2;
//	       }
		
		if (list1 == null) {
			return list2;
		} else if (list2 == null) {
			return list1;
		} else {
			ListNode ret = null;
			ListNode tail = ret;
			while (list1 != null && list2 != null) {
				if (list1.val < list2.val) {
					tail = list1;
					list1 = list1.next;
					tail = tail.next;
				} else {
					tail = list2;
					list2 = list2.next;
					tail = tail.next;
				}
			}
			if (list1 == null) {
				tail = list2;
			} else {
				tail = list1;
			}
			return ret;
		}
	}

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		listNode1.next = new ListNode(3);
		listNode1.next.next = new ListNode(5);
		ListNode listNode2 = new ListNode(2);
		listNode2.next = new ListNode(4);
		listNode2.next.next = new ListNode(6);
		ListNode listNode = new MergeListNode().Merge(listNode1, listNode2);
		while (listNode != null) {
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
	}
}
