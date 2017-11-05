package com.suanfa;

import java.util.ArrayList;
/*
 * 计算两个数组交集
 */
public class Test1 {
	public static ArrayList<Integer> mixed(int array1[], int array2[]) {
		ArrayList<Integer> mix = new ArrayList<Integer>();
		int n1 = 0, n2 = 0;
		int length1 = array1.length, length2 = array2.length;
		while (n1 < length1 && n2 < length2) {
			if (array1[n1] == array2[n2]) {
				mix.add(array1[n1]);
				n1++;
				n2++;
			} else if (array1[n1] < array2[n2]) {
				n1++;
			} else {
				n2++;
			}
		}
		return mix;
	}

	public static void main(String[] args) {
		int a[] = { 0, 1, 2, 3, 4 };
		int b[] = { 1, 3, 5, 7, 9 };
		ArrayList<Integer> mix = mixed(a, b);
		for (int i = 0; i < mix.size(); i++) {
			System.out.print(mix.get(i) + " ");
		}
	}
}
