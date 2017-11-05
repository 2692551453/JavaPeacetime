package com.xiaozhao.yidianzixun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		String ss1[] = s1.split(",");
		String ss2[] = s2.split(",");
		int length1 = ss1.length;
		int length2 = ss2.length;
		int arr[] = new int[length1 + length2];
		for (int i = 0; i < arr.length; i++) {
			if (i < length1) {
				arr[i] = Integer.parseInt(ss1[i]);
			} else {
				arr[i] = Integer.parseInt(ss2[i - length1]);
			}
		}
		int tmp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		if (arr.length % 2 == 0) {
			int index = arr.length / 2;
			System.out.println((arr[index] + arr[index - 1]) / 2);
		} else {
			System.out.println(arr[arr.length / 2]);
		}
	}
}
