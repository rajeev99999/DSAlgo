package com.company.Recursion;

import java.util.Stack;

public class ReverseAstackWithoutExtraSpace {
    public void insertAtBottom(Stack<Integer> stack,int num){
        if(stack.size()==0){
            stack.push(num);
        }
        int temp = stack.pop();
        insertAtBottom(stack,num);
        stack.push(temp);

    }
    public void reverseStack(Stack<Integer> stack){
        if(stack.size()==1)
            return;
        int temp=stack.pop();
        reverseStack(stack);
        insertAtBottom(stack,temp);
    }
}

