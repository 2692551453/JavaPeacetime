package com.suanfa;

import java.util.HashMap;

public class wanwan {
   public static void main(String[] args) {
	String aa = "abc";
	StringBuffer stringBuffer = new StringBuffer("abc");
	System.out.println(aa.equals(stringBuffer));
	HashMap<Integer, Integer> hashMap= new HashMap<>();
	hashMap.put(1, 2);
	char c = 12;
	int i = c;
	System.out.println(i);
	String s1 = "Programming";
    String s2 = new String("Programming");
    String s3 = "Program";
    String s4 = "ming";
    String s5 = "Program" + "ming";
    String s6 = s3 + s4;
    System.out.println(s1 == s2);
    System.out.println(s1 == s5);
    System.out.println(s1 == s6);
    System.out.println(s1 == s6.intern());
    System.out.println(s2 == s2.intern());
    System.out.println(s1.hashCode());
    System.out.println(s6.hashCode());
    System.out.println(s1.equals(s6));
    System.out.println(s6.intern().hashCode());
    int a = -2;
    String string = Integer.toBinaryString(a);
    char[] achar =string.toCharArray();
    System.out.println(Integer.toBinaryString(a));
   }
}
