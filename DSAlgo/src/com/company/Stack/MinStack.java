package com.company.Stack;

import java.util.Stack;

public class MinStack {
    private int top;
    Stack<Integer> stack;
    int stackArray[];
    MinStack(){
        this.top=-1;
        stack = new Stack<Integer>();
        stackArray = new int[10000];
    }
    public void push(int d){
        if(top==-1){
            stackArray[++top]=d;
            stack.push(d);
        }
        else {
            stackArray[++top]=d;
            if(stack.peek()>=d){
                stack.push(d);
            }
        }
    }
    public void pop(){
        if(stack.peek()!=stackArray[top]){
            top = top -1;
        }
        else {
            top--;
            stack.pop();
        }
    }
    public int getMin(){
        return stack.peek();
    }
}
