package com.xiaozhao.aiqiyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
   public static void main(String[] args) throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int N = Integer.parseInt(br.readLine());
	  int arr[] = new int[N];
	  String s = br.readLine();
	  String sarr[] = s.split(" ");
	  for(int i = 0; i < N; i++) {
		  arr[i] = Integer.parseInt(sarr[i]);
		  arr[i] = findMax(arr[i]);
	  }
	  int max = arr[0];
	  for(int i=1;i<N;i++) {
		  max = Math.max(max, arr[i]);
	  }
	  System.out.println(max);
}
   public static int findMax(int input) {
	   int length = 1, tmp = input;
	   while(tmp/10 != 0) {
		   length++;
		   tmp = tmp/10;
	   }
	   int arr[] = new int[length];
	   for(int i=0;i<length;i++) {
		   arr[i] = input%10;
		   input = input/10;
	   }
	   for(int i = 0;i<length-1;i++) {
		   for(int j=i+1;j<length;j++) {
			   if(arr[i]>arr[j]) {
				   int copy = arr[i];
				   arr[i] = arr[j];
				   arr[j] = copy;
			   }
		   }
	   }
	   int ret = 0;
	   for(int i=0;i<length;i++) {
		   if(arr[i] != 0) {
			   ret = ret*10 + arr[i];
		   }
	   }
	   return ret;
   }
}
