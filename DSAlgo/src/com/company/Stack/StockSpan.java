package com.company.Stack;

import java.util.Stack;

public class StockSpan {
    public int[] StockSpan(int [] stockPerday){
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[stockPerday.length];
        stack.push(0);
        ans[0]=1;
        for (int i = 0; i <stockPerday.length ; i++) {
            while (!stack.isEmpty() && stockPerday[i]>=stockPerday[stack.peek()])
                stack.pop();
            ans[i] = (stack.isEmpty())?(i+1):(i-stack.peek());
            stack.push(i);
        }
        return ans;
    }
}
