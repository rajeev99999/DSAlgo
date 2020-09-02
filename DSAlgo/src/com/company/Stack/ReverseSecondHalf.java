package com.company.Stack;

import java.util.Stack;

public class ReverseSecondHalf {

    static void pushToTheSecondHalf(Stack<Integer> stack,int revSize,int num){
        if(stack.size()-1==revSize){
            stack.push(num);
            return;
        }
        int new_pop= stack.pop();
        pushToTheSecondHalf(stack,revSize,num);

        stack.push(new_pop);
    }
    static void reverseSecondHalf(Stack<Integer> stack,int revSize) {
        // Write your code here
        if(revSize<2){
            return;
        }
        if(stack.size()-1!=revSize){
            int num = stack.pop();
            reverseSecondHalf(stack,revSize);
            pushToTheSecondHalf(stack,revSize,num);
        }

    }
}
