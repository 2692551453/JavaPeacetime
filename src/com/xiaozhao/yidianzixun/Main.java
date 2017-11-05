package com.xiaozhao.yidianzixun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String input = br.readLine();
    	int K = br.read() - '0';
    	char carr[] = input.toCharArray();
    	int arr[] = new int[carr.length];
    	K = carr.length - K;
    	for(int i = 0; i < carr.length; i++) {
    		arr[i] = carr[i] - '0';
    	}
    	int tmp;
    	for(int i = 0; i < K - 1; i++) {
    		for(int j = i + 1; j < arr.length; j++) {
    			if(arr[i] > arr[j]) {
    				tmp = arr[i];
    				arr[i] = arr[j];
    				arr[j] = tmp;
    			}
    		}
    	}
    	int minnumber = 0;
    	for(int i = 0; i < K; i++) {
    		minnumber = minnumber*10 + arr[i];
    	}
    	System.out.println(minnumber);
	}
}
