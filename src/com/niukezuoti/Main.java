package com.niukezuoti;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static int getCount(String s) {
		int n = Integer.parseInt(s);
		int ret=0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				int tmp = fun(i, j);
				if(map.containsKey(tmp)) {
					map.put(tmp, map.get(tmp)+1);
				}else {
					map.put(tmp, 1);
				}
			}
		}
		Iterator iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry entry = (Map.Entry)iterator.next();
			int var = (Integer)entry.getValue();
			ret += fun(var, var);
		}
		return ret;
	}
	public static int fun(int a,int b) {
		int ret=1;
		for(int i=0;i<b;i++) {
			ret*=a;
		}
		return ret;
	}
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 String input = in.nextLine();
		 int sum = getCount(input);
		 System.out.println(sum);
	}
}
