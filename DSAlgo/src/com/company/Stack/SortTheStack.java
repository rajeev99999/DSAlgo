package com.company.Stack;

import java.util.Stack;

public class SortTheStack {
    static void sortInserted(Stack<Integer> stack,int num){
        if(stack.isEmpty() || num>stack.peek()){
            stack.push(num);
            return;
        }
        int temp = stack.pop();
        sortInserted(stack, num);
        stack.push(temp);
    }
    static void sort(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int num= stack.pop();
            sort(stack);
            sortInserted(stack,num);
        }
    }

    static Stack<Integer> using2Stacks(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();
        while(!stack.isEmpty()){
            int temp = stack.pop();
            while(!tempStack.isEmpty() && tempStack.peek()>stack.peek()){
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }

}
