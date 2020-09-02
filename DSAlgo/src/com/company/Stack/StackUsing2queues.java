package com.company.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2queues {
    Queue<Integer> queue1 = new LinkedList();
    Queue<Integer> queue2 = new LinkedList();

    public void push(int d){
        queue2.add(d);
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp= queue1;
        queue1=queue2;
        queue2=temp;
    }
    public int pop(){
        int popped= queue1.remove();
        return popped;
    }

    public void push1(int d){
        queue1.add(d);
    }
    public int pop1(){
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
        int popped = queue1.remove();
        Queue<Integer> temp= queue1;
        queue1=queue2;
        queue2=temp;
        return popped;
    }
}
