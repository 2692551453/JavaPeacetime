package com.niukezuoti;

public class shanglouti {
    public static int fun(int n) {
    	if(n==1) {
    		return 1;
    	}else if(n==2) {
    		return 2;
    	}else if(n==3) {
    		return 4;
    	}else{
    		return fun(n-1)+fun(n-2)+fun(n-3);
    	}
    }
    public static void main(String[] args) {
		System.out.println(fun(15));
	}
}
// Scanner in = new Scanner(System.in);