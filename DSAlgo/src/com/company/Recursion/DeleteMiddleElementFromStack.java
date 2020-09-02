package com.company.Recursion;

import java.util.Stack;

public class DeleteMiddleElementFromStack {
    public void deleteMiddileElement(Stack<Integer> stack,int k){   // k= (size/2)+1
     if(k==1){
         stack.pop();
         return;
     }

        int temp = stack.pop();
        deleteMiddileElement(stack,k-1);
        stack.push(temp);
    }
}
