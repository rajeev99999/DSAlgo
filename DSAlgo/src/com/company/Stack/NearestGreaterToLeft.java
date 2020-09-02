package com.company.Stack;

import java.util.Stack;

public class NearestGreaterToLeft {
    public void nextGreaterElementToLeft(int [] array){
        Stack<Integer> stack = new Stack<>();
        stack.push(array[array.length-1]);
        for(int i=array.length-2;i>=0;i--){
            while (!stack.isEmpty() && array[i]>stack.peek()){
                System.out.println(stack.peek()+"---->"+array[i]);
                stack.pop();
            }
            stack.push(array[i]);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.peek()+"--->"+-1);
        }
    }
}
