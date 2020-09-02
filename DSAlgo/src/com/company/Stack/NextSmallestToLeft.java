package com.company.Stack;

import java.util.Stack;

public class NextSmallestToLeft {
    int[] nextSmallestToleft(int [] array){

        Stack<Integer> stack = new Stack<>();
        int left[] = new int[array.length];

        for(int i=0;i<array.length;i++){
            while(!stack.isEmpty() && array[i]<= array[stack.peek()]){

                stack.pop();
            }
            if(!stack.isEmpty()){
                left[i]=stack.peek();
            }
            else{
                left[i]=-1;
            }
            stack.push(i);
        }


        return left;
    }
}
