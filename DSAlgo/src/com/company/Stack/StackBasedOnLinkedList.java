package com.company.Stack;

public class StackBasedOnLinkedList {
    StackNode top;
    static class StackNode{
        int data;
        StackNode next;
        StackNode(int data){
            this.data=data;
        }
    }
    public boolean isEmpty(){
        return (top==null);
    }
    public void push(int d){
        StackNode stackNode = new StackNode(d);
        if(top==null){
            top = stackNode;
        }
        stackNode.next= top;
        top = stackNode;
        System.out.println("pushed ont ot the stack"+ d);
    }
    public int pop(){
        int popped = Integer.MIN_VALUE;
        if(top == null){
            System.out.println("Stack is empty");
            return popped;
        }
        popped = top.data;
        top = top.next;
        return popped;
    }
    public int peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return top.data;
    }
}
