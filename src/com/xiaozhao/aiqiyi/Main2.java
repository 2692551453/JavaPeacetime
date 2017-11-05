package com.xiaozhao.aiqiyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main2 {
   public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String s = br.readLine();
	   int count=-1;
	   char carr[] = s.toCharArray();
	   Set<Character> set = new HashSet<>();
	   Set<String> set1 = new HashSet<>();
	   for(int i = 0;i<carr.length;i++) {
		   set.add(carr[i]);
	   }
	   if(set.size()==0) {
		   count=0;
	   }else if(set.size()<4) {
		   count = 1;
	   }else {
		  count++;
		  while(true) {
			  int max = 1;
			  StringBuffer stringBuffer = new StringBuffer();
			  for(int i = 0;i<carr.length-max;i++) {
				  for(int j=i;j<=max;j++) {
					  stringBuffer.append(carr[j]);
				  }
				  set1.add(new String(stringBuffer));
			  }
			  if(set1.size()<Math.pow(4, max+1)) {
				  count++;
				  max++;
				  set1.clear();
			  }else {
				break;
			}
		  }
	}
	   System.out.println(count);
}
}
