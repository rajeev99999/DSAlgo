package com.company.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> queue = new LinkedList<>();
    public void push(int d){
        int s = queue.size();
        queue.add(d);
        while(s-->0){
            int temp=queue.remove();
            queue.add(temp);
        }

    }
    
    public int pop(){
        return queue.remove();
    }
}
