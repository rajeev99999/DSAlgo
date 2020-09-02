package com.company.Stack;

import java.util.Stack;

public class NextSmallestToright {
    int[] nextSmallestToright(int [] array){
        Stack<Integer> stack = new Stack<>();
        int right[] = new int[array.length];

        for(int i=array.length-1;i>=0;i--){
            while(!stack.isEmpty() && array[i]<= array[stack.peek()]){

                stack.pop();
            }
            if(!stack.isEmpty()){
                right[i]=stack.peek();
            }
            else{
                right[i]=array.length;
            }
            stack.push(i);
        }


        return right;
    }
}
