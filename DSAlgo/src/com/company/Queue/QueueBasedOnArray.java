package com.company.Queue;

public class QueueBasedOnArray {
    int front,rear,size;
    int capacity;
    int[] queue;
    QueueBasedOnArray(){
        front= this.size=0;
        rear = capacity-1;
        queue = new int[capacity];
    }
    public boolean isFull(){
        return size==capacity;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void enqueue(int d){
        if(isFull())
            return;
        this.rear= (this.rear+1)%capacity;
        this.queue[this.rear]= d;
        this.size++;
    }
    public int dequeue(){
        if(isEmpty())
            return Integer.MIN_VALUE;
        int d= this.queue[this.front];
        this.front = (this.front+1)%capacity;
        this.size--;
        return d;
    }
    public int front(){
        if(isEmpty())
            return Integer.MIN_VALUE;
        return this.queue[this.front];
    }
    public int rear(){
        if(isEmpty())
            return Integer.MIN_VALUE;
        return this.queue[this.rear];
    }
}

