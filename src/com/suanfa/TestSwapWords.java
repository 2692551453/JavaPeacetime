package com.suanfa;

public class TestSwapWords {
	public void swap(char[] cArr, int front, int end) {
		while (front < end) {
			char tmp = cArr[end];
			cArr[end] = cArr[front];
			cArr[front] = tmp;
			front++;
			end--;
		}
	}

	public String SwapWords(String s) {
		char[] cArr = s.toCharArray();
		swap(cArr, 0, cArr.length - 1);
		int begin = 0;
		for (int i = 1; i < cArr.length; i++) {
			// 判断char是否为空
			if (Character.isSpace(cArr[i])) {
				swap(cArr, begin, i - 1);
				begin = i + 1;
			}
		}
		// 最后一个单词还未纠正顺序
		swap(cArr, begin, cArr.length - 1);
		return new String(cArr);
	}

	public static void main(String[] args) {
		String string = "how are you";
		System.out.println(new TestSwapWords().SwapWords(string));
	}
}
