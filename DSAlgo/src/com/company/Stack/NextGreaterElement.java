package com.company.Stack;

import java.util.Stack;

public class NextGreaterElement {
    public void  nextGreaterElement(int [] array){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(array[0]);
        for(int i=1;i<array.length;i++){
            while (!stack.isEmpty() && array[i]>stack.peek()){
                System.out.println(stack.peek()+"-->"+array[i]);
                stack.pop();
            }
            stack.push(array[i]);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.peek()+"-->"+-1);
        }
    }

    public void NextGreaterElementCircular(int[] array){
        Stack<Integer> stack = new Stack<>();
        stack.push(array[0]);
        for(int i=1;i<array.length;i++){
            while(!stack.isEmpty() && array[i]>stack.peek()){
                System.out.println(stack.peek()+"--->"+array[i]);
            }
        }
        for(int i=0;i<array.length && !stack.isEmpty();i++){
            if(array[i]> stack.peek()){
                System.out.println(stack.peek()+"--->"+array[i]);

            }
        }
        while (!stack.isEmpty()){
            System.out.println(stack.peek()+"-->"+-1);
        }
    }
}
