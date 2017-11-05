package com.suanfa;

import java.util.Stack;

public class StackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
       if(stack2.isEmpty()) {
    	   if(stack1.isEmpty()) {
    		   return -1;
    	   }else {
    		   while(!stack1.isEmpty()) {
           		stack2.push(stack1.pop());
           	}
		}
       }
       return stack2.pop();
    }
}