package com.xiaozhao.aiqiyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
   public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String s = br.readLine();
	   char carr[] = s.toCharArray();
	   int count = 0;
	   for(int i=0;i<carr.length;i++) {
		   if(carr[i] == '(') {
			   count++;
		   }else {
			   count--;
		   }
	   }
	   System.out.println(Math.abs(count));
}
}
