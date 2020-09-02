package com.company.Stack;

public class StackBasedOnArray<T> {
    private static final int size =10000;
    int top;
    T array[];
    StackBasedOnArray(){
        this.top = -1;
        this.array = (T[]) new Object[size];
    }
    public  boolean isEmpty(){
        return (top < 0);
    }
    public  boolean push(T d){
        if(top >= size-1){
            System.out.println("Stack Overflow");
            return false;
        }
        array[++top]=d;
        return true;
    }
    public T pop(){
        if(top < 0){
            System.out.println("Stack underflow");
            return null;
        }
        T x = array[--top];
        return x;
    }

    public T peek(){
        if(top < 0){
            System.out.println("Stack underflow");
            return null;
        }
        return array[top];
    }

}
